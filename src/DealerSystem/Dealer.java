package DealerSystem;

import Interfaces.Car;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DealerType {
    private String name, age, location, ratings;
    private double balance;
    String addedOn;

    public DealerType () {
        this.ratings = "0.0";
        this.balance = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.addedOn = LocalDateTime.now().format(formatter);
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

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getAddedOn() {
        return addedOn;
    }
}

public class Dealer {
    Map<String, DealerType> dealerList;
    Map<String, List<Car>> carList;
    private Dealer Instance;
    private Dealer(){}

    public void dealerMenu() {
        System.out.println("Welcome To Dealer System");
        System.out.println("==========================");
        System.out.println("1 - View All Cars");
        System.out.println("2 - Sell Car");
        System.out.println("3 - Add Car");
        System.out.println("0 - exit");
    }

    public void addCar(Car car, String dealerName) {
        List<Car> myCars = new ArrayList<>();
        myCars.add(car);
        carList.put(dealerName, myCars);
        System.out.println("Car added successfully");
    }

    public Dealer getInstance() {
        if (this.Instance == null) {
            dealerList = new HashMap<>();
            carList = new HashMap<>();
            Instance = new Dealer();
        }
        return Instance;
    }

}

class Dealers {
    Scanner scanner = new Scanner(System.in);
    List<DealerType> dealerList = new ArrayList<>();
    public static Dealers dealersInstance;

    private Dealers(){}

    public static Dealers getInstance () {
        if (dealersInstance == null) {
            dealersInstance = new Dealers();
        }
        return dealersInstance;
    }

    public void dealersMenu() {
        System.out.println("Welcome to dealers menu");
        System.out.println("=========================");
        System.out.println("1 - Add A Dealer");
        System.out.println("2 - Remove A Dealer");
        System.out.println("3 - View All Dealer");
        System.out.println("0 - exit");
    }

    public void addDealer(DealerType dealer) {
        dealerList.add(dealer);
        System.out.println(dealer.getName() + " added successfully");
    }

    public List<DealerType> viewAllDealer() {
        return dealerList;
    }

    public void removeDealer(DealerType dealer) {

        for (DealerType dl : dealerList) {
            if (dl.getName().equals(dealer.getName())) {
                dealerList.remove(dealer);
                System.out.println(dealer.getName() + " Removed successfully");
                break;
            }
        }
    }

    public void init() {
        int option;
        int dealerOption = 0;
        int confirmation;
        while (true) {
            this.dealersMenu();
            System.out.println();
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Add Dealer");
                    System.out.println("===============");
                    System.out.print("Name: ");
                    DealerType newDealer = new DealerType();
                    newDealer.setName(scanner.nextLine());
                    System.out.print("Age: ");
                    newDealer.setAge(scanner.nextLine());
                    System.out.print("Location: ");
                    newDealer.setLocation(scanner.nextLine());
                    this.addDealer(newDealer);
                }

                case 2 -> {
                    while(true) {
                        System.out.println("Remove A Dealer");
                        System.out.println("=====================");
                        System.out.println();

                        List<DealerType> dealers = this.viewAllDealer();
                        for (int i = 0; i < dealers.size(); i++) {
                            System.out.println(i + " - " + dealers.get(i).getName());
                        }
                        System.out.println(dealers.size() + 1 + " - Back");

                        System.out.print("Choose Dealer To Remove: ");
                        dealerOption = scanner.nextInt();
                        // Option to exit to the menu
                        if (dealerOption == dealers.size() + 1) {
                            break;
                        }

                        // checking if the chosen option is greater that the numbers of dealers we have at the moment
                        if (dealerOption > dealers.size()) {

                            System.out.println("The selected Dealer does not exist in the system");
                            System.out.println("- Please choose from the list");
                            System.out.println();
                            System.out.println("1 - Continue");
                            System.out.println("0 - Exit");
                            System.out.println();
                            System.out.print("What would you want to do: ");
                            int dx = scanner.nextInt();
                            scanner.nextLine();
                            if (dx == 1) {
                                continue;
                            }
                            if (dx == 0) {
                                break;
                            }

                        } else {
                            String dealerToDelete = dealers.get(dealerOption).getName();
                            System.out.println("Are you sure you want to delete " + dealerToDelete + " ?");
                            System.out.println();
                            System.out.println("1 - Yes");
                            System.out.println("2 - No");
                            System.out.println("0 - Exit");

                            confirmation = scanner.nextInt();
                            if (confirmation == 1) {
                                if (dealers.size() > dealerOption) {
                                    System.out.println("The selected Dealer does not exist in the system");
                                } else {
                                    this.removeDealer(dealers.get(dealerOption));
                                }
                            }

                            if (confirmation == 2) {
                                continue;
                            }

                            if (confirmation == 0) {
                                break;
                            }
                        }
                    }

                }

                case 3 -> {
                    System.out.println("List of Dealers");
                    System.out.println();
                    List<DealerType> dealers = this.viewAllDealer();
                    for (int i = 0; i < dealers.size(); i++) {
                        System.out.println("======== " + dealers.get(i).getName().toUpperCase() + " ==========");
                        System.out.println("  Name" + " - " + dealers.get(i).getName());
                        System.out.println("  Aage" + " - " + dealers.get(i).getAge());
                        System.out.println("  Location" + " - " + dealers.get(i).getLocation());
                        System.out.println("  Balance" + " - " + dealers.get(i).getBalance());
                        System.out.println("  Rating" + " - " + dealers.get(i).getRatings());
                        System.out.println("  Added on" + " - " + dealers.get(i).getAddedOn());
                        System.out.println();

                    }
                }

                case 0 -> {
                    System.out.println("Are you sure you want to exit the system?");
                    System.out.println("1 - Yes");
                    System.out.println("0 - No");
                    System.out.println();
                    System.out.print("Yes or No: ");
                    int sn = scanner.nextInt();
                    if (sn == 1) {
                        System.out.println("Shutting down the system...");
                        System.out.println("Arriverderci 😊");
                        System.exit(0);
                    }

                    if (sn == 0) {
                        continue;
                    }

                }

            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        Dealers dealers = Dealers.getInstance();
        dealers.init();
    }
}


