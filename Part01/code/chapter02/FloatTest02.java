/*
浮点型数据有两种表示方式：
	第一种形式：十进制
		double x = 1.23;
		double y = 0.23;
		double z = .23;
	第二种形式：科学计数法
		double x = 0.123E2; // 0.123 * 10的平方
		double y = 123.34E-2; // 123.34 / 10的平方
*/
public class FloatTest02{
	public static void main(String[] args){
		double x = 1.23;
		double y = 0.23;
		double z = .23;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		double a = 0.123E2;
		System.out.println(a); // 12.3

		double b = 123.34E-2;
		System.out.println(b); // 1.2334
	}
}
