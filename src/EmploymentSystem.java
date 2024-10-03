public class EmploymentSystem {
    public static void main(String[] args) {

    }
}

abstract class Emplayee {
    double ID, salary;
    String name;

    public void calculateSalary() {

    }

}

interface FileOperations {
    void saveEmployeeToFile();
    void readEmployeesFromFile();
}

//class FullTimeEmployee extends Employee {
//
//}



//interface Class {
//    void takeAttendance();
//    void getAttendanceList();
//}
//
//class Mathematics implements Class {
//    @Override
//    public void takeAttendance() {
//        System.out.println("the attendance");
//    }
//
//    @Override
//    public void getAttendanceList() {
//        System.out.println("get the list");
//    }
//}
//
//class Italian implements Class {
//    @Override
//    public void takeAttendance() {
//        System.out.println("the attendance");
//    }
//
//    @Override
//    public void getAttendanceList() {
//        System.out.println("get the list");
//    }
//}


//
//
//1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
//implement that interface on 2 classes called "Math" and "Italian" respectively. write test cases.
