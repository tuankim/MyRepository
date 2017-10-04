
CREATE TABLE tuan_acquisitions (
  Acquisition_ID UUID,
  Bank_ID UUID,
  Acquisition_Date text,
  Other_Details text,
  PRIMARY KEY (Acquisition_ID),
  
);

INSERT INTO tuan_acquisitions(Acquisition_ID,Bank_ID,Acquisition_Date,Other_Details) VALUES (blobAsUuid(timeuuidAsBlob(now())),ee8e04d0-a8f8-11e7-8cfe-a5f52bec59f9,'20-10-2017','1');


--
-- Table structure for table `tuan_addresses`
--

CREATE TABLE tuan_addresses (
  Address_ID UUID ,
  Line_1 text,
  Line_2 text,
  Town_City text,
  Zip_PostCode int,
  State_Provice_Contry text,
  Country text,
  Other_Details text,
  
  PRIMARY KEY (Address_ID)
) ;

INSERT INTO tuan_addresses(Address_ID,Line_1,Line_2,Town_City,Zip_PostCode,State_Provice_Contry,Country,Other_Details) VALUES (blobAsUuid(timeuuidAsBlob(now())),'dong1','dong2','HN',100,'HN','VN','1');


--
-- Table structure for table `tuan_banks`
--


CREATE TABLE tuan_banks (
  Bank_ID UUID,
  Address_ID UUID,
  Bank_Name text,
  Bank_Details text,
  PRIMARY KEY (Bank_ID),
 
);

INSERT INTO tuan_banks(Bank_ID,Address_ID,Bank_Name,Bank_Details) VALUES (blobAsUuid(timeuuidAsBlob(now())),70c93600-a8f8-11e7-8cfe-a5f52bec59f9,'mb','1');


--
-- Table structure for table `tuan_cart_centers`
--


CREATE TABLE tuan_cart_centers (
  Card_Center_ID UUID,
  Cart_Center_Details text,
  Amount int,
  PRIMARY KEY (Card_Center_ID)
) ;

INSERT INTO tuan_cart_centers (card_center_id,amount,cart_center_details) values(blobAsUuid(timeuuidAsBlob(now())), 100,'1');
--
-- Dumping data for table `tuan_cart_centers`
--


INSERT INTO tuan_cart_centers VALUES (1,'1',80);,(3,'2',200);

CREATE TABLE tuan_data_transfers (
  Data_Tranfer_ID UUID,
  Acquisition_ID UUID,
  Merchants_ID UUID,
  Data_Transfer_Date text,
  Merchants_Fees text,
  Other_Detail text,
  PRIMARY KEY (Data_Tranfer_ID),
  
) ;

INSERT INTO tuan_data_transfers(Data_Tranfer_ID,Acquisition_ID,Merchants_ID,Data_Transfer_Date,Merchants_Fees,Other_Detail) VALUES (blobAsUuid(timeuuidAsBlob(now())),2fe26a20-a8f9-11e7-8cfe-a5f52bec59f9,7ae8f520-a8f9-11e7-8cfe-a5f52bec59f9,'20-10-2017','1','1');


--
-- Table structure for table `tuan_merchants`
--

CREATE TABLE tuan_merchants (
  Merchant_ID UUID,
  Merchant_Name text,
  Other_Details text,
  Amount int ,
  PRIMARY KEY (Merchant_ID)
) ;

INSERT INTO tuan_merchants(Merchant_ID,Merchant_Name,Other_Details,Amount) VALUES (blobAsUuid(timeuuidAsBlob(now())),'1','1',120);



CREATE TABLE tuan_ref_transaction_types (
  Transaction_Type_Code UUID,
  Transaction_Type_Description text,
  PRIMARY KEY (Transaction_Type_Code)
) 

INSERT INTO tuan_ref_transaction_types(Transaction_Type_Code,Transaction_Type_Description) VALUES (blobAsUuid(timeuuidAsBlob(now())),'1');


CREATE TABLE tuan_transaction_data (
  Transaction_ID UUID ,
  Card_enter_ID UUID,
  Data_Transfer_ID UUID,
  Transaction_Type_Code UUID,
  Transaction_Date text,
  Transaction_Amount int,
  Other_Details text,
  PRIMARY KEY (Transaction_ID),
 
) ;

INSERT INTO tuan_transaction_data(Transaction_ID,Card_enter_ID,Data_Transfer_ID,Transaction_Type_Code,Transaction_Date,Transaction_Amount,Other_Details) VALUES (blobAsUuid(timeuuidAsBlob(now())),d1d787b0-a8f0-11e7-8cfe-a5f52bec59f9,f59a6970-a8f9-11e7-8cfe-a5f52bec59f9,a4987f30-a8f9-11e7-8cfe-a5f52bec59f9,'20-10-2017',20,'1');

