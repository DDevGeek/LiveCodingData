import Interfaces.PhoneInt;

import Types.CallerType;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

abstract class SimplePhone implements PhoneInt {
    Scanner scanner = new Scanner(System.in);
    List<CallerType> contactList = new ArrayList<>();
    List<CallerType> callerHistory = new ArrayList<>();

    @Override
    public void call() {
        System.out.println("calling");
    }

    public void addContact(CallerType caller) {
        contactList.add(caller);
        System.out.println("Contact Saved");
    }

    public List<CallerType> getContactList() {
        return contactList;
    }

    public void addToCallerHistory(CallerType caller) {
        if (!callerHistory.contains(caller)) {
            callerHistory.add(caller);
            System.out.println(caller.getName() + " was added to the caller history");
        }
    }

    @Override
    public void text() {
        System.out.println("texting");
    }

    @Override
    public void showCallHistory() {
        System.out.println("history");
    }

    @Override
    public void showTextHistory() {
        System.out.println("messages");
    }
}

class JonathanPhone extends SimplePhone {

    public void contactListing(List<CallerType> contacts) {
        System.out.println();
        System.out.println("My Contacts");
        System.out.println("===============");
        for (int i = 0; i < contacts.size(); i++) {
            CallerType contact = contacts.get(i);
            System.out.println(i + ")" + " ==== " + contact.getName().toUpperCase() + " ====");
            System.out.println("Name: " + contact.getName());
            System.out.println("Age: " + contact.getAge());
            System.out.println("Location: " + contact.getLocation());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Contact ID " + contact.getCallerId());
            System.out.println();

        }
    }

    public void addContactMenu() {
        CallerType contact = new CallerType("", "", "", "");
        while (true) {
            System.out.println("Add Contact");
            System.out.println("=============");
            System.out.println();
            System.out.print("Name: ");
            contact.setName(scanner.nextLine());
            System.out.print("Age: ");
            contact.setAge(scanner.nextLine());
            System.out.print("Location: ");
            contact.setLocation(scanner.nextLine());
            System.out.print("Phone Number: ");
            contact.setPhoneNumber(scanner.nextLine());
            this.addContact(contact);
            break;
        }
    }

    public void callMenu() {
        int isCancel;
        int contactOption;
        List<CallerType> contacts = getContactList();
        while (true) {
            System.out.println("Choose caller");
            System.out.println("==================");
            System.out.println();
            contactListing(contacts);
            System.out.println();
            System.out.print("Who do you want to call? ");
            contactOption = scanner.nextInt();
            System.out.println("Calling " + contacts.get(contactOption).getName() + "😎☎️...");
            System.out.println();
            System.out.println("0 - Cancel Call");
            System.out.println();
            System.out.print("Yes: ");
            scanner.nextLine();
            isCancel = scanner.nextInt();
            System.out.println();
            if (isCancel == 0) {
                System.out.println("Canceling the call with " + contacts.get(contactOption).getName());
                break;
            }
            break;
        }
    }


    public void textMenu() {
        int contactToMessage;
        int messageOption;
        String message;
        List<CallerType> contacts = getContactList();
        while (true) {
            System.out.println("Choose caller");
            System.out.println("==================");
            System.out.println();
            contactListing(contacts);
            System.out.println();
            System.out.print("Who do you want to Text? ");
            contactToMessage = scanner.nextInt();
            System.out.println();
            System.out.println("Enter your message for " + contacts.get(contactToMessage).getName());
            System.out.print("_ ");
            message = scanner.nextLine();
            scanner.nextLine();
            System.out.println();
            System.out.println("1 - Send");
            System.out.println("2 - Discard");
            System.out.println();
            System.out.print("Send or Discard?: ");
            messageOption = scanner.nextInt();
            if (messageOption == 1) {
                System.out.println();
                System.out.println("Please wait...");
                System.out.println("Message sent successfully 📨😊✅");
                System.out.println();
                break;
            }

            if (scanner.nextInt() == 2) {
                System.out.println("Message Discarded");
                break;
            }

        }
    }

    public void phoneMenu () {
        int selectedOption;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Phone Menu");
            System.out.println("=============");
            System.out.println("1 - Add Contact");
            System.out.println("2 - Make Call");
            System.out.println("3 - Send Message");
            System.out.println("4 - View All Contacts");
            System.out.println("0 - Shutdown Phone");
            System.out.println();
            System.out.print("Select Option: ");
            selectedOption = scanner.nextInt();
            scanner.nextLine();
            switch (selectedOption) {
                case 1 -> {
                    addContactMenu();
                }

                case 2 -> {
                    callMenu();
                }

                case 3 -> {
                    textMenu();
                }

                case 4 -> {
                    List<CallerType> contacts = getContactList();
                    contactListing(contacts);
                }

                case 0 -> {
                    System.out.println("Shutting down...");
                    System.out.println("Arrivederci 😎👋");
                    isRunning = false;
                    System.exit(0);
                }
            }

        }

    }
}

class Init {
    public static void main(String[] args) {
        JonathanPhone jphone = new JonathanPhone();
        jphone.phoneMenu();
    }
}
