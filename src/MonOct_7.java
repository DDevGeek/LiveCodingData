import Interfaces.Car;

public class MonOct_7 {
    public static void main(String[] args) {
        FourDoorCar toyota1 = new FourDoorToyota("Toyota", "Gray", "330 mph");
        FourDoorCar fourDoorBM = new FourDoorBMW("BMW", "DarkRed", "200 mph");
        FourDoorCar fourDoorFord = new FourDoorFord("BMW", "DarkRed", "200 mph");
        FourDoorCar fourDoorHyundai = new FourDoorHyundai("BMW", "DarkRed", "300 mph");

        System.out.println();
        System.out.println("======== Four Door Cars ============");
        toyota1.run();
        toyota1.stop();
        toyota1.repair();

        Car toyota2 = new TwoDoorToyota("Toyota", "Gray", "330 mph");
        Car twoDoorBM2 = new TwoDoorBMW("BMW", "DarkRed", "200 mph");
        Car twoDoorFord2 = new TwoDoorFord("BMW", "DarkRed", "200 mph");
        Car twoDoorHyundai2 = new TwoDoorHyundai("BMW", "DarkRed", "300 mph");

        System.out.println();
        System.out.println("======== Two Door Cars ============");
        twoDoorBM2.run();
        twoDoorBM2.stop();
        twoDoorBM2.repair();


    }
}


abstract class TwoDoorCar implements Car {

    private String carBrand;
    private String carColor;
    private String carSpeed;

    public TwoDoorCar(String carBrand, String carColor, String carSpeed) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carSpeed = carSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public void run() {
        System.out.println("The car is running");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping");
    }

    @Override
    public void repair() {
        System.out.println("Car is being repaired");
    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carSpeed='" + carSpeed + '\'' +
                '}';
    }
}

abstract class FourDoorCar extends TwoDoorCar {

    public FourDoorCar(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }

    @Override
    public void run() {
        System.out.println("======== " + this.getCarBrand() + " ============");
        System.out.println(this.getCarBrand() + " with the speed of " + this.getCarSpeed() + " is running ");
    }

    @Override
    public void stop() {
        System.out.println(this.getCarBrand() + " has stopped");
    }

    @Override
    public void repair() {
        System.out.println(this.getCarBrand() + " is being repaired");
    }
}

class FourDoorToyota extends FourDoorCar {

    public FourDoorToyota(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }

}

class FourDoorBMW extends FourDoorCar {

    public FourDoorBMW(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

class FourDoorFord extends FourDoorCar {

    public FourDoorFord(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

// Two door classes ============

class TwoDoorToyota extends TwoDoorCar {

    public TwoDoorToyota(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

class TwoDoorBMW extends FourDoorCar {

    public TwoDoorBMW(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

class TwoDoorFord extends FourDoorCar {

    public TwoDoorFord(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}

class TwoDoorHyundai extends FourDoorCar {

    public TwoDoorHyundai(String carBrand, String carColor, String carSpeed) {
        super(carBrand, carColor, carSpeed);
    }
}





