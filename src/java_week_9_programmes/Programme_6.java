package java_week_9_programmes;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6 {
    ArrayList cars = new ArrayList(); //Arraylist object

    public static void main(String[] args) {
        Programme_6 obj = new Programme_6();
        ArrayList cars = obj.cars;
        obj.addElements();
        obj.findElements(2, cars);
    }

    public void addElements() {
        cars.add(0, "Rolls Royce");
        cars.add(1, "BMW");
        cars.add(2, "Bugatti");
        cars.add(3, "Tesla");
        cars.add(4, "Ferrari");
    }

    public void findElements(int i, ArrayList cars) {
        System.out.println(cars.get(i));  // get the index number

    }
}
