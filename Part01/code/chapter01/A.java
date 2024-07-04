/*
	1. 一个Java源文件中可以定义多个class
	2. 编译之后，一个class就会对应生成一个class字节码文件
	3. 如果一个类是public的，类名必须和源文件名保持一致。
	4. public的类可以没有。如果有的话，也只能有一个。
	5. 每个类中都可以编写入口main方法。想执行X类的main方法怎么办？java X
	6. 这里只是测试一下语法，在实际的开发中，对于一个软件来说，一般入口只有1个。
*/
class X
{
	public static void main(String[] args){
		System.out.println("X执行了");
	}
}

class Y
{
	public static void main(String[] args){
		System.out.println("Y执行了");
	}
}

class Z
{
	public static void main(String[] args){
		System.out.println("Z执行了");
	}
}

/*
public class HeHe
{
}
*/


public class A
{
}