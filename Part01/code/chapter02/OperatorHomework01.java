public class OperatorHomework01{
	public static void main(String[] args){
		int a = 5;
		int b = a++;
		b = a++;
		System.out.println("a = " + a); // 7
		System.out.println("b = " + b); // 6

		int c = 10;
		int d = --c;
		System.out.println("c = " + c); // 9
		System.out.println("d = " + d); // 9
	}
}