CREATE DATABASE  IF NOT EXISTS `bancojogo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bancojogo`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: bancojogo
-- ------------------------------------------------------
-- Server version	5.5.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jogo`
--

DROP TABLE IF EXISTS `jogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jogo` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogo`
--

LOCK TABLES `jogo` WRITE;
/*!40000 ALTER TABLE `jogo` DISABLE KEYS */;
INSERT INTO `jogo` VALUES (1,'SpaceShipBattle'),(2,'RetroWar');
/*!40000 ALTER TABLE `jogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pontuacao`
--

DROP TABLE IF EXISTS `pontuacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pontuacao` (
  `Usuario_Nome` varchar(200) NOT NULL,
  `jogo_id` int(11) NOT NULL,
  `pontos` int(11) NOT NULL,
  PRIMARY KEY (`Usuario_Nome`,`jogo_id`),
  KEY `fk_Pontuacao_jogo1` (`jogo_id`),
  CONSTRAINT `fk_Usuario_has_Jogo1_Usuario` FOREIGN KEY (`Usuario_Nome`) REFERENCES `usuario` (`Nome`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Pontuacao_jogo1` FOREIGN KEY (`jogo_id`) REFERENCES `jogo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pontuacao`
--

LOCK TABLES `pontuacao` WRITE;
/*!40000 ALTER TABLE `pontuacao` DISABLE KEYS */;
INSERT INTO `pontuacao` VALUES ('Arthur',1,500),('Arthur',2,200),('Cristian',1,90),('Cristian',2,270),('Gabriel',1,580),('Gabriel',2,720),('Xande',1,868),('Xande',2,564);
/*!40000 ALTER TABLE `pontuacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `Nome` varchar(200) NOT NULL,
  `Senha` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Ativo` tinyint(4) NOT NULL,
  `PSeguranca` varchar(200) NOT NULL,
  `RSeguranca` varchar(200) NOT NULL,
  PRIMARY KEY (`Nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('Arthur','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','Email@123.com',1,'Qual o nome da sua primeira escola?','*667F407DE7C6AD07358FA38DAED7828A72014B4E'),('Cristian','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','teset@t.com',1,'Qual o nome da sua mãe?','*241E241B694B4F0B740CF5B9775AFD9A511E1CEC'),('Gabriel','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','Gabriel@g.com',1,'Qual o nome da sua primeira escola?','*12C072F2D0BB789BB7CC7C91448B2681EF81ACA1'),('Xande','*23AE809DDACAF96AF0FD78ED04B6A265E05AA257','Xande@x.com',1,'Qual o nome do seu ultimo animal de estimação?','*84869AED8A7235127BFD0AD4A55E335B29ADE3AD');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-12 17:13:07
