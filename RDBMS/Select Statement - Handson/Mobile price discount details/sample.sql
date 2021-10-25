select IME_No, Model_Name, Warranty_in_Years, Price, (Price*0.13) as discount from Mobile_Master where lower(Modell_Name) like 'samsung%';
