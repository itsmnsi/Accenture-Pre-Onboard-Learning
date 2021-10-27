select distinct rate as SECOND_MAX
from CabinCost
where rate=(select max(rate) from CabinCost where rate<(select max(rate) from CabinCost));
