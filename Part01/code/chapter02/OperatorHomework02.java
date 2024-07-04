public class OperatorHomework02{
	public static void main(String[] args){
		int i = 10;
		int k = i++ + ++i;
		System.out.println(k); // 22

		int f = 10;
		int m = f++ +f;
		System.out.println(m); // 21
		System.out.println(f); // 11
	}
}