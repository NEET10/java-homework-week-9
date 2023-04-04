package java_week_9_programmes;
/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7 {
    ArrayList<Double> list = new ArrayList();   //Arraylist syntax

    public static void main(String[] args) {  //main method
        Programme_7 obj = new Programme_7();
        ArrayList list = obj.list;
        obj.addElements();
        obj.emptyOrNot(list);
    }

    public void addElements() {
        list.add(10.1);
        list.add(10.2);
        list.add(10.3);
        list.add(10.14);
        list.add(10.50);
    }

    public void emptyOrNot(ArrayList list) {
        System.out.println(list);
        System.out.println("Array list is Empty or not : " + list.isEmpty());
        list.removeAll(list);       //removing all objects
        System.out.println(list);
        System.out.println("Array list is Empty or not : " + list.isEmpty());
    }
}
