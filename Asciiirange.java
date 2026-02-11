package PST;

public class Asciiirange {

    public static void main(String[] args) {
        printascii();  
    }


    
   
    public static void printascii() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }
    }
}
