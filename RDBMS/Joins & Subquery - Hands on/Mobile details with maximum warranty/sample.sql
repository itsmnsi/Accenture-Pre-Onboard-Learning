select Distributor_Name, Model_Name, Price, Warranty_In_Years
from Mobile_Master, Distributor
where mobile_master.Distributor_ID=distributor.Distributor_ID
and Warranty_In_Years=(select max(Warranty_In_Years) from Mobile_Master)
order by Distributor_Name;
