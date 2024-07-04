/*
for循环：

1. for循环语句的语法结构：
	
	for(初始化表达式; 条件表达式; 更新表达式){
		循环体;
	}

	初始化表达式最先执行，并且只执行1次。
	条件表达式的执行结果必须是一个布尔类型的值。
	更新表达式一般是负责更新某个变量值的。（只有更新了某个变量值，条件表达式才有机会变成false。循环终止。）

2. for循环执行原理？

	初始化表达式（标号1）
	条件表达式（标号2）
	循环体（标号3）
	更新表达式（标号4）

	1
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	2--true-->3---->4
	.....
	2--false
*/
public class ForTest02{
	public static void main(String[] args){
		
		// for后面小括号中的三个表达式都不是必须的。
		// 注意：这个是死循环。这是一个最简单的for循环。
		/*
		for(;;){
			System.out.println("死循环");
		}
		*/

		// 比较常见的很普通的for循环.
		for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}

		for(int i = 0; i <= 10; i++){
			System.out.println("i = " + i);
		}

		for(int i = 1; i <= 10; i++){
			System.out.println("i = " + i);
		}

		for(int j = 100; j > 0; j--){
			System.out.println("j = " + j);
		}

		for(int i = 1; i < 100; i += 10){
			System.out.println("i = " + i); // 1 11 21 31 .... 91
		}

		for(int i = 100; i > 1; i /= 10){
			System.out.println("i = " + i); // 100 10
		}

		/*
		int k;

		for(k = 0; k < 10; k++){
			System.out.println("k = " + k);
		}

		System.out.println("k = " + k); // 10
		*/

		int k = 0;

		for(; k < 10; k++){
			System.out.println("k = " + k);
		}

		System.out.println("k = " + k); // 10


		for(int index = 0; index < 10; index++){
			System.out.println("index = " + index);
		}
		//错误: 找不到符号
		//System.out.println("index = " + index);

	}
}