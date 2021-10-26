select c.Customer_ID, c.Customer_Name, c.Mobile, s.Price from Customer_Info c, Sales_Info s
where c.Customer_ID=s.Customer_ID and s.Price<30000 order by c.Customer_ID;
