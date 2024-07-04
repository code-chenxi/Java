/*
标识符
	1. 什么是标识符？
		在源代码中程序员自己有权利命名的单词都是标识符。

	2. 标识符可以标识什么？
		变量名，方法名，类名...

	3. 标识符的命名规则？
		* 标识符只能由数字，字母，_，$组成，不能含有其它字符。
			（这里的“字母”代表的是任何一个国家的文字,Java是采用Unicode编码，支持全球任何一个国家的语言）
		* 标识符不能以数字开头。
		* 标识符严格区分大小写。
		* 关键字不能做标识符。
		* 标识符理论上没有长度限制，但是最好不要太长。

	4. 标识符的命名规范？
		* 见名知意。
		* 遵循驼峰式命名方式。StudentService,BankService....
		* 类名，接口名：首字母大写，后面每个单词首字母大写。StudentService, BankService....
		* 变量名,方法名：首字母小写，后面每个单词首字母大写。productPrice, stuName, customerName, customerAge, doSome....
		* 常量名：全部大写，每个单词之间采用“_”分隔。LOGIN_SUCCESS, LOGIN_ERROR, MATH_PAI
		* 包名：全部小写。 powernode

*/
public class IdentifierTest01{
	public static void main(String[] args){

		// 定义一个变量，用来存储一个人的年龄
		// age是一个变量名，是一个标识符
		int age = 20;

		int age_  = 20;

		int $_age = 20;

		int $_age123 = 50;

		//int 1$_age = 50;

		int 年龄 = 50;

		int a = 100;

		int A = 100;

		String name = "jackson";

		//String address# = "北京海淀区";
	}
}

// 学生类  这是一个类名，是一个标识符
class 学生类{

}

/*
class public {

}
*/