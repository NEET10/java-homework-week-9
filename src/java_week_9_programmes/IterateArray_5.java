package java_week_9_programmes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class IterateArray_5 {
    public static void main(String[] args) {
        IterateArray_5 obj = new IterateArray_5();
        obj.ColoursList();
    }
    public void ColoursList() {   //Instance method- no returns no parameters
        ArrayList<String> colours = new ArrayList();  //Arraylist syntax
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Black");
        colours.add("Violet");
        System.out.println("Array list: " + colours);
        Iterator itr = colours.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
}
}