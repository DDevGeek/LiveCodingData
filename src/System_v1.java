import java.util.Objects;

public class System_v1 {
    public static void main(String[] args) {
        Person person1 = new Person("Jonathan", "79", "john22", "myPassword");
        Person person2 = new Person("Jonathan", "79", "john22", "myPassword");
        Customer customer = new Customer("John", "25", "jeff2", "myPassword22");
        Customer customer2 = new Customer("John", "25", "jeff22", "myPassword22");
        Manager manager = new Manager("Granny", "75", "granny200", "password200");
        System.out.println(person1.equals(person2));
        System.out.println(customer2);
    }
}

class Person {
    final private String name, age, username, password;

    @Override
    public String toString() {
        return "Person: " + name + " Age: " + age;
    }


    public Person(String name, String age, String username, String password) {
        this.name = name;
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}

class Customer extends Person {
    final private int customerId;
    private double balance;

    public Customer(String name, String age, String username, String password) {
        super(name, age, username, password);
        this.customerId = (int)(Math.random() * 1000);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Customer ID: " + this.customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customer.getUsername(), this.getUsername()) && Objects.equals(customer.getPassword(), this.getPassword());
    }

}

class Manager extends Person {
    final private int managerId;
    private int actionNumber;

    public Manager(String name, String age, String username, String password) {
        super(name, age, username, password);
        this.actionNumber = 0;
        this.managerId = (int)(Math.random() * 1000);
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public double getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return "Manager ID: " + this.managerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) ||
                Objects.equals(manager.getManagerId(), this.getManagerId()) && Objects.equals(manager.getPassword(), this.getPassword());
    }

}



//zero when you created the object so it should assign 0 in the constructor)
//
////        Required extra functions: getActionNumber, setActionNumber and getManagerID
//
////        Overide toString again and print extra managerID
//override equals function and check if username and password matchs or managerIDand password match.  IF any of cases are correct we will return true.


