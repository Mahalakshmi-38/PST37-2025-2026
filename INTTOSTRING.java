package PST;

public class INTTOSTRING {

    public static void main(String[] args) {

        int num = 1245;
        String str = "";

        while (num > 0) {
            int digit = num % 10;
            char ch = (char)(digit + 48);  
            str = ch + str;                
            num = num / 10;               
        }

        System.out.println("String: " + str);
    }
}