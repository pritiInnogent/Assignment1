 class FactorialRecursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        /*
         * When factorial(n) is called, a new Stack Frame is created in the CALL STACK.
         * Inside that stack frame:
         *   - 'n' (local variable) is stored
         *   - Return address (where to go back after recursion) is stored
         * No new objects are created in Heap, only primitive int values are used here.
         */

        if (n == 0 || n == 1) {
            // Base condition
            // This stack frame will return 1 and then get removed (popped) from the stack.
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
        /*
         * At this point:
         *   - factorial(n) is paused, waiting for factorial(n-1).
         *   - factorial(n-1) is pushed into the call stack.
         * This continues until base case is reached.
         */
    }

    public static void main(String[] args) {
        /*
         * 'num' and 'result' are local variables stored in the main() method's stack frame.
         * main() method itself has a stack frame in the Call Stack.
         */
        int num = 5;  
        int result = factorial(num);  // function call → new stack frame created
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
