package com.bank;


import java.util.Scanner;

public class Menu {
    private final Bank bank;

    public Menu() {
        this.bank = new Bank();
    }

    public void drive() {

        while (true) {
            showMenu();

            Scanner scanner = new Scanner(System.in);
            try {

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        this.addNewCustomer();
                        break;
                    case 2:
                        this.displayListOfCustomers();
                        break;
                    case 3:
                        this.searchCustomer();
                        break;
                    case 4:
                        this.deleteCustomer();
                        break;
                    case 5:
                        this.updateCustomer();
                        break;
                    case 6:
                        System.out.println("------------------Exiting---------------");
                        return;

                    default:
                        System.out.println("Invalid option selected. Try again");
                        break;
                }
            } catch (RuntimeException ex) {
                System.out.println("Invalid input. Only numbers: 1 to 5");
            }
        }
    }
    public void updateCustomer() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Updating Existing Customer:");
            System.out.println("*****************************");
            System.out.println("Enter customers Account Number: ");
            long accno = scanner.nextLong();
            System.out.println("Enter customers First Name: ");
            String fname = scanner.nextLine();
            System.out.println("Enter customers Last Name: ");
            String lname = scanner.nextLine();
            System.out.println("Enter customers Email: ");
            String email = scanner.nextLine();
            System.out.println("Enter customers City: ");
            String city = scanner.nextLine();
            System.out.println("Enter customers Contact: ");
            long contact = Long.parseLong(scanner.nextLine());
            System.out.println("Enter Account Type: ");
            String accountType = scanner.nextLine();
            System.out.println("Enter Account balance: ");
            double balance = scanner.nextInt();
            bank.updateCustomer(fname,lname, email,city, contact, accountType,balance,accno);

        } catch (RuntimeException re) {
            System.out.println("Invalid input. Only numbers.");
        }
    }

    public void showMenu() {
        System.out.println("Welcome to XYZM Bank");
        System.out.println("Please enter your choice");
        System.out.println("1.Add new customer");
        System.out.println("2.Display customers");
        System.out.println("3.Search customer");
        System.out.println("4.Delete customer");
        System.out.println("5.Update Existing Customer");
        System.out.println("6.Exit Application");
    }



    public void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Adding a new Customer:");
            System.out.println("*****************************");
            System.out.println("Enter customers First Name: ");
            String fname = scanner.nextLine();
            System.out.println("Enter customers Last Name: ");
            String lname = scanner.nextLine();
            System.out.println("Enter customers Email: ");
            String email = scanner.nextLine();
            System.out.println("Enter customers City: ");
            String city = scanner.nextLine();
            System.out.println("Enter customers Contact: ");
            long contact = Long.parseLong(scanner.nextLine());
            System.out.println("Enter Account Type: ");
            String accountType = scanner.nextLine();
            System.out.println("Enter Account balance: ");
            double balance = scanner.nextInt();
            bank.addCustomer(fname,lname, email,city, contact, accountType,balance);
        } catch (RuntimeException re) {
            System.out.println("Invalid input. Only numbers.");
        }
    }

    public void searchCustomer() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Customer AccountNumber (Search):");
            int id = scanner.nextInt();
            bank.displayCustomer(id);
        } catch (RuntimeException re) {
            System.out.println("Invalid input. Only numbers.");
        }
    }

    public void deleteCustomer() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Customer Account Number (Delete):");
            int id = scanner.nextInt();
            bank.deleteCustomer(id);
        } catch (RuntimeException re) {
            System.out.println("Invalid input. Only numbers.");
        }
    }

    public void displayListOfCustomers() {
        System.out.println("All Customers:");
        bank.displayListOfCustomers();
    }

}
