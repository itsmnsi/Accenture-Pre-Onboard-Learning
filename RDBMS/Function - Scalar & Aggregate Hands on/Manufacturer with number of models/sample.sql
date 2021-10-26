select Manufacturer, count(Manufacturer) as MOBILE_MODEL_COUNT from Mobile_Master group by Manufacturer order by MOBILE_MODEL_COUNT desc, Manufacturer asc; 
