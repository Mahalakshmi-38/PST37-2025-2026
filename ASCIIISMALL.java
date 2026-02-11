package PST;

public class ASCIIISMALL {

	public static void main(String[] args) {
		printascii();  
    }


    
   
    public static void printascii() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }
    }



	}


