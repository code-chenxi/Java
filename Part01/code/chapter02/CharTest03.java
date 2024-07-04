// Java采用的是：Unicode编码
// 大总结：当整数型字面量没有超出byte short char的范围，可以直接将其赋值给byte short char类型的变量。
// char类型变量定义有三种方式
// 第一种：char c = 'A';
// 第二种：char c = '\u0041';
// 第三种：char c = 65;
public class CharTest03{
	public static void main(String[] args){
		
		char c1 = 'A';
		System.out.println(c1);

		// \\u 后面是一个十六进制的数字，这个十六进制是字符对应的Unicode码
		// 表面看是一个字符串，实际上只是一个字符。
		char c2 = '\u0041';
		System.out.println(c2);

		// 当整数型字面量没有超出char的取值范围，可以直接将其赋值给char类型的变量。
		// 当声明char类型变量的时候，如果值是一个整数型字面量，那么这个字面量会被当做ASCII码值来处理。
		char c3 = 97;
		char c4 = 65535;
		//char c5 = 65536; // 错误的。
		byte b = 1;
		short s = 1;
		System.out.println(c3); // 'a'

		char x = '\u4e2d';
		System.out.println(x);

	}
}