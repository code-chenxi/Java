/*
转义字符：
\t: 表示制表符，相当于按下 Tab 键
\n: 表示换行符
\": 表示双引号（"）
\': 表示单引号（'）
\\: 表示反斜线（\）本身
*/
public class CharTest02{
	public static void main(String[] args){
		// 这是一个普通的t字符
		char c1 = 't';

		// 按说应该编译报错。因为看到的是一个字符串。不是字符。
		// 但是编译通过了，说明这是1个字符。
		// 这个字符叫做：制表符。tab
		// \ 反斜杠在java语言中具有转义功能。把普通的t字符转义成了制表符tab。
		char c2 = '\t';

		System.out.println("abc" + c2 + "def");

		// \n 换行符
		System.out.print("hello\n");
		System.out.print("world\n");
		System.out.print("test\n\n\n\n\n\n");

		// \"
		// 需求：输出一个双引号到控制台。
		//System.out.println("""); //编译报错
		System.out.println("\""); 
		System.out.println("\"\""); 
		System.out.println('"');


		// 需求：输出一个单引号到控制台
		System.out.println("'");
		// 编译错误
		//System.out.println(''');
		System.out.println('\'');

		// 字符char只能是单个字符。
		//System.out.println('\'\'');

		// 需求：输出一个反斜杠到控制台。 \
		//System.out.println("\"); // 编译错误

		// 在java中两个 \\ ，最终转换完成之后是一个普通的 \ 字符。
		System.out.println("\\");

		System.out.println("\\\\");
	}
}