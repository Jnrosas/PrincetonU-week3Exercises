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
        String[] array = { "0", "1" };

        for (int i = 1; i <= n; i++) {
            String zero = array[0];
            String one = array[1];
            array[0] += one;
            array[1] += zero;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[0].charAt(i) == array[0].charAt(j))
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
