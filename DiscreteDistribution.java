/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/*
Discrete distribution. Write a program DiscreteDistribution.java that takes an
integer command-line argument m, followed by a sequence of positive integer
command-line arguments a1,a2,…,an, and prints m random indices (separated by
whitespace), choosing each index i with probability proportional to ai.-
*/

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int sum = 0;
        int accum = 0;

        for (int i = 0; i < args.length; i++) {
            if (i != 0) sum += Integer.parseInt(args[i]);
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * sum);
            for (int j = 1; j < args.length; j++) {
                if (r < (accum += Integer.parseInt(args[j]))) {
                    System.out.print(j + " ");
                    break;
                }
            }
            accum = 0;
        }
    }
}
