-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: kinomovies
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `movieid` int NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(255) NOT NULL,
  `movie_length` int NOT NULL,
  `description` varchar(255) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `pg_rating` varchar(255) NOT NULL,
  `release_date` int NOT NULL,
  `image_link` varchar(8000) NOT NULL,
  PRIMARY KEY (`movieid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (3,'42',42,'422','2','2',2,'https://gocook.dk/media/mshntyr3/ost_1.jpg?width=1920&heightratio=0.5625&mode=boxpad&bgcolor=fff&quality=80'),(5,'3',3,'3','3','3',3,'https://gocook.dk/media/mshntyr3/ost_1.jpg?width=1920&heightratio=0.5625&mode=boxpad&bgcolor=fff&quality=80'),(6,'5',5,'5','5','5',5,'https://gocook.dk/media/mshntyr3/ost_1.jpg?width=1920&heightratio=0.5625&mode=boxpad&bgcolor=fff&quality=80'),(7,'batman',32,'werjhw','fantasy','A',39,'https://gocook.dk/media/mshntyr3/ost_1.jpg?width=1920&heightratio=0.5625&mode=boxpad&bgcolor=fff&quality=80'),(8,'ost2',239,'ost','gyser','A',5,'https://gocook.dk/media/mshntyr3/ost_1.jpg?width=1920&heightratio=0.5625&mode=boxpad&bgcolor=fff&quality=80');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `showing`
--

DROP TABLE IF EXISTS `showing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `showing` (
  `showingid` int NOT NULL,
  `showing_date` date DEFAULT NULL,
  `showing_time` time DEFAULT NULL,
  `movieid` int DEFAULT NULL,
  PRIMARY KEY (`showingid`),
  KEY `FK94tij4tlq3gdie3ce1585wfiv` (`movieid`),
  CONSTRAINT `FK94tij4tlq3gdie3ce1585wfiv` FOREIGN KEY (`movieid`) REFERENCES `movie` (`movieid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `showing`
--

LOCK TABLES `showing` WRITE;
/*!40000 ALTER TABLE `showing` DISABLE KEYS */;
/*!40000 ALTER TABLE `showing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-22 12:31:21
