/*
变量
	1. 什么是变量？
		变量是内存中的一块空间。是计算机中存储数据的最基本的单元。
		变量是用来解决数据存储问题的。
		先把数据存储起来，后续的程序需要使用的时候，可以从变量中取来用。

	2. 变量的三要素？
		* 数据类型
		* 变量名
		* 变量值
		注意：
			数据类型是决定空间大小的。
			数据类型 和 值的数据类型 要一致。
	
	3. 变量的声明、赋值、访问。
		声明(定义)语法格式：
			数据类型 变量名;
			
			数据类型：
				int	整数型
				double 浮点型
				String 字符串型
				......
		
		赋值的语法格式：
			变量名 = 变量值;
		
		访问怎么做？
			访问包括两种情况：一种是读，一种是修改。
			读：System.out.println(变量名);
			修改：变量名 = 变量值;
*/
public class VarTest01{
	public static void main(String[] args){

		// 声明/定义一个int类型的变量，起名age，用来存储人的年龄
		int age;

		// 给age变量赋值
		age = 20;

		// 读
		System.out.println("年龄=" + age);

		// 改（重新赋值）
		age = 30;

		// 读
		System.out.println("年龄=" + age);

		age = 60;
		System.out.println("年龄=" + age);

		// 不兼容的类型: String无法转换为int
		//age = "50";

		// 定义一个变量，用来存储数学当中的π
		double π = 3.14;

		System.out.println("圆周率：" + π);


		// 声明一个String类型的name变量，用来存储人的姓名
		// 变量的声明和赋值可以一块完成。
		String name = "jack";
		System.out.println("name = " + name);

		// 可以重新赋值
		name = "lucy";

		System.out.println("name = " + name);

		
	}
}