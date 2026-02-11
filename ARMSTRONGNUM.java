package PST;

iimport java.util.Scanner;

public class ARMSTRONG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = 0;

        // Count digits
        int temp = num;
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, digits);
            temp = temp / 10;
        }

        // Check Armstrong
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

