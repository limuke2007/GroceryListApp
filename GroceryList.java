package Section8_Arrays_JavaInbuiltList_AutoUnbox.ArrayList_GroceryList;

import java.util.ArrayList;

public class GroceryList {

// fields and constructor

    private int[] myNumbers = new int[10];      // this is how we "declare data type and construct" an array

    // private String ArrayList groceryList;    // WRONG!!!
    private ArrayList<String> groceryList=new ArrayList<String>();      // for an "arrayList"

// methods


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i =0; i< groceryList.size(); i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public void modifyItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position>=0) {
            modifyItem(position, newItem);
        }
    }

    private void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }

    private void removeItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;

//        return groceryList.contains(searchItem);
    }
}
