package PST;
import java.util.Scanner;

public class ASCIIVALUE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value: ");
        int n = sc.nextInt();

        char ch = getCharacter(n);

        System.out.println("Character for ASCII value " + n + " is: " + ch);

        sc.close();
    }

    static char getCharacter(int n) {
        return (char) n;
    }
}

