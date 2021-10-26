select IME_No, Model_Name, Price, CASE
WHEN Price<10000 THEN 'Average Price'
WHEN Price>20000 THEN 'High Price'
ELSE 'Medium Price'
end as "Comment"
from Mobile_Master
order by IME_No;
