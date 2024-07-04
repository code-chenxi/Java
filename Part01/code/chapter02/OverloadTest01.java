/*
	当前代码先不使用方法重载，大家分析一下这样写的代码有什么缺点？
		缺点一：代码不美观。
		缺点二：不方便调用，程序员需要记忆更多的方法名。
*/
public class OverloadTest01{
	public static void main(String[] args){
		// 调用方法
		sumInt(10, 20);
		sumLong(10L, 20L);
		sumDouble(3.0, 2.0);
	}

	public static void sumInt(int a, int b){
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public static void sumLong(long a, long b){
		long c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public static void sumDouble(double a, double b){
		double c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

}