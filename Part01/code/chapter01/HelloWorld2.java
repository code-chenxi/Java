/**
* HelloWorld2程序是一个问世程序，这个程序中演示了中文乱码问题。
* @author 杜聚宾
* @version 1.0
* @since 1.0
*/


// public表示公开的
// class表示定义一个类
// HelloWorld2 是给这个类起个名
public class HelloWorld2 { // 定义一个公开的类，起名HelloWorld2

	// 类体

	/**
	* 这是main方法，程序的入口，程序就是从这里进来开始执行的。
	* @param args 这个是main方法的参数
	*/

	// 1. 这是main方法，也叫做主方法。
	// 2. main方法是JVM规定的，固定写法，照抄就行了。程序就是从这个位置进来执行的。这是程序的入口。
	// 3. 对于main方法来说能修改的就是args这个变量名。
	// 4. public表示公开的
	// 5. static表示静态的
	// 6. void表示main方法执行结束之后不返回任何数据
	public static void main(String[] args){

		// 这行代码的作用：将字符串"Hello World!"打印输出到控制台。并且输出之后还会换行的。
		// 注意：在一个java程序中，如果符号是语法的一部分，需要使用英文半角符号。不能使用中文。
		// 以下程序中双引号和分号都是半角的。不能是中文。
		System.out.println("Hello World!");

		// 方法体
		// 方法体当中由一行一行的java语句组成。
		// 任何一条java语句必须以“;”结尾。
		// 方法体当中的代码是有执行顺序的，遵循自上而下的顺序依次逐行执行。

		System.out.println("动力节点，一家只教授Java的培训机构");

		// 没有ln是不换行的。
		System.out.print("abc");
		System.out.print("def");
		System.out.print("xyz");
		// 添加了ln是换行的。
		System.out.println("123");

		
	}


	// 类体
	// 编译报错，类体当中不能直接编写Java语句。（除定义变量之外。）
	// System.out.println("这里能写这样的Java语句吗？");


}