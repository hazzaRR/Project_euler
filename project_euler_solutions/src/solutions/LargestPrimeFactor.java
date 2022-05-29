package solutions;

public class LargestPrimeFactor {

    public static boolean isPrimeNumber(int num) {

        boolean isPrime = true;
        for(int i = 3; i < Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static int LargestPrimeFactor() {

        for (int i = (int) Math.sqrt(600851475143L); i > 0; i--) {

            if(600851475143L % i == 0) {
                if(isPrimeNumber((int)i)) {
                    return i;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        System.out.println(LargestPrimeFactor());
    }
}
