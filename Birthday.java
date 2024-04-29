/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

/* Write a program Birthday.java that takes two integer command-line arguments n and
trials and performs the following experiment, trials times:

Choose a birthday for the next person, uniformly at random between 0 and n−1.
Have that person enter the room.
If that person shares a birthday with someone else in the room, stop; otherwise repeat.
In each experiment, count the number of people that enter the room. Print a table that
summarizes the results (the count i, the number of times that exactly i people enter the
room, and the fraction of times that i or fewer people enter the room) for each possible
value of i from 1 until the fraction reaches (or exceeds) 50%.*/

import java.util.ArrayList;

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // int n = 5;
        int trials = Integer.parseInt(args[1]);
        // int trials = 2;
        int i = 0;
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
        ArrayList<Double> tracker2 = new ArrayList<>();
        int accum = 0;
        double percentage;
        for (int j = 0; j < tracker.size(); j++) {
            accum += tracker.get(j);
            percentage = (double) accum / trials;
            tracker2.add(percentage);
        }
        // System.out.println("Tracker1: " + tracker);
        // System.out.println("\nTracker2: " + tracker2);

        for (int j = 1; j < tracker.size(); j++) {
            if (tracker2.get(j) < 0.51) {
                System.out.print(j + "\t");
                System.out.print(tracker.get(j) + "\t");
                System.out.print(tracker2.get(j));
                System.out.println();
            }
        }
    }
}
