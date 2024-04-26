/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.util.ArrayList;

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // int n = 5;
        int trials = Integer.parseInt(args[1]);
        // int trials = 2;
        int i = 0;
        int k = 0;
        ArrayList<Integer> tracker = new ArrayList<>();
        for (int j = 0; j < n + 2; j++) {
            tracker.add(0);
        }

        for (int t = 0; t < trials; t++) {

            ArrayList<Integer> birthdayList = new ArrayList<Integer>();
            while (true) {
                int randomBirthday = (int) (Math.random() * n);
                if (birthdayList.contains(randomBirthday)) {
                    i++;
                    break;
                }
                else {
                    birthdayList.add(randomBirthday);
                    i++;
                }
            }

            tracker.set(i, tracker.get(i) + 1);
            // System.out.println("Partial: " + i);
            i = 0;
        }
        System.out.println("Tracker1: " + tracker);
        ArrayList<Double> tracker2 = new ArrayList<>();
        int accum = 0;
        double percentage = 0;
        for (int j = 0; j < tracker.size(); j++) {
            accum += tracker.get(j);
            percentage = (double) accum / trials;
            tracker2.add(percentage);
        }
        System.out.println("\nTracker2: " + tracker2);
    }
}
