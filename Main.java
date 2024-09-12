public class Main{
    public static void main(String[] args) {
        try {
            Manager manager = new Manager();
            manager.setName("John Lead");
            manager.setEmployeeID(101);
            manager.setBaseSalary(80000);
            manager.setBonus(15000);

            Developer developer = new Developer();
            developer.setName("Bob Smith");
            developer.setEmployeeID(102);
            developer.setHourlyRate(50);
            developer.setHoursWorked(100);


            System.out.println("Manager Information:");
            manager.displayInfo();

            System.out.println();

           System.out.println("Developer Information:");
            developer.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
