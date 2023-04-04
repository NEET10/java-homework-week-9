package java_week_9_programmes;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class ColourArrayList_4 {
    public static void main(String[] args) {  //Main Method
        ColourArrayList_4 obj = new ColourArrayList_4();  // object creation for calling instance method
        obj.ColoursArrayList();
    }

    public void ColoursArrayList() {   //Instance method- no returns no parameters
        ArrayList<String> colours = new ArrayList();  //Arraylist syntax
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Black");
        colours.add("Violet");
        System.out.println("Array list: " + colours);
        System.out.println("Iterating over ArrayList using for-each loop: ");
        for (String name : colours) {  // for each loop
            System.out.println(name);

        }
    }
}





