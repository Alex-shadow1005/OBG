package com.example.obg.controller;

import com.example.obg.exeptions.LoginExeption;
import com.example.obg.model.Employee;
import com.example.obg.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@RestController
@CrossOrigin
public class EmployeeController {
  @Autowired
  EmployeeRepository employeeRepository;

  @PostMapping("/createEmployee")
  @ResponseStatus(HttpStatus.CREATED)
  public Employee postEmployee(@RequestBody Employee employee){
  return employeeRepository.save(employee);
}

  //@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  @PostMapping("/loginEmployee")
  public ResponseEntity<Employee>loginEmployee(@RequestBody Employee employee) throws LoginException, LoginExeption {
    Employee verifyedEmployee = employeeRepository.findByEmailAndPasswordMatch(employee.getEmail(), employee.getPassword()).orElseThrow(() -> new LoginExeption("Employee not found"));
    return new ResponseEntity<>(verifyedEmployee, HttpStatus.OK);

  }


}
