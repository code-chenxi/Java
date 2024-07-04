/*
	循环语句
		1. for, while, do while 三种。
		2. 当某代码片段需要频繁多次执行时，可以采用循环语句
*/
public class ForTest01{
	public static void main(String[] args){
		// 需求：要求输出打印10行hello world
		/*
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		*/

		for(int i = 1; i <= 10; i++){
			System.out.println("hello world!!!!");
		}

	}
}