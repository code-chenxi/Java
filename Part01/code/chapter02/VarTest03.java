/*
变量使用的小细节：
	1.变量必须先声明，再赋值，才能访问
	2.方法体当中的代码遵循自上而下的顺序依次逐行执行，变量先访问，再声明肯定是不行的
	3.一行代码上可以同时声明多个变量
	4.在同一个作用域当中，变量名不能重名，可以重新赋值
*/
public class VarTest03 {
	public static void main(String[] args){
		
		// 变量必须先声明，再赋值，才能访问。
		int age;
		// 错误: 可能尚未初始化变量age
		//System.out.println(age);

		//方法体当中的代码遵循自上而下的顺序依次逐行执行，变量先访问，再声明肯定是不行的
		// 错误: 找不到符号
		//System.out.println("name = " + name);
		String name = "jack";

		
		// 一行代码上可以同时声明多个变量
		// 以下代码含义：声明三个int类型的变量a b c，其中a和b没有赋值，c赋值300
		int a,b,c = 300;
		a = 50;
		System.out.println(a);
		b = 80;
		System.out.println(b);
		System.out.println(c);

		int x = 500, y = 600, z = 700;

		System.out.println(x + y + z);

		// 在同一个作用域当中，变量名不能重名，可以重新赋值
		// 作用域就是有效范围。在java中，一个{}就是一个作用域。
		int i = 100;
		// 错误: 已在方法 main(String[])中定义了变量 i
		//int i = 200;
		
		// 可以重新赋值。
		i = 200;

		System.out.println(i);
		
	}
}