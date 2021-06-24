
public class Test1 {

	public static void main(String[] args) {
		int a=10;       //a=20,b=10
		int b=20;
		System.out.println("Before swapping "+a+" "+b+" ");
		a=a+b;  //a=30
		b=a-b;  //b=10
		a=a-b;   //a=20
		System.out.println("After swapping "+a+" "+b+" ");

	}

}
