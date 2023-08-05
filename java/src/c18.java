
//assume c18 = credit card
import java.util.*;

public class c18 {
    Person owner;
    double balance, creditLimit;

    // Constructor to initialize a CreditCard object
    public void CreditCard(Person owner, double balance, double creditLimit) {
        this.owner = owner;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    // Real function start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input infomation of user
        System.out.println("Enter Person Name: ");
        String username = input.nextLine();
        System.out.println("Enter Person Surname: ");
        String surname = input.nextLine();
        System.out.println("Enter Person Age: ");
        int age = input.nextInt();

        // Consume the leftover line separator so it doesn't skip
        input.nextLine();

        System.out.println("Enter Address: ");
        String address = input.nextLine();

        System.out.println("=============================================================");
        System.out.println("Hello " + username);
        System.out.println("Enter Balances: ");
        double balance = input.nextDouble();
        System.out.println("Enter Credit Limit: ");
        double creditLimit = input.nextDouble();
        // Get the credit uses from the user
        System.out.println("Enter Credit Card Uses: ");
        double creditUses = input.nextDouble();
        // Create a CreditCard object
        Person person = new Person(username, surname, address, age);

        // Initialize the CreditCard using the void method
        c18 card = new c18();
        card.CreditCard(person, balance, creditLimit);

        // Display the person's information along with credit card details
        System.out.println("=============================================================");
        System.out.println("Person Name: " + card.getOwner().getName() + " " + card.getOwner().getSurname());
        System.out.println("Person Age: " + card.getOwner().getAge());
        System.out.println("Address: " + card.getOwner().getAddress());
        System.out.println("Credit Card Balance: $" + card.getBalance());
        System.out.println("Credit Card Credit Limit: $" + card.getCreditLimit());
        // Check if the credit uses exceed the credit limit
        if (creditUses > card.getCreditLimit()) {
            System.out.println("Error: Credit uses exceeds the credit limit. Please try again.");
        } else {
            // Update the credit balance
            card.balance -= creditUses;
            System.out.println("Credit Card Uses: $" + creditUses);
            System.out.println("Remaining Credit Card Balance: $" + card.getBalance());
        }
        System.out.println("=============================================================");

        input.close();
    }
}

class Person {
    String name, surname, address;
    int age;

    // Constructor to initialize a Person object
    public Person(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    // Getter methods for instance variables
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}