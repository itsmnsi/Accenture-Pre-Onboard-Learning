select Customer_ID, Customer_Name, Address, Mobile, Email from Customer_Info where Address like '%Kolkata%' or address like '%Patna%' order by Customer_Name desc;
