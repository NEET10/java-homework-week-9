package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ans = 'Y';  //char database as single alphabet with single inverted coma sign
        Scanner s = new Scanner(System.in); //  scanner declaration
        while (ans == 'Y' || ans == 'y') {      //use of wile loop to repeat the process
            System.out.println("Enter first number: ");
            int a = s.nextInt();
            System.out.println("Enter second number: ");
            int b = s.nextInt();
            System.out.println("Please enter one of the symbol +, -, *, /: ");
            char symbol = s.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResults(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");
            ans = s.next().charAt(0);
        }
        s.close();  //scanner closing.
    }
}

