import java.util.Scanner;


public class math2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(f(inputx())+g(inputy()));
		output(power(inputx()));
		output(square(inputx())+abs(inputy())+power1(inputz(),inputy()));
	}
	public static int f(int x) {
		return x;
	}public static int g(int y) {
		return y;
	}
	public static int z(int z) {
		return z;
	}
	public static void output(double d) {
		System.out.println(d);
	}
	public static int inputx() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for x");
		return keyboard.nextInt();
	}
	public static int inputy() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for y");
		return keyboard.nextInt();
	}
	public static int inputz() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for z");
		return keyboard.nextInt();
	}

	public static int power(int x) {
		return x*x*x*x*x*x*x*x*x*x;
	}
	public static double square(int x){
		double t;
		double squareRoot = x/2;
		do{
			t=squareRoot;
			squareRoot = (t + (x/t)) /2;
		} while((t- squareRoot) !=0);
		
		return (squareRoot); 
	}
	 public static double abs(int y){
		 if (y<0) {
			 y = (y/-1);
		 }
		 return y;
	 }
	 public static double power1(int z, int y){
		 for (int i=1;  i<y; i++) {
			 z+=z;
		 }
		 return z;
	 }

}


