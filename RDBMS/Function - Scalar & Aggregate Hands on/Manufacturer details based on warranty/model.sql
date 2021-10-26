select Manufacturer, count(Model_Name) as TOTAL_COUNT from Mobile_Master group by Manufacturer having avg(Warranty_In_Years)>3;
