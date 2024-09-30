import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Department> deparmentsList = new ArrayList<>();

        Department department = new Department("Engineering");
        Employee employee = new Employee("Declan", "32562552");
        Employee employee2 = new Employee("jonathan", "32562552");
        Employee employee3 = new Employee("Waffi", "908878");
        Employee employee4 = new Employee("Prince", "87665");

        department.addEmployeeToTheDepartment(employee);
        department.addEmployeeToTheDepartment(employee2);
        department.addEmployeeToTheDepartment(employee3);
        department.addEmployeeToTheDepartment(employee4);
        deparmentsList.add(department);

        // NEW DEP 2
        Department department2 = new Department("FINANCE");
        Employee employee88 = new Employee("Melissa", "9800876");
        Employee employee5 = new Employee("Bata", "876755");
        Employee employee6 = new Employee("Alpha", "765344");
        Employee employee7 = new Employee("Dawood", "842542");

        department2.addEmployeeToTheDepartment(employee88);
        department2.addEmployeeToTheDepartment(employee5);
        department2.addEmployeeToTheDepartment(employee6);
        department2.addEmployeeToTheDepartment(employee7);
        deparmentsList.add(department2);



        // NEW DEP 3
        Department department3 = new Department("FINANCE SELING");
        Employee employee808 = new Employee("Melissa", "9800876");
        Employee employee69 = new Employee("Bata", "876755");
        Employee employee8 = new Employee("Alpha", "765344");
        Employee employee9 = new Employee("Dawood", "842542");

        department3.addEmployeeToTheDepartment(employee69);
        department3.addEmployeeToTheDepartment(employee808);
        department3.addEmployeeToTheDepartment(employee8);
        department3.addEmployeeToTheDepartment(employee9);
        deparmentsList.add(department3);

        for (int i =0; i < deparmentsList.size(); i++) {
            deparmentsList.get(i).listDepartmentEmployee();
        }
    }
}

class Employee {
    private String name;
    private String EmployeeId;

    public Employee(String name, String employeeId) {
        this.EmployeeId = employeeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", EmployeeId='" + EmployeeId + '\'' +
                '}';
    }
}

class Department {
    private String name;
    Set<Employee> employeesName = new HashSet<>();

    public Department (String name) {
        this.name = name;
    }



    public void addEmployeeToTheDepartment(Employee employee) {
        employeesName.add(employee);
    }

    public void removeEmployeeFromDepartment(Employee employee) {
        employeesName.remove(employee);
    }



    public void listDepartmentEmployee() {
        System.out.println("Department Name: " + name);
        System.out.println(employeesName);
    }
}

//class Company {
//    Map<String, Department> departmentName = new HashMap<>();
//
//}

//Create a class Department that contains:
//        -name (String)
//-employees (Set<Employee>)
//-Create a class Company that contains:
//
//A Map<String, Department> to track departments by their names.
//Features to Implement:
//        -Add an Employee to a Department: Allow the company to add an employee to a department.
//        -Remove an Employee from a Department: Allow the company to remove an employee from a department.
//        -List Employees by Department: Given a department, list all the employees in that department.