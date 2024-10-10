package Types;

public class CallerType {
    private String name, age, location, phoneNumber;
    private double callerId;

    public CallerType(String name, String age, String location, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.callerId = Math.random() * 10000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCallerId() {
        return callerId;
    }
}