import java.util.Scanner;

class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];

        System.out.print("Enter 7 numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Original:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println();

        System.out.print("Reversed:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(" " + num[i]);
        }
        System.out.println();
    }
}