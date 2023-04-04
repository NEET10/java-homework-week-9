package java_week_9_programmes;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9 {
    String name;
    Map<Integer,String> map = new HashMap();            //HashMap syntax

    public static void main(String[] args) {
        Programme_9 obj = new Programme_9();
        obj.callPeople();
    }
   public void callPeople(){        //instance method
        map.put(101,"Raj");
        map.put(102,"Bill");
        map.put(103,"Smith");
        map.put(104,"Kal");
        map.put(100,"Deshmukh");

       for (Map.Entry<Integer, String> map : map.entrySet()){  // for each loop
       System.out.println(map.getKey()+ " "+map.getValue());
       }
    }
}


