/*
	变量的作用：
		第一个作用：便于代码的维护。
		第二个作用：增强代码的可读性。
*/
public class VarTest02{
	public static void main(String[] args){
		/*		
		System.out.println(100 + 456);
		System.out.println(100 + 111);
		System.out.println(100 + 222);
		System.out.println(100 + 235);
		System.out.println(100 + 789);
		System.out.println(100 + 999);
		System.out.println(100 + 666);
		System.out.println(100 + 888);
		*/

		// 新的需求来了：要计算50和后面数字的和。
		// 问题：修改的位置太多了。不好维护。
		/*
		System.out.println(50 + 456);
		System.out.println(50 + 111);
		System.out.println(50 + 222);
		System.out.println(50 + 235);
		System.out.println(50 + 789);
		System.out.println(50 + 999);
		System.out.println(50 + 666);
		System.out.println(50 + 888);
		*/

		int num = 50;
		System.out.println(num + 456);
		System.out.println(num + 111);
		System.out.println(num + 222);
		System.out.println(num + 235);
		System.out.println(num + 789);
		System.out.println(num + 999);
		System.out.println(num + 666);
		System.out.println(num + 888);

		// 需求：请编写程序，计算半径是10.0cm的圆的面积。
		// 假如不用变量。
		System.out.println(3.14 * 10.0 * 10.0);

		// 怎么增强可读性。
		double π = 3.14;
		double r = 10.0;
		System.out.println(π * r * r);

	}
}