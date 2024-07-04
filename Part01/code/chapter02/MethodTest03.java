/*
方法的定义与调用：

1. 方法的定义。

	1.1 语法格式：
		[修饰符列表] 返回值类型 方法名(形式参数列表){
			方法体;
		}
	
	1.2 修饰符列表：目前修饰符列表这一块，统一编写public static。后面讲。

	1.3 返回值类型
		可以是java语言中任何一种数据类型。包括基本数据类型，引用数据类型。
		例如：byte short int long float double boolean char String....
		如果方法执行结束的时候没有返回任何数据给调用者，返回值类型写：void。
		切记：不能空着不写。

		返回值类型是int表示：方法结束的时候会返回一个整数给调用者。
		返回值类型是String表示：方法结束的时候会返回一个字符串给调用者。
		返回值类型是void表示：方法结束的时候不返回任何数据给调用者。
	
	1.4 当返回值类型不是void的时候，方法在结束的时候必须使用“return 值;”语句来完成数据的返回。

	1.5 return语句有两种写法：
		第一种：return 值;
		第二种：return;
		不管是哪一种，只要return语句执行，方法必然结束。
	
	1.6 当返回值类型是void的时候：
		不能编写"return 值;" 这样的语句。
		但是可以编写"return;"语句，主要是用来终止方法的执行。也可以不编写“return;”，这个要看具体的业务。
	
	1.7 当调用一个返回值类型不是void的方法时，方法结束的时候会返回值，这个值可以采用变量接收。注意变量的类型。
	变量的类型一定要和返回值类型一致。或者能够自动类型转换，或者强制类型转换。

	1.8 方法执行结束有返回值，但是对于调用者来说，可以选择接收，也可以选择不接收。

	1.9 方法名：只要是合法的标识符即可。首字母小写，后面每个单词首字母大写。(一般方法都是一个行为，所以方法名一般都是动词。)
	方法名最好是反映了这个方法所实现的功能。
		deleteUser
		saveUser
		login
		logout
		....

	1.10 形式参数列表一般简称为：形参。形参个数是：0-N个。多个的话，使用逗号隔开。
	形参是局部变量。形参中起决定性作用的是：形参的类型。形参名随意。

	1.11 方法体：任何一个方法都有一个方法体。方法体用大括号括起来：
		在大括号中编写“java语句;”
		并且方法体中的代码有执行顺序，遵循自上而下。


2. 方法的调用。
	当这个方法修饰符列表有static关键字的时候：
		调用的语法格式：
			类名.方法名(实际参数列表);
	
	实际参数列表简称为：实参。

	实参和形参列表必须一一对应：
		类型要一一对应。
		个数要一一对应。
*/
public class MethodTest03{
	public static void main(String[] args){

		// 调用方法
		int result = add(1, 2);
		System.out.println(result);
		
		// 这个过程就存在自动类型转换。
		long result2 = add(200, 300);
		System.out.println(result2);
		
		// concat方法结束后返回的是String值，必须使用String类型变量接收这个值。
		String content = concat("hello,", "jack");
		System.out.println(content);

		add(1111, 2222);

		// 错误
		//add(false, 1);
		
		// 错误
		//add(1);

		// 用完整语法调用一次方法。
		String retValue = MethodTest03.concat("abc", "def");
		System.out.println(retValue);
	}

	// 求和的一个方法。
	public static int add(int a, int b){
		System.out.println("add..........");
		//int z = x + y;
		//return z;
		return a + b;
	}

	public static String concat(String x, String y){
		//String z = x + y;
		//return z;
		return x + y;
	}



	// 报错原因：因为返回值类型是int，那么结束时就必须要返回一个整数。但是没有写 return 返回语句来完成数据的返回
	/*
	public static int sum(int a, int b){
	
	}
	*/

	// 解决错误：添加了返回语句。
	public static int sum(int a, int b){
		//int c = a + b;
		//return c;
		return 0;
	}

	public static boolean m1(){
		// 不兼容的类型: int无法转换为boolean
		//return 1;

		// 修改
		return true;
	}
	
	// 缺少返回语句
	/*
	public static String m2(){
		
	}
	*/

	// 修改
	public static String m2(){
		return "say hello";
	}

	public static void m3(){
	
	}
	
	// 编译报错：言行不一。
	/*
	public static void m4(){
		return 100;
	}
	*/

	public static void m5(){
		return;
	}
		
	// 缺少返回值
	/*
	public static int m6(){
		return;
	}
	*/

}