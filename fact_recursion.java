


import java.util.Scanner;
import java.math.BigInteger;

class Factorial {

 
    static BigInteger factorial(int n) {
       
        if (n == 0 || n == 1)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        // ---------- MEMORY MANAGEMENT & LIMIT CHECK ----------
        // Each recursive call consumes stack memory for:
        //  - Function call frame
        //  - Local variables
        //  - Return address
        //
        /

        if (num < 0) {
            System.out.println(" Factorial not defined for negative numbers.");
        } 
        else if (num > 20000) {
            System.out.println(" Number too large! Recursive factorial may cause StackOverflowError or memory exhaustion.");
            System.out.println("Please enter a number less than or equal to 20000.");
        } 
        else {
            BigInteger result = factorial(num);
            System.out.println("\n Factorial of " + num + " is:\n" + result);
        }

        sc.close();
    }
}


