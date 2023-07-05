package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean flag = true;
        int choice;

        while(flag) {
            details();
            System.out.print("Enter your choice: ");
            if(scanner.hasNextInt()) {

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        mobilePhone.printContacts();
                        break;
                    case 2:
                        addContact();
                        break;
                    case 3:
                        removeContact();
                        break;
                    case 4:
                        findContact();
                        break;
                    case 5:
                        updateContact();
                        break;
                    case 0:
                        flag = false;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Command");
                }
            } else {
                System.out.println("Please provide a valid input");
                break;
            }
        }
    }

    public static void details() {
        System.out.println("-------------------------");
        System.out.println("\t1. Print Contacts");
        System.out.println("\t2. Add Contacts");
        System.out.println("\t3. Remove Contacts");
        System.out.println("\t4. Find Contacts");
        System.out.println("\t5. Update Contact");
        System.out.println("\t0. Quit");
        System.out.println("-------------------------");
    }

    public static void addContact() {
        System.out.print("Enter name of the contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number of the contact: ");
        String phoneNumber = scanner.nextLine();
        if(!mobilePhone.addContact(name, phoneNumber)) {
            System.out.println(name + " is added to the contact list");
            mobilePhone.addContact(name, phoneNumber);
        } else {
            System.out.println(name + " is already in the list");
        }
    }

    public static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = scanner.nextLine();
        if(mobilePhone.removeContact(name) == 1) {
            System.out.println(name + " is removed from the list");
        } else {
            System.out.println(name + " is not in the list");
        }
    }

    public static void findContact() {
        System.out.print("Enter the name of the contact to find: ");
        String name = scanner.nextLine();

        if(mobilePhone.findContact(name) == 1) {
            int getIndexOfName = mobilePhone.getContact().getName().indexOf(name);
            System.out.println("Name: " + name + ", Phone Number: "
                    + mobilePhone.getContact().getPhoneNumber().get(getIndexOfName));
        } else {
            System.out.println(name + " is not found in the list");
        }
    }

    public static void updateContact() {
        System.out.print("Enter name of the contact to update: ");
        String name = scanner.nextLine();

        if (mobilePhone.findContact(name) == 1) {
            int getIndexOfName = mobilePhone.getContact().getName().indexOf(name);
            // this will give the index of the name
            System.out.print("Enter new name to update: ");
            String newName = scanner.nextLine();

            if(mobilePhone.findContact(newName) == 1) {
                System.out.println(newName + " is already in the list, update unsuccessful");
            } else {
                mobilePhone.getContact().getName().set(getIndexOfName, newName);

                System.out.print("Want to update phoneNumber as well? (true/false): ");
                String userResponse = scanner.nextLine();

                if(userResponse.equals("true") || userResponse.equals("True")
                        || userResponse.equals("yes") || userResponse.equals("Yes")) {
                    String userOldNumber = mobilePhone.getContact().getPhoneNumber().get(getIndexOfName);
                    int getIndexOfUserOldNumber = mobilePhone.getContact().getPhoneNumber().indexOf(userOldNumber);
                    System.out.print("Enter user's new number: ");
                    String newNumber = scanner.nextLine();
                    mobilePhone.getContact().getPhoneNumber().set(getIndexOfUserOldNumber, newNumber);
                    System.out.println("Successfully Updated the record");
                    System.out.println("Old Name: " + name + " is updated with, New Name: " +
                            newName);
                    System.out.println("Old Number: " + userOldNumber + " is updated with, New Number: "
                            + newNumber);
                } else {
                    System.out.println(name + " is updated with " + newName);
                }
            }
        } else {
            System.out.println(name + " is not in the list");
        }
    }
}
