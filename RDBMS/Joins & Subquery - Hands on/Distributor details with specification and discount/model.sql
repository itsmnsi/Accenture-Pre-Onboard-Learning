select address, Manufacturer, Model_Name, Dimension, Discount
from Mobile_Master
inner join Distributor on distributor.Distributor_ID=mobile_master.Distributor_ID
inner join Sales_Info on mobile_master.IME_No=sales_info.IME_No
inner join Mobile_Specification on mobile_master.Spec_No=mobile_specification.Spec_No
order by Address;
