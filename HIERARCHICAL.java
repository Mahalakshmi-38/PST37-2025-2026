2package PST;

public class HIERARCHICAL {

	public static void main(String[] args) {
		

	}

}
 class ClassA {

    void meth() {
        System.out.println("hello");
    }
}

   class ClassB extends ClassA {

    void meth1() {
         System.out.println("hlo");
    }
}
   class ClassC extends ClassA{
	  void meth2() {
		  System.out.println("hi");
	  }
  }
   class ClassD extends ClassA{
	  void meth3() {
		  System.out.println("hii");
	  }
  }


