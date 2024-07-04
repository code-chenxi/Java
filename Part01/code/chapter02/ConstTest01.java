/*
Java中的字面量：
	1. 什么是字面量？
		程序中的数据就是字面量。字面量是Java中最基本的表达式，无需转换，直接使用。
	2. 字面量包括哪些类型？
		整数型字面量: 10 20 100 -1 0 -100
		浮点型字面量: 3.0 3.14 3.1415926
		布尔型字面量: true false
		字符型字面量: 'a' '国' 'b'
		字符串型字面量："abc" "a" "hello"
*/
public class ConstTest01 {
	public static void main(String[] args){

		// 整数型的字面量
		System.out.println(10);
		System.out.println(-100);

		// 浮点型的字面量
		System.out.println(3.14);

		// 布尔型字面量
		System.out.println(true); // true代表真
		System.out.println(false); // false代表假

		// 字符型字面量（单个字符）
		// 所有字符型字面量必须使用单引号括起来。
		System.out.println('A');
		System.out.println('中');
		System.out.println('T');
		//System.out.println('AB'); // 编译报错。

		// 字符串型字面量
		// 所有的字符串型字面量都必须使用双引号括起来。
		System.out.println("动力节点");
		System.out.println("A");
		System.out.println("Hello World!");

		System.out.println("10");
		System.out.println("true");
	}
}