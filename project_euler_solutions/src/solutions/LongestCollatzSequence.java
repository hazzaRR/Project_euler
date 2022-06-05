package solutions;

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */

public class LongestCollatzSequence {

    public static int longestChain() {

        int longestChain = 13;
        int chainAmount = 0;

        for (int i = 13; i < 1000000; i++) {


            int currentChain = 1;
            long currentNum = i;

            while (currentNum > 1) {

                //System.out.println(currentNum);

                if (currentNum % 2 == 0) {
                    currentNum = currentNum/2;
                }
                else {
                    currentNum = (3*currentNum)+1;
                }

                currentChain++;
            }

            if (currentChain > chainAmount) {
                chainAmount = currentChain;
                longestChain = i;
            }

            //System.out.println(currentChain);
        }


        return longestChain;
    }

    public static void main(String[] args) {

        System.out.println(longestChain());

    }
}
