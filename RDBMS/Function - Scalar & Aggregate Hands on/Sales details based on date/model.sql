select SalesId, IME_No, Sales_Date from Sales_Info where extract(month from Sales_Date)=2 and extract(year from Sales_Date)=2012 order by SalesId;
