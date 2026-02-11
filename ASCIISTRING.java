package PST;

import java.util.Scanner;

public class ASCIISTRING {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printASCII(str);
    }

    
    static void printASCII(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = ch;   
            System.out.println(ch + " -> " + ascii);
        }
    }
}

