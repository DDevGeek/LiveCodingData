import Interfaces.Car;

public class MonOct_7 {
    public static void main(String[] args) {
        FourDoorCar toyota1 = new FourDoorToyota("Toyota", "Gray", "330 mph", 2000, 30, 180);
        FourDoorCar fourDoorBM = new FourDoorBMW("BMW", "DarkRed", "200 mph", 2000, 30, 100);
        FourDoorCar fourDoorFord = new FourDoorFord("BMW", "DarkRed", "200 mph", 2000, 30, 7);
        FourDoorCar fourDoorHyundai = new FourDoorHyundai("BMW", "DarkRed", "300 mph", 2000, 30, 180);

        System.out.println();
        System.out.println("======== Four Door Cars ============");
        toyota1.run();
        toyota1.stop();
        toyota1.repair();

        Car toyota2 = new TwoDoorToyota("Toyota", "Gray", "330 mph", 2000, 30, 100);
        Car twoDoorBM2 = new TwoDoorBMW("BMW", "DarkRed", "200 mph", 2000, 30, 80);
        Car twoDoorFord2 = new TwoDoorFord("BMW", "DarkRed", "200 mph", 2000, 30, 75);
        Car twoDoorHyundai2 = new TwoDoorHyundai("BMW", "DarkRed", "300 mph", 2000, 30, 100);

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
    private int carPower;
    private int year;
    private int mileage;
    private int power;

    public TwoDoorCar(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carSpeed = carSpeed;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
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

    public int getCarPower() {
        return carPower;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
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
    public double sell() {
        return 0;
    }

//    @Override
//    public String toString() {
//        return "TwoDoorCar{" +
//                "carBrand='" + carBrand + '\'' +
//                ", carColor='" + carColor + '\'' +
//                ", carSpeed='" + carSpeed + '\'' +
//                '}';
//    }
}

abstract class FourDoorCar extends TwoDoorCar {

    public FourDoorCar(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
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

    @Override
    public double sell() {
        return 12000 + (( getYear() == 0 ? 0.001 : getYear() / getMileage() == 0 ? 0.0001 : getMileage() ) * getCarPower());
    }
}

class FourDoorToyota extends FourDoorCar {

    public FourDoorToyota(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }

}

class FourDoorBMW extends FourDoorCar {

    public FourDoorBMW(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}

class FourDoorFord extends FourDoorCar {

    public FourDoorFord(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}

class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}

// Two door classes ============

class TwoDoorToyota extends TwoDoorCar {

    public TwoDoorToyota(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}

class TwoDoorBMW extends FourDoorCar {

    public TwoDoorBMW(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return "Brand: " + this.getCarBrand() + "\n  " + "Speed: " + this.getCarSpeed() + "\n  " + "Color: " + this.getCarColor() + "\n  " +
                "Year: " + this.getYear() + "\n  " + "Mileage: " + this.getMileage() + "\n  " + "Power: " + this.getCarPower();
    }
}

class TwoDoorFord extends FourDoorCar {

    public TwoDoorFord(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}

class TwoDoorHyundai extends FourDoorCar {

    public TwoDoorHyundai(String carBrand, String carColor, String carSpeed, int year, int mileage, int power) {
        super(carBrand, carColor, carSpeed, year, mileage, power);
    }

    @Override
    public String toString() {
        return this.getCarBrand() + " " + this.getCarSpeed() + " " + this.getCarColor();
    }
}





