/*
编译器的小心思：
*/
public class IntTest06{
	public static void main(String[] args){

		// 这条语法规则需要记住：byte和short混合运算的时候，各自先转换成int再做运算。
		// byte + byte --> int
		// byte + short --> int
		// short + short --> int
		short m = 10;
		byte n = 10;
		// 编译器报错。最后结果是int类型，不能使用short变量接收。
		//short result = m + n;
		int result = m + n;
		System.out.println("result = " + result);

		// 编译优化：以下代码10/3，编译阶段会直接计算出结果是3
		// 编译之后的class文件中直接就是：byte b = 3;
		byte b = 10 / 3;
		System.out.println(b);
		
		byte x = 10;
		byte y = 3;
		// 编译器报错
		// 编译阶段只知道x/y结果是int类型，但是编译阶段不知道具体的结果是多少。
		//byte c = x / y;
		
		// 修改。
		int c = x / y;
		
		byte e = 3;
		// 编译报错
		//byte f = 10 / e;

		// 第一种修改方式：
		//int f = 10 / e;

		// 第二种修改方式：
		//byte f = (byte)10 / e; // 这是错误的。

		byte f = (byte)(10 / e); // 这是正确的。
	}
}