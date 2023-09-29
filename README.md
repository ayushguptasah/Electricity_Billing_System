# Electricity Billing System
This is a GUI made using Java Swing.
It lets User perform multiple operations like:-


1- User can Create his Personal login for security purposes.

2- User can Add customers and Calculate their Electricity Bill.

3- User can Pay Electricity Bills.

4- User can Generate Bill.

## About Project:
This Java application was created using Eclipse IDE.
Additional library was added for the support of JDBC (Required to setup the connection between the Database and Java Application).
It contains 16 different classes which works together to create a better user experience .

->Splash Screen class

->Signup class

->Login Screen class

->Project class

->New Customer class

->Update Information class

->Pay Bill class

->Generate Bill class

->View Information class

->Bill Details class

->Calculate Bill class

->Customer Details class

->Deposit Details

->Meter Information class

->Paytm class

->Connection Setup class(JDBC - MySQL)

## Database (MySQL)
Database for this Electricity Billing System contains 5 Tables


->Login Table (UserName, Password, Name, MeterNumber, UsreType)

->Bill Table(MeterNumber, Units, Month, TotalBill, Status)

->Customer Table(Name, MeterNumber, Address, State, City, Email, Phone)

->Meter Information Table(MeterNumber, MeterLocation, MeterType, PhaseCode, BillType, Days)

->Tax Table(cost_per_unit, meter_rent, service_charge, service_tax, swacch_bharat_cess, fixed_tax)

Java communicates with MySQL tables using JDBC which stands for Java Database Connectivity.
