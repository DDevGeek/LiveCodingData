import java.util.List;
import java.util.ArrayList;

import Interfaces.Class;
import Interfaces.Person;


class Mathematics implements Class {
    List<String> attendanceList;

    public Mathematics() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Teacher implements Person {

    private String name;
    private String id;
    private int age;

    Teacher() {}

    public Teacher(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAttendanceString() {
        return this.name + " Attended class";
    }
}


class Students implements Person {
    private String name;
    private String id;
    private int age;

    public Students(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Students() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAttendanceString() {
        return this.name + " Attended class";
    }
}

class ClassMain {
    public static void main(String[] args) {
        Class mathClass = new Mathematics();
        Class italianClass = new Italian();

        Students stude1 = new Students();
        stude1.setName("Jonathan");
        stude1.setId("2000000");

        Students stude2 = new Students();
        stude2.setName("devianne");
        stude2.setId("25523299");

        Teacher teacher1 = new Teacher();
        teacher1.setName("jackleine");
        teacher1.setId("900988272");

        Teacher teacher2 = new Teacher();
        teacher2.setName("michaella");
        teacher2.setId("9675533");

        mathClass.takeAttendance(stude2);
        mathClass.takeAttendance(stude1);

        italianClass.takeAttendance(teacher1);
        italianClass.takeAttendance(teacher2);

        System.out.println(mathClass.getAttendanceList());
        System.out.println(italianClass.getAttendanceList());
    }
}

//2- Create 'Person' interface and that interface should have getAttandenceString() function.
//
//Create two class Teacher and  Student. Both should have necessary fields.
//
//Last step update the Italian and Math class's takeAttandence function's parameter to Person type and just call getAttandenceString()
