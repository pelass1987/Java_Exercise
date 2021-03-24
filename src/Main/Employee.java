package Main;

import java.util.Map;

public class Employee {

   private int id;
   private String name;
   private int salary;
   private Map<String, String> device;


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Employee(int id, String name, int salary, Map<String, String> device) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.device = device;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", device=" + device +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Map<String, String> getDevice1() {
        return device;
    }

    public void setDevice1(Map<String, String> device1) {
        this.device = device1;
    }
}
