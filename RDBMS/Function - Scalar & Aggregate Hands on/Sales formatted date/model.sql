select SalesId, to_char(Sales_Date, 'yyyy-mm-dd') as FORMATTED_DATE from Sales_Info order by SalesId asc;
