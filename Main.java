package Section8_Arrays_JavaInbuiltList_AutoUnbox.ArrayList_GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        
        boolean quit=false;
        int choice=0;
        
        printInstructions();
        
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();     // handle Enter key issue
                
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit=true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item form the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.println("Enter old item: ");
        String oldItem=scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyItem(oldItem, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter the item you want to remove: ");
        String item=scanner.nextLine();
        groceryList.removeItem(item);
    }

    private static void searchForItem() {
        System.out.print("Enter the item you want to search: ");
        String searchItem=scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    private static void processArrayList() {                        // copying the content of an ArrayList
//        ArrayList<String> newList = new ArrayList<>();
//        newList.addAll(groceryList.getGroceryList());
                                // 'addAll()' call can be replaced with parametrized constructor call

        ArrayList<String> newList = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);    // copy to an array


    }


}
