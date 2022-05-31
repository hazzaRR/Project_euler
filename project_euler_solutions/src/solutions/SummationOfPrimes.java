package solutions;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class SummationOfPrimes {

    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long summation() {
        long total = 0;
        for (int i = 2; i < 2000000; i++) {
            if(isPrime(i)) {
                total += i;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(summation());
    }
}
