package solutions;

/*
Question 4

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 */

public class LargestPalindromeProduct {

    public static boolean isPalindrome(String num) {

        for (int i = 0, j = num.length()-1; i < num.length()/2; i++, j--) {
            if (num.charAt(i) != num.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int Largest3DigitPalindromeProduct() {

        int largest = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {


                if(isPalindrome(Integer.toString(i*j))) {
                    largest = Math.max(largest, (i*j));
                }
            }
        }

        return largest;

    }

    public static void main(String[] args) {

        System.out.println(Largest3DigitPalindromeProduct());
    }
}
