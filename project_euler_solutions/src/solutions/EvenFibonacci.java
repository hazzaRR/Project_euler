package solutions;

public class EvenFibonacci {

    public static int EvenFibonacciSum() {

        int total = 0;
        int t1 = 1, t2 = 2;


        while (t1 < 4_000_000) {

            if (t2 % 2 == 0) {
                total += t2;
            }
            int temp = t2+t1;
            t1 = t2;
            t2 = temp;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(EvenFibonacciSum());
    }
}
