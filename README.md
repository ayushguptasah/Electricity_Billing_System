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

## Screenshots:

## SignUp
![Screenshot (107)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/f201f3cd-f1b9-4b70-a311-35acdbd9ed93)

## Login
![Screenshot (105)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/1d40a106-8cf1-4542-8fa3-e8ef1decfb17)

## Main Page
![Screenshot (108)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/bb973bea-cbd4-44de-ab0c-0e1e64785c4f)

## Add Customer
![Screenshot (109)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/68410d8b-3399-4872-b325-15bd876eb5e6)

## Calculate Bill
![Screenshot (110)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/7b8931de-6e88-4b35-83d9-e6dc42bb05c2)

## Customer Details
![Screenshot (113)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/5bafadc6-2acf-4e21-bc9a-040814a10f57)

## Generate Bill
![Screenshot (116)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/d8b54ed1-ecfb-4e32-8cd8-6f1349441008)

## Deposit Details
![Screenshot (117)](https://github.com/ayushguptasah/Electricity_Billing_System/assets/72430178/f4c741ee-361d-4516-9d84-2e83a6a43c7b)

