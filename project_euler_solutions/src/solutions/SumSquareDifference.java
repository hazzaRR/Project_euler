package solutions;

/*
Question 6

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {

    public static int sumSquareDiff() {

        int sumOfSquares = 0, squareOfSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (i*i);
            squareOfSum += i;
        }

        return (squareOfSum * squareOfSum) - sumOfSquares;
    }


    public static void main(String[] args) {

        System.out.println(sumSquareDiff());
    }
}
