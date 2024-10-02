public class System_v2 {
    public static void main(String[] args) {
        Dog myDog = new Dog("jaaz", "woooff");
        Cat myCat = new Cat("idefix", "miaow");
        Lion lion = new Lion("Simba", "rooor");
        myCat.action();
        myDog.action();
        lion.action();
    }
}

abstract class Student {
    private String name;
    private String age;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

abstract class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void action() {
        System.out.println("Animal behaviour");
    }
}

class Dog extends Animal {

    public Dog (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

class Cat extends Animal {
    public Cat (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

class Lion extends Animal {
    public Lion (String name, String sound) {
        super(name, sound);
    }

    @Override
    public void action() {
        System.out.println(name + " " + "sound " + this.sound);
    }
}

interface AnimalSpeed {
    void animalSpeed(String speed);
    void animalColor(String color);
}
