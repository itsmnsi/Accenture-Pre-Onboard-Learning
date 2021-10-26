select to_char(Sales_Date,'MON') as MONTH, sum(Net_Amount) as TURN_OVER from Sales_Info where (Sales_Date>add_months(trunc(sysdate),-12*1)) group by to_char(Sales_Date,'MON') order by TURN_OVER desc;
