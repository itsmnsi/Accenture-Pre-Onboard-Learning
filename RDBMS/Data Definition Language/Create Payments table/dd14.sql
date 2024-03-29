CREATE TABLE PAYMENTS(
  Payment_ID varchar2(3),
  CONSTRAINT PK_PAYMENTS PRIMARY KEY(Payment_ID),
  Ticket_ID varchar2(3),
  CONSTRAINT FK_PAYMENTS_TICKETS FOREIGN KEY(Ticket_ID) references TICKETS(TICKETS_ID),
  BD_ID number(11),
  CONSTRAINT FK_PAYMENTS_BOOKINGDETAILS FOREIGN KEY(BD_ID) references BOOKINGDETAILS(BD_ID),
  DISCOUNT_ID varchar2(3),
  CONSTRAINT FK_PAYMENTS_DISCOUNTS FOREIGN KEY(DISCOUNT_ID)references DISCOUNTS(DISCOUNT_ID)
);
