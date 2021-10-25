CREATE TABLE Sales_Info(
  SalesId number(10) PRIMARY KEY,
  Sales_Date date,
  IME_No varchar(10),
  FOREIGN KEY(IME_No) references Mobile_Master(IME_No),
  Price number(10),
  Discount number(10),
  Net_Amount number(10),
  Customer_ID varchar(10),
  FOREIGN KEY(Customer_ID) references Customer_Info(Customer_ID)
);
