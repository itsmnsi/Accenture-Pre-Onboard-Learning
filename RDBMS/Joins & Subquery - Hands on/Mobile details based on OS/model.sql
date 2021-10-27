select m1.IME_No, m1.Model_Name, m1.Manufacturer, m1.Price from Mobile_Master m1, Mobile_Specification m2
where m1.Spec_No=m2.Spec_No and m2.OS='Android4S' order by m1.IME_No;
