
// char参与的运算
public class CharTest04{
	public static void main(String[] args){
		
		/*
			有一个运算规则需要记住：
				byte short char混合运算的时候，各自先转换成int再做运算。
		*/
		System.out.println('a' + 1); // 98

		char x = 'a' + 1;
		System.out.println(x); // 'b'

		byte b = 1;
		short s = 1;
		char c = 1;
		//short num = b + s + c;

		// 第一种修改方式
		// int num = b + s + c;

		// 第二种修改方式
		short num = (short)(b + s + c);

		/*
			多种数据类型混合运算的时候，各自先转换成最大的再做运算。
		*/
		int k = 100;
		short e = 200;
		long f = 300L;
		double d = 3.0;

		// 错误的
		//long result = k + e + f + d;

		double result = k + e + f + d;

	}
}
