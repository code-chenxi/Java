/*
	需要记住：
		1. 当两个int类型的数据进行运算之后，结果还是int类型。
		2. 多种数据类型在混合运算的时候，先各自转换成容量最大的，再做运算。
*/
public class IntTest05{
	public static void main(String[] args){

		int a = 10;

		int b = 3;

		// 应该是这样的结果：3.33333333333333333333...
		// 但java中不是，结果是：int类型的3
		System.out.println(a / b); // 3

		byte x = 10;
		int y = 3;
		long z = 100L;

		// 编译报错。
		//int result = x + y + z;

		// 修改
		long result = x + y + z;

		System.out.println(result);
	}
}