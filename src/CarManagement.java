import Interfaces.Car;

import java.util.*;

public class CarManagement {
    static Scanner scanner = new Scanner(System.in);
    static Dealer dealer = new Dealer();

    public static void main(String[] args) {
        Dealer dealer = new Dealer(30000, "John", "5.5");
        Car toyota2 = new TwoDoorToyota("Toyota", "Gray", "330 mph", 2000, 30, 100);
        Car twoDoorBM2 = new TwoDoorBMW("BMW", "DarkRed", "200 mph", 2000, 30, 80);
//        dealer.addCar(toyota2);
//        dealer.addCar(twoDoorBM2);
//        System.out.println(dealer);
        handler();
    }

    public static void dealerMenu() {
        if (dealer.getDealerName() == null) {
            System.out.println("Enter Your Information Bellow");
            System.out.println("================================");
            System.out.println();
            System.out.print("Enter your Name: ");
            dealer.setDealerName(scanner.nextLine());
        }

        System.out.println();
        System.out.println("Welcome " + dealer.getDealerName());
        System.out.println("===================================");
        System.out.println("1 - View All Cars");
        System.out.println("2 - Sell Car");
        System.out.println("3 - Add Car");
        System.out.println("0 - exit");
        System.out.println();

    }

    public static void addCarHandler() {
        String carName;
        String carColor;
        String carSpeed;
        int carYear;
        int carMileage;
        int carPower;

        System.out.println("Enter Car Information");
        System.out.println("==========================");
        System.out.println();
        scanner.nextLine();
        System.out.print("CarName: ");
        carName = scanner.nextLine();
        System.out.print("Car color: ");
        carColor = scanner.nextLine();
        System.out.print("Car Speed: ");
        carSpeed = scanner.nextLine();
        System.out.print("Car year: ");
        carYear = scanner.nextInt();
        System.out.print("Car Mileage: ");
        carMileage = scanner.nextInt();
        System.out.print("Car Power: ");
        carPower = scanner.nextInt();
        Car newCar = new TwoDoorBMW(carName, carColor, carSpeed, carYear, carMileage, carPower);
        dealer.addCar(newCar, "TwoDoorBMW");

    }

    public static void handler() {
        int option;

        while(true) {
            dealerMenu();
            System.out.print("Choose Option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(dealer.getDealerName() + " Bellow is a list of your cars");
                    System.out.println("=======================================");
                    System.out.println();
                    System.out.println(dealer.showAllCars());
                    break;
                case 2:
                    System.out.println("Selling Car");
                    break;
                case 3:
                    addCarHandler();
                    break;
                default:
                    System.out.println("Option selected does not exist");
                    break;
            }
        }
    }
}

class Dealer {
    private String dealerName;
    private String dealerRate;
    private int dealerBalance;
    final private Map<String, List<Car>> carList = new HashMap<>();

    public Dealer(int dealerBalance, String dealerName, String dealerRate) {
        this.dealerBalance = dealerBalance;
        this.dealerName = dealerName;
        this.dealerRate = dealerRate;
    }

    public Dealer() {

    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerRate() {
        return dealerRate;
    }

    public void setDealerRate(String dealerRate) {
        this.dealerRate = dealerRate;
    }

    public int getDealerBalance() {
        return dealerBalance;
    }

    public void setDealerBalance(int dealerBalance) {
        this.dealerBalance = dealerBalance;
    }

    public Map<String, List<Car>> showAllCars() {
        return carList;
    }

    public void addCar(Car car, String carCategory) {
        List<Car> carCategoryList = new ArrayList<>();
        carCategoryList.add(car);
        carList.put(carCategory, carCategoryList);
        System.out.println("Car added successfully");
    }

    @Override
    public String toString() {
        return "Dealer's Name: " + getDealerName() + "\n" +
                getDealerName() + "'s Balance " + getDealerBalance() + "\n" +
                getDealerName() + "'s Ratings " + getDealerRate() + "\n" +
                getDealerName() + "'s Cars" + showAllCars();
    }
 }

