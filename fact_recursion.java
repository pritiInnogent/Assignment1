


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

            System.out.println("Enter a number") ; 
        int num =0 ; 
         while (true){
          try{
           num = sc.nextInt();
           break ; 
          } catch( InputMismatchException e ){
             System.out.println("Invalid Input , enter integer ") ; 
             sc.nextLine() ; 
          }
         }

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




