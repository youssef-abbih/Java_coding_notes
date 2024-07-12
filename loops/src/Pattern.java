public class Pattern {
        public static void main(String[] args) {
//            for(int i = 0; i <= 9; i++){
//                for(int j = 0; j <= i; j++) System.out.print("*");
//                System.out.println();
//            }
//            for(int i = 0; i <= 9; i++){
//                for(int j = 9; j >= i; j--) System.out.print("*");
//                System.out.println();
//            }
//            int count = 0;
//            for(int i = 0; i < 9; i++){
//                for(int j = 0; j < i; j++) System.out.print(++count+" ");
//                System.out.println();
//            }
//            for(int i = 0; i <= 9; i++){
//                for(int j = 0; j <= 9-i; j++) System.out.print(j+" ");
//                System.out.println();
//            }
//            for(int i = 0; i < 9; i++){
//                for(int j = 0; j < (9-i+1); j++) System.out.print(" ");
//                for (int j = 0; j < (2*i+1); j++) System.out.print("*");
//                System.out.println();
//            }

            for(int i = 0; i <= 9; i++) {
                for(int j = 1; j <= i; j++) System.out.print(" ");
                for (int j = 9; j >= i; j--) System.out.print("*");
                System.out.println();
            }

            for(int i = 0; i <= 9; i++){
                for(int j = 0; j <= 9; j++) {
                    if (j <= 9-i) System.out.print(" ");
                    else System.out.print("*");
                }
                System.out.println();
            }
//            displayDigits(257);
//            System.out.println(sumDigits(257));
//            System.out.println(isArmstrongNumber(153));
//            System.out.println(isArmstrongNumber(9474));
//            System.out.println(isArmstrongNumber(123));
//            System.out.println(countDigits(124546545));
//            System.out.println(reverseNumber(-547));
            // numToWord(1804);
//            arithmeticSeries(5, 20, 5);
//            System.out.println();
//            geometricSeries(2, 32, 2);
//            System.out.println();
//            fibonacciSerie(10);
        }
        static void displayDigits(int n){
            while (n != 0){
                System.out.println(n%10);
                n /= 10;
            }
        }
        static int sumDigits(int n){

            int s = 0;
            while (n != 0){
                s += n%10;
                n /= 10;
            }
            return s;
        }
    /**
     * Checks if the given number is an Armstrong number.
     * An Armstrong number is a number that is equal to the sum of its own digits
     * each raised to the power of the number of digits.
     *
     * @param n the number to check
     * @return true if the number is an Armstrong number, false otherwise
     */
        static boolean isArmstrongNumber(int n){
            int original = n;
            int s = 0;
            int numberOfDigits = String.valueOf(n).length();
            while (n != 0){
                s += Math.pow(n%10, numberOfDigits);
                n /= 10;
            }
            return s == original;
        }
    /**
     * Reverses the given integer, including handling negative numbers.
     *
     * @param n the number to reverse
     * @return the reversed number
     */
        static int reverseNumber(int n){
            boolean isNegative = n < 0;
            if (isNegative) {
                n = -n; // Make the number positive for reversal
            }
            int reversedNumber = 0;
            while (n != 0){
                reversedNumber = reversedNumber * 10 + n % 10;

                n /= 10;
            }
            if (isNegative) {
                reversedNumber = -reversedNumber; // Restore the negative sign
            }
            return reversedNumber;
        }
        static int countDigits(int n){

            int count = 0;
            while(n !=0){
                count++;
                n /= 10;
            }
            return count;
        }
    /**
     * Checks if the given integer is a palindrome.
     *
     * @param n the number to check
     * @return true if the number is a palindrome, false otherwise
     */
        static boolean isPalindrome(int n){
            return n == reverseNumber(n);
        }
        static void numToWord(int n){
            String stringNumber = "";
            char c;
            n = reverseNumber(n);
            while(n !=0){
                stringNumber += n%10;
                n /= 10;

            }

            for(int i = 0; i < stringNumber.length(); i++){
                c = stringNumber.charAt(i);
                switch (c){
                    case '0':
                        System.out.print("zero ");
                        break;
                    case '1':
                        System.out.print("one ");
                        break;
                    case '2':
                        System.out.print("two ");
                        break;
                    case '3':
                        System.out.print("three ");
                        break;
                    case '4':
                        System.out.print("four ");
                        break;
                    case '5':
                        System.out.print("five ");
                        break;
                    case '6':
                        System.out.print("six ");
                        break;
                    case '7':
                        System.out.print("seven ");
                        break;
                    case '8':
                        System.out.print("eight ");
                        break;
                    case '9':
                        System.out.print("nine ");
                }
            }
        }
        static void arithmeticSeries(int start, int end, int step){

            if (step <= 0) {
                System.out.println("Step must be a positive number.");
                return;
            }

            boolean first = true;
            while (start <= end) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(", ");
                }
                System.out.print(start);
                start += step;
            }
        }
        static void geometricSeries(int start, int end, int step){

        if (step <= 0) {
            System.out.println("Step must be a positive number.");
            return;
        }

        boolean first = true;
        while (start <= end) {
            if (first) {
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(start);
            start *= step;
        }
    }
        static void fibonacciSerie(int n){
            int a = 0, b = 1;
            System.out.print(a+","+b+",");
            for(int i = 2; i <= n; i++){
                    int fib = a + b;
                    System.out.print(fib + ",");
                    a = b;
                    b = fib;


            }
        }
}
