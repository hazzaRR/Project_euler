package solutions;

/*
Question 5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class SmallestMultipleOf1to20 {

    public static int smallestMultiple() {

        boolean found = false;
        int smallestMultiple = 2520;

        while (!found) {

            for (int i = 1; i <= 20; i++) {
                if (smallestMultiple % i != 0) {
                    smallestMultiple++;
                    break;
                }
                if (i == 20) {
                    found = true;
                }
            }
        }

        return smallestMultiple;

    }

    public static void main(String[] args) {

        System.out.println(smallestMultiple());

    }
}
