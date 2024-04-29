/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Write a program Minesweeper.java that takes three integer command-line arguments
m, n, and k and prints an m-by-n grid of cells with k mines, using asterisks for
mines and integers for the neighboring mine counts (with two space characters between
each cell)*/

import java.util.Objects;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        // int m = 1;
        int n = Integer.parseInt(args[1]);
        // int n = 10;
        int k = Integer.parseInt(args[2]);
        // int k = 5;

        String[][] mines = new String[m][n];
        int[][] numberOfMines = new int[m][n];

        for (int i = 0; i < k; i++) {
            int rm = (int) (Math.random() * m);
            int rn = (int) (Math.random() * n);
            mines[rm][rn] = "*";
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Objects.equals(mines[i][j], "*")) {
                    System.out.print(mines[i][j] + "  ");
                }

                else if (m > 1 && n > 1) {
                    if (i == 0) {
                        if (j == 0) {
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else if (j == n - 1) {
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else {
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                    }

                    else if (i == m - 1) {
                        if (j == 0) {
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else if (j == n - 1) {
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else {
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                    }

                    else {
                        if (j == 0) {
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else if (j == n - 1) {
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                        else {
                            if (Objects.equals(mines[i - 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j + 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i + 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            if (Objects.equals(mines[i - 1][j - 1], "*")) {
                                numberOfMines[i][j]++;
                            }
                            System.out.print(numberOfMines[i][j] + "  ");
                        }
                    }
                }

                else if (m == 1 && n > 1) {
                    if (j == 0) {
                        if (Objects.equals(mines[i][j + 1], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                    else if (j == n - 1) {
                        if (Objects.equals(mines[i][j - 1], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                    else {
                        if (Objects.equals(mines[i][j - 1], "*")) {
                            numberOfMines[i][j]++;
                        }
                        if (Objects.equals(mines[i][j + 1], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                }
                else if (m > 1 && n == 1) {
                    if (i == 0) {
                        if (Objects.equals(mines[i + 1][j], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                    else if (i == m - 1) {
                        if (Objects.equals(mines[i - 1][j], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                    else {
                        if (Objects.equals(mines[i - 1][j], "*")) {
                            numberOfMines[i][j]++;
                        }
                        if (Objects.equals(mines[i + 1][j], "*")) {
                            numberOfMines[i][j]++;
                        }
                        System.out.print(numberOfMines[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
