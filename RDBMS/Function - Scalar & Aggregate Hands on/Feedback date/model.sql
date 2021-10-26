select Customer_ID, Sales_Date, add months(Sales_Date,3) as REVIEW_DATE from Sales_Info order by Customer_ID;
