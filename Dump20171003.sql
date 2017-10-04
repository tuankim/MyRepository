-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: tuanfinal
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

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
-- Table structure for table `tuan_acquisitions`
--

DROP TABLE IF EXISTS `tuan_acquisitions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_acquisitions (
  Acquisition_ID int,
  Bank_ID int,
  Acquisition_Date text,
  Other_Details text,
  PRIMARY KEY (Acquisition_ID),
  
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_acquisitions`
--

LOCK TABLES `tuan_acquisitions` WRITE;
/*!40000 ALTER TABLE `tuan_acquisitions` DISABLE KEYS */;
INSERT INTO `tuan_acquisitions` VALUES (1,1,'20-10-2017','1');
/*!40000 ALTER TABLE `tuan_acquisitions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_addresses`
--

DROP TABLE IF EXISTS `tuan_addresses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_addresses (
  Address_ID int ,
  Line_1 text,
  Line_2 text,
  Town_City text,
  Zip_PostCode int,
  State_Provice_Contry text,
  Country text,
  Other_Details text,
  
  PRIMARY KEY (Address_ID)
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_addresses`
--

LOCK TABLES `tuan_addresses` WRITE;
/*!40000 ALTER TABLE `tuan_addresses` DISABLE KEYS */;
INSERT INTO `tuan_addresses` VALUES (1,'dong1','dong2','HN',100,'HN','VN','1',NULL);
/*!40000 ALTER TABLE `tuan_addresses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_banks`
--

DROP TABLE IF EXISTS `tuan_banks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_banks (
  Bank_ID int,
  Address_ID int,
  Bank_Name text,
  Bank_Details text,
  PRIMARY KEY (Bank_ID),
 
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_banks`
--

LOCK TABLES `tuan_banks` WRITE;
/*!40000 ALTER TABLE `tuan_banks` DISABLE KEYS */;
INSERT INTO `tuan_banks` VALUES (1,1,'mb','1');
/*!40000 ALTER TABLE `tuan_banks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_cart_centers`
--

DROP TABLE IF EXISTS `tuan_cart_centers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_cart_centers (
  Card_Center_ID int,
  Cart_Center_Details text,
  Amount int,
  PRIMARY KEY (Card_Center_ID)
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_cart_centers`
--

LOCK TABLES `tuan_cart_centers` WRITE;
/*!40000 ALTER TABLE `tuan_cart_centers` DISABLE KEYS */;
INSERT INTO tuan_cart_centers VALUES (1,'1',80);,(3,'2',200);
/*!40000 ALTER TABLE `tuan_cart_centers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_data_transfers`
--

DROP TABLE IF EXISTS `tuan_data_transfers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_data_transfers (
  Data_Tranfer_ID int,
  Acquisition_ID int,
  Merchants_ID int,
  Data_Transfer_Date text,
  Merchants_Fees text,
  Other_Detail text,
  PRIMARY KEY (Data_Tranfer_ID),
  
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_data_transfers`
--

LOCK TABLES `tuan_data_transfers` WRITE;
/*!40000 ALTER TABLE `tuan_data_transfers` DISABLE KEYS */;
INSERT INTO `tuan_data_transfers` VALUES (1,1,1,'20-10-2017','1','1');
/*!40000 ALTER TABLE `tuan_data_transfers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_merchants`
--

DROP TABLE IF EXISTS `tuan_merchants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_merchants (
  Merchant_ID int,
  Merchant_Name text,
  Other_Details text,
  Amount int ,
  PRIMARY KEY (Merchant_ID)
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_merchants`
--

LOCK TABLES `tuan_merchants` WRITE;
/*!40000 ALTER TABLE `tuan_merchants` DISABLE KEYS */;
INSERT INTO `tuan_merchants` VALUES (1,'1','1',120);
/*!40000 ALTER TABLE `tuan_merchants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_ref_transaction_types`
--

DROP TABLE IF EXISTS `tuan_ref_transaction_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_ref_transaction_types (
  Transaction_Type_Code int,
  Transaction_Type_Description text,
  PRIMARY KEY (Transaction_Type_Code)
) 
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_ref_transaction_types`
--

LOCK TABLES `tuan_ref_transaction_types` WRITE;
/*!40000 ALTER TABLE `tuan_ref_transaction_types` DISABLE KEYS */;
INSERT INTO `tuan_ref_transaction_types` VALUES (1,'1');
/*!40000 ALTER TABLE `tuan_ref_transaction_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan_transaction_data`
--

DROP TABLE IF EXISTS `tuan_transaction_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE tuan_transaction_data (
  Transaction_ID int ,
  Card_enter_ID int,
  Data_Transfer_ID int,
  Transaction_Type_Code int,
  Transaction_Date text,
  Transaction_Amount int,
  Other_Details text,
  PRIMARY KEY (Transaction_ID),
 
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan_transaction_data`
--

LOCK TABLES `tuan_transaction_data` WRITE;
/*!40000 ALTER TABLE `tuan_transaction_data` DISABLE KEYS */;
INSERT INTO `tuan_transaction_data` VALUES (22,1,1,1,'20-10-2017',100,'1'),(23,1,1,1,'20-10-2017',100,'1'),(24,1,1,1,'20-10-2017',100,'1'),(25,1,1,1,'20-10-2017',100,'1'),(26,1,1,1,'20-10-2017',100,'1'),(27,1,1,1,'20-10-2017',100,'1'),(28,1,1,1,'20-10-2017',100,'1'),(29,1,1,1,'20-10-2017',100,'1'),(30,1,1,1,'20-10-2017',100,'1'),(31,1,1,1,'20-10-2017',100,'1'),(32,1,1,1,'20-10-2017',100,'1'),(33,1,1,1,'20-10-2017',100,'1'),(34,1,1,1,'20-10-2017',100,'1'),(35,1,1,1,'20-10-2017',100,'1'),(36,1,1,1,'20-10-2017',100,'1'),(37,1,1,1,'20-10-2017',100,'1'),(38,1,1,1,'20-10-2017',20,'1'),(39,1,1,1,'20-10-2017',20,'1'),(40,1,1,1,'20-10-2017',100,'1'),(41,1,1,1,'20-10-2017',20,'1'),(42,1,1,1,'20-10-2017',20,'1');
/*!40000 ALTER TABLE `tuan_transaction_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-03  9:24:00
