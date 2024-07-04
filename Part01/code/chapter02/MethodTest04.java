// 调用方法是，类名. 什么情况下可以省略。
// 调用者 和 被调用者 在同一个类中时，可以省略。
public class MethodTest04{
	public static void main(String[] args){
		// 调用方法m1
		MethodTest04.m1();

		// 省略 类名.
		m1();

		// 调用m2方法
		A.m2();

		// 编译报错。
		//m2();
	}

	public static void m1(){
		System.out.println("m1方法执行了");
	}
}

class A{
	public static void m2(){
		System.out.println("m2方法执行了");
	}
}