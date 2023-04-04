package java_week_9_programmes;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11 {
    ArrayList<String> c1 = new ArrayList<>();  //Arraylist syntax
    ArrayList<String> c2 = new ArrayList<>();

    public static void main(String[] args) {  //main method
        Programme_11 obj =new Programme_11();
        ArrayList c1 = obj.c1;
        ArrayList c2 = obj.c2;
        obj.compareArrays();
        System.out.println(obj.compare(c1,c2));
    }
    public void compareArrays(){  //instance method
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
    }
    public boolean compare(ArrayList c1, ArrayList c2){ // with returns with parameters
        return  c1.equals(c2);
    }
}