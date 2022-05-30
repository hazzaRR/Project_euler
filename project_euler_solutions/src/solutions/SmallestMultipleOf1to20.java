package solutions;

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
