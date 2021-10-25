CREATE TABLE Mobile_Master(
  IME_No varchar(10) PRIMARY KEY,
  Model_Name varchar(20),
  Manufacturer varchar(20),
  Date_Of_Manufac date,
  Warranty_In_Years number(10),
  Price number(7,2)
  Distributor_ID varchar(10),
  FOREIGN KEY(Distributor_ID) references Distributor(Distributro_ID),
  Spec_No varchar(10),
  FOREIGN KEY(Spec_No) references Mobile_Specification(Spec_No)
);
