package java_week_9_programmes;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8 {

    HashSet<Integer> set = new HashSet();  //HashSet Syntax

    public static void main(String[] args) {  //Main method
        Programme_8 obj = new Programme_8();
        obj.addNumbers();
    }

    public void addNumbers() {      //Instance method no return no parameters
        set.add(4);
        set.add(11);
        set.add(17);
        set.add(7);
        set.add(22);
        set.add(8);
        set.add(98);
        for (int i : set) {   //for each loop
            if (i > 1 && i < 10) {
                System.out.println(i);

            }
        }

    }
}
