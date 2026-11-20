import java.util.Scanner;

class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score " + (i + 1) + " (0-100): ");
            int value = sc.nextInt();
            while (value < 0 || value > 100) {
                System.out.print("Invalid score. Enter a value from 0 to 100: ");
                value = sc.nextInt();
            }
            score[i] = value;
        }

        int pass = 0;
        int fail = 0;
        int sum = 0;
        for (int s : score) {
            sum += s;
            if (s >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        double average = (double) sum / score.length;

        System.out.print("Scores:");
        for (int s : score) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
        System.out.println("Average: " + average);
    }
}