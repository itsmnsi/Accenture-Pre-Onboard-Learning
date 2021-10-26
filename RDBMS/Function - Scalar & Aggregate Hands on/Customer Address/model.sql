select INITCAP(Customer_Name) as NAME, Address from Customer_Info where Address Like '%Chennai%' or Address like '%chennai%' order by Customer_Name asc;  
