/*
	算术运算符：
		1. 算术运算符包括哪些？
			+ ： 求和，字符串拼接，正数
			- ： 相减，负数
			* ： 乘积
			/ ： 商（除以）
			% ： 取模（求余数）
					取模公式：x - x / y * y
			++ ：让变量自身加1
			-- ：让变量自身减1
*/
public class OperatorTest01{
	public static void main(String[] args){
		
		int a = 10;
		int b = +3;
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);

		int d = 10;
		int e = -3;
		int f = d - e;
		System.out.println(d + "-(" + e + ")=" + f);

		/*
		int x = 10;
		int y = 3;
		System.out.println(x + "*" + y + "=" + x * y);
		*/

		int m = 10;
		int n = 3;
		System.out.println(m + "/" + n + "=" + m / n);
		
		int x = 10;
		int y = 3;
		System.out.println(x % y); // 1

		// x - x / y * y
		// -10 - (-10) / 3 * 3
		// -10 - (-3) * 3
		// -10 - (-9)
		// -10 + 9
		// -1
		x = -10;
		System.out.println(x % y); // -1


		// x - x / y * y
		// 10 - 10 / (-3) * (-3)
		// 10 - (-3) * (-3)
		// 10 - 9
		// 1
		x = 10;
		y = -3;
		System.out.println(x % y); // 1

		int i = 10;
		// 一元运算符
		i++;
		System.out.println("i = " + i); // 11

		i = 100;
		i--;
		System.out.println("i = " + i); // 99

	}
}