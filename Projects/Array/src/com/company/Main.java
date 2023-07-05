package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Groceries groceriesList = new Groceries();

    public static void main(String[] args) {
        boolean flag = true;
        int choice;

        while(flag) {
            guide();
            System.out.print("Enter Your Choice: ");
            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        printItems();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        removeItem();
                        break;
                    case 4:
                        modifyItem();
                        break;
                    case 5:
                        findItem();
                        break;
                    case 0:
                        flag = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Unknown command");
                }
            } else {
                System.out.println("Please enter only valid input");
                break;
            }
        }
        scanner.close();
    }

    public static void guide() {
        System.out.println("-------------------------");
        System.out.println("\t1. Print Items");
        System.out.println("\t2. Add Item");
        System.out.println("\t3. Remove Item");
        System.out.println("\t4. Modify Item");
        System.out.println("\t5. Find Item");
        System.out.println("\t0. Quit");
        System.out.println("-------------------------");

    }
    public static void printItems() {
        int groceryListSize = groceriesList.getGroceries().size();
        if (groceryListSize > 1) {
            System.out.println("Grocery list contains "
                    + groceryListSize + " items.");
            for(int i = 0; i < groceryListSize; i++) {
                System.out.println((i+1) + ". "
                        + groceriesList.getGroceries().get(i));
            }
        } else if(groceryListSize == 1) {
            System.out.println("Grocery list contains "
                    + groceryListSize + " item.");
            for(int i = 0; i < groceryListSize; i++) {
                System.out.println((i+1) + ". "
                        + groceriesList.getGroceries().get(i));
            }
        } else {
            System.out.println("Grocery list is empty");
        }
    }

    public static void addItem() {
        System.out.print("Item Name to add: ");
        String itemName = scanner.nextLine();
        groceriesList.addItem(itemName);
    }

    public static void removeItem() {
        System.out.println("Item Name To Remove: ");
        String itemName = scanner.nextLine();
        int itemToRemove = groceriesList.removeItem(itemName);
        if(itemToRemove < 1) {
            System.out.println(itemName + " is not in the list");
        } else {
             System.out.println(itemName + " is removed from the list");
        }
    }

    public static void modifyItem() {
        System.out.print("Enter the name of the item to replace: ");
        String oldItemName = scanner.nextLine();
        System.out.print("Enter the new item: ");
        String newItemName = scanner.nextLine();
        if(groceriesList.modifyItem(oldItemName, newItemName) == 1) {
            System.out.println(oldItemName + " is replaced with " + newItemName);
        } else {
            System.out.println(oldItemName + " is not in the list");
        }
    }

    public static void findItem() {
        System.out.print("Enter the name of the item to find: ");
        String item = scanner.nextLine();
        String itemToSearch = groceriesList.findItem(item);
        if(itemToSearch != null) {
            System.out.println(item + " found at position "
                    + (groceriesList.getGroceries().indexOf(item)+1) );
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }
}