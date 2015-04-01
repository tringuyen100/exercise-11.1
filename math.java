import java.util.Scanner;


public class math {

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
		return (double) Math.sqrt(x);
	}
	 public static double abs(int y){
		 return (double) Math.abs(y);
	 }
	 public static double power1(int z, int y){
		 return (double) Math.pow(z,y);
	 }

}

