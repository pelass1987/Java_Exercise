package Main;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeFactory employeeFactory = new EmployeeFactory();

        employeeService.addEmployeeToList(employeeFactory.getEmployeeDeviceMap());
        System.out.println(employeeService.addEmployeeToList(employeeFactory.getEmployeeDeviceMap()));
        System.out.println("Avg salary from list is: " + employeeService.getAvarageSalary());

    }
}
