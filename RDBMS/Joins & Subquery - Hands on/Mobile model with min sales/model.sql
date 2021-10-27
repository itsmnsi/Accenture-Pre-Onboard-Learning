select m.Model_Name, count(SalesId) as MIN_SALES from Sales_Info s join Mobile_Master m
on s.IME_No=m.IME_No
group by m.model_name
having count(SalesId)=(select min(x) from (select m.model_name, count(SalesId) as
x from Sales_Info s join Mobile_Master m on s.IME_No=m.IME_No
group by m.model_name))
order by m.model_name desc;
