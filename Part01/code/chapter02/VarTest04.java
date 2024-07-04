/*
	变量的作用域：

		1. 什么是作用域？
			变量的有效范围。在java程序中通常是一个{}对应一个作用域。

		2. 记住一句话：出了大括号就不认识了。
*/
public class VarTest04 {

	public static void main(String[] args){
		
		// age是main方法中声明的。所以作用域是整个main方法。
		// 在main方法体当中是有效的变量。
		int age = 20;
		System.out.println("age = " + age);

		int num = 100;

		if(num > 50){
			int i = 666;
			System.out.println("i = " + (i + age));
		}
		
		// 错误: 找不到符号
		//System.out.println("i = " + i);
	}

	// 另一个方法。
	public static void doSome(){
		// 错误: 找不到符号
		//System.out.println("age = " + age);
	}


}