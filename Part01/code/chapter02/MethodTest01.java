/*
	在这个程序当中，我不会使用方法，请分析，程序这样写有什么问题？缺点是什么？
		代码复用性差。

		相同的代码写了一遍又一遍，这种设计是不合理的。

		怎么提高代码的复用性呢？
			方法（Method）
*/
public class MethodTest01{
	public static void main(String[] args){
		
		// 需求1：请编写程序计算100和200的和。
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);

		// 需求2：请编写程序计算666和888的和。
		int i = 666;
		int j = 888;
		int m = i + j;
		System.out.println(i + "+" + j + "=" + m);

		// 需求3：请编写程序计算123和456的和。
		int x = 123;
		int y = 456;
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);

	}
}