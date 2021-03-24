package Main;

import java.util.ArrayList;
import java.util.List;


public class EmployeeService {

    private  List<Employee> employeeList = new ArrayList();

    public List<Employee> addEmployeeToList(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    public int getAvarageSalary() {
        int size = employeeList.size();
        int totalSalary = 0;
        int avg;
        for (Employee employee : employeeList) {
            int salary = employee.getSalary();
            totalSalary = totalSalary + salary;
        }
        avg = totalSalary / size;
        return avg;
    }
}




