public class InheritanceChain {
    public static void main(String[] args) {
        Persons man1 = new Man("jonndoe", 20, "5.7", "11" );
        Persons woman1 = new Woman("jackelinne", 40, "5.7", "11");
        Persons man3 = new WorkerMan("jazz", 36, "5.7", "11", "8 hours");
        Persons womanWorker = new WomanWorker("Jasmine", 45, "5.7", "11", "7 hours");

        womanWorker.work();
        man3.work();
    }
}

abstract class Persons {
    String name;
    int age;
    String height;
    String IQ;

    public Persons(String name, int age, String height, String IQ) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.IQ = IQ;
    }

    // Temp solution
    public void work() {}
}

class Man extends Persons {

    public Man (String name, int age, String height, String IQ) {
        super(name, age, height, IQ);
    }

}

class WorkerMan extends Man {
    String workHours;
    public WorkerMan(String name, int age, String height, String IQ, String workHours) {
        super(name, age, height, IQ);
        this.workHours = workHours;
    }

    public void work() {
        System.out.println(this.name + " worked " + workHours);
    }
}

class Woman extends Persons {
    public Woman(String name, int age, String height, String IQ) {
        super(name, age, height, IQ);
    }
}

class WomanWorker extends Woman {
    String workHours;
    public WomanWorker(String name, int age, String height, String IQ, String workHours) {
        super(name, age, height, IQ);
        this.workHours = workHours;
    }

    public void work() {
        System.out.println(this.name + " worked " + workHours);
    }
}



//3 - Add working hours to worker classes and add a work() function. when we run work function we should see: "Name worked .. hours"
//
//All the objects will define by Person(Person objName = new Man();) somehow try to run work functions from the object that you created from Worker classes.
//

//Create abstract Person Class and inherit that by Man class than inherit that Man by WorkerMan.
//Inherit Person by Woman then inherit Women by WomanWorker.
//
//Create main function, in the main function create 6-7-8 people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)
