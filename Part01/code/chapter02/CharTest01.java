/*
	char类型：
		1. char类型是字符型。
		2. char类型占用2个字节。
		3. char类型取值范围：0-65535
			char和short都是2个字节。
			char可以取到更大的正整数。
			char和short所能表示的数量是一样的。
		4. 在java中，字符char类型的字面量必须使用单引号括起来：
			'A' 'a' '中'
		5. 在java中，char类型统一采用的字符编码方式：Unicode编码
		6. 在java中，char可以存储一个汉字。
		7. char的默认值是：\u0000
*/
public class CharTest01{
	public static void main(String[] args){
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1);
		System.out.println(c2);
		char c3 = 'a';
		System.out.println(c3);
		char c4 = '中';
		System.out.println(c4);
		
		// 错误：不兼容的类型: String无法转换为char
		//char c5 = "国";

		// 编译错误
		//char c6 = 'ab';
		
		// 错误: 空字符文字
		//char c7 = '';

		char x = '\u0000';
		System.out.print(x + "abc");

	}
}