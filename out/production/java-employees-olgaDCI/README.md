## Exercise: Inheritance - Employees

#### Objective:

Practice inheritance by creating a hierarchy of employee classes.

#### Description:

You should create a set of employee classes using inheritance. There should be a base class Employee, and two derived classes: Manager and Developer. The base class Employee should have common attributes like name, employee ID, and methods to set these attributes. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific types of employees.

#### Guidelines:

1.	Create a base class Employee with the following attributes:
    - String name
    - int employeeID
2.	Implement the following methods in the Employee class:
    - public void setName(String name) - to set the name of the employee.
    - public void setEmployeeID(int employeeID) - to set the employee ID.
    - public void calculateSalary() - a placeholder method to calculate the salary. This method should be overridden by derived        classes.
    - public void displayInfo() - to display the name, employee ID, and salary of the employee.
4.	Create a derived class Manager that inherits from Employee and has the following additional attributes:
    - double baseSalary
    - double bonus
6.	Implement the following methods in the Manager class:
    - Override the calculateSalary() method to calculate the salary of the manager (base salary + bonus).
7.	Create another derived class Developer that inherits from Employee and has the following additional attributes:
    - double hourlyRate
    - int hoursWorked
8.	Implement the following methods in the Developer class:
    - Override the calculateSalary() method to calculate the salary of the developer (hourly rate * hours worked).
9.	In the main method, create instances of Manager and Developer, set their attributes, calculate salaries, and display their 
    information.
