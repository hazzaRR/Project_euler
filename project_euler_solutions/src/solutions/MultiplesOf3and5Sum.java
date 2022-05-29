package solutions;

public class MultiplesOf3and5Sum {

    public static int SumOf3And5() {
        int total = 0;
        for (int i = 0; i < 1000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }

        }

        return total;
    }


    public static void main(String[] args) {

        System.out.println(SumOf3And5());
    }
}
