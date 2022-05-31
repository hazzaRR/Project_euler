package solutions;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */

public class PythagoreanTriplet {

    public static String sumToAThousand() {

        for (int i = 1; i < 1000; i++) {
            for (int j = i + 1; j < 1000; j++) {
                int aSquared = (i * i);
                int bSquared = (j * j);
                int c = 1000 - (i + j);


                if (aSquared + bSquared == (c*c)) {
                    return Integer.toString(i*j*c);
                }
            }
        }

        return "No solution";
    }

    public static void main(String[] args) {

        System.out.println(sumToAThousand());
    }

}
