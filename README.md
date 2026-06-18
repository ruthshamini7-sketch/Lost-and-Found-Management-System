LOST AND FOUND MANAGEMENT SYSTEM

Project Title

Lost and Found Management System using Java

Abstract

The Lost and Found Management System is a Java-based application designed to help users report, search, and manage lost and found items efficiently. The system allows users to register, login, report lost items, report found items, search for items, and manage item details. It reduces manual searching and improves the process of recovering lost belongings.
The project is developed using Java with Object-Oriented Programming concepts and provides an organized way to maintain lost and found records.

Introduction

Losing personal belongings is a common problem in schools, colleges, offices, and public places. Traditional lost and found systems depend on manual records, which makes searching and tracking items difficult.
The Lost and Found Management System automates this process by allowing users to store item information digitally. Users can report lost items, upload item details, and search for matching found items.

Problem Statement

Manual lost and found management has several problems:
Difficult to maintain records
Time-consuming searching process
Chances of losing important information
No proper tracking of reported items
Difficult communication between finder and owner
To solve these problems, an automated Lost and Found Management System is developed.

Objectives

To automate lost and found item management.
To maintain item records digitally.
To help users report lost and found items.
To make searching items easier.
To reduce manual paperwork.
To improve the chances of recovering lost items.

Scope of the Project

The system can be used in:
Colleges
Schools
Offices
Organizations
Public places
The project can be extended with database integration, AI-based image matching, and mobile application support.

Technologies Used

Technology Purpose
Java
Programming Language
Java Swing
Graphical User Interface
OOP Concepts
Program Structure
MySQL
Database Storage
JDBC
Database Connectivity
NetBeans IDE

Development Environment

Functional Requirements
User Registration
Users can create an account by entering:
Username
Email
Password
User Login
Registered users can login using their username and password.
Report Lost Item
Users can report lost items by entering:
Item Name
Description
Lost Location
Date
Image

Report Found Item
Users can add found item details:
Item Name
Description
Found Location
Date
Image
Search Item
Users can search for lost or found items using item details.
View Item Details
Displays complete information about reported items.
Update Item
Users can update item information.
Delete Item
Users can remove unwanted records.
Logout
Users can securely exit their account.
Non-Functional Requirements
Easy to use
Fast execution
Secure login system
Reliable data management
User-friendly interface
Easy maintenance
System Design
Input
User information
Item details
Location details
Date information
Images
Process
Store user and item records
Perform CRUD operations
Search matching items
Manage lost and found information
 
 Output
 
Lost item reports
Found item reports
Search results
User details
Class Design
User Class
Attributes:
int userId
String username
String email
String password
Methods:
Register()
Login()
Logout()
Item Class
Attributes:
int itemId
String itemName
String description
String location
String date
String status
String imagePath

Methods:

Add Item()
Update Item()
Delete Item()
Search Item()
Main Class
Methods:
main()
Login Module
Registration Module
Lost Item Module
Found Item Module
Search Module

Algorithm

Step 1 Start the application.
Step 2 Display login and registration options.
Step 3 User enters login details.
Step 4 Verify user information.
Step 5 Display dashboard.
Step 6 Perform selected operation:
Report Lost Item
Report Found Item
Search Item
Update Item
Delete Item
Step 7Display result.
Step 8Logout and terminate.

Advantages

Reduces manual work
Faster searching
Digital record management
Easy tracking of items
Improves recovery process
User-friendly system

Limitations

Requires user registration
Depends on database availability
No real-time notification system
Limited security features

Future Enhancements

AI image matching using CNN
Mobile application
QR code based item verification
Email/SMS notification
Cloud database integration
Admin dashboard
Location tracking
Automatic item matching
Report generation

Sample Execution

===== LOST AND FOUND MANAGEMENT SYSTEM =====

1. Register
2. Login
3. Report Lost Item
4. Report Found Item
5. Search Item
6. View Reports
7. Logout

Enter Choice: 3

Enter Item Name: Wallet
Enter Description: Black leather wallet
Enter Location: College Library

Lost Item Report Added Successfully!
Testing
Test Case 1
Input: New User Registration
Expected Output: User Registered Successfully
Test Case 2
Input: Correct Login Details
Expected Output: Login Successful
Test Case 3
Input: Report Lost Item
Expected Output: Lost Item Added Successfully
Test Case 4
Input: Search Existing Item
Expected Output: Item Found
Test Case 5
Input: Delete Item Record
Expected Output: Item Deleted Successfully

Conclusion

The Lost and Found Management System is a Java-based application that provides an efficient solution for managing lost and found items. The project demonstrates Java programming concepts, Object-Oriented Programming, GUI development, database connectivity, and CRUD operations. It helps users easily report and recover lost belongings and can be further enhanced into a complete smart lost and found platform.
