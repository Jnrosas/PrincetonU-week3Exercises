/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/*
Thue–Morse weave. Write a program ThueMorse.java that takes an integer
command-line argument n and prints an n-by-n pattern like the ones below.
Include two space characters between each + and - character.
*/

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // String[] array = { "0", "1" };

        // for (int i = 1; i <= n; i++) {
        //     String zero = array[0];
        //     String uno = array[1];
        //     array[0] += uno;
        //     array[1] += zero;
        // }

        // String[] a = array[0].split("");

        int[] thue = new int[n * n];
        for (int i = 0; i < thue.length; i++) {
            if (i == 0) thue[i] = 0;
            else if (i % 2 == 0) thue[i] = thue[i / 2];
            else thue[i] = 1 - thue[i - 1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thue[i] == thue[j])
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
