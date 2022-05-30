package solutions;

/*
Question 7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

 */

public class PrimeNumberQ7 {

    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int primeNumber10001st() {

        int count = 0;
        int currentNumber = 1;

        while (count < 10001) {
            currentNumber++;

            if(isPrime(currentNumber)) {
                count++;
            }
        }

        return currentNumber;
    }

    public static void main(String[] args) {

        System.out.println(primeNumber10001st());

    }
}
