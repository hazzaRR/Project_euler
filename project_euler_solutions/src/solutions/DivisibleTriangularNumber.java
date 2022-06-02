package solutions;

public class DivisibleTriangularNumber {

    public static long fiveHundredDivisors() {

        int highestDivisors = 0;
        long triangularNum = 0;
        int nthTriag = 2;

        while (highestDivisors < 500) {

            triangularNum = (nthTriag*(nthTriag+1))/2;

            int count = 0;
            for (int i = 1; i < Math.sqrt(triangularNum); i++) {


                if (triangularNum % i == 0) {

                    if(triangularNum/i == i) {
                        count++;
                    }
                    else {
                        count+=2;
                    }
                }
            }

            if (count > highestDivisors) {
                highestDivisors = count;
            }

            nthTriag++;

        }


        return triangularNum;
    }


    public static void main(String[] args) {

        System.out.println(fiveHundredDivisors());

    }
}
