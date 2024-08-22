class Employee {
    protected String name;
    protected int employeeID;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double calculateSalary() {
        return 0f;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + calculateSalary());
    }
}
