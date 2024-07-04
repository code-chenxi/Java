/*
	强制类型转换。
		1. java中大容量不能直接赋值给小容量。（大容量是不能自动转换成小容量的。）
		2. 大容量转换成小容量的时候，想让其编译通过的话，必须由程序员手动添加“强制类型转换符”来操作。
		3. 强制类型转换之后，编译通过，运行时可能损失精度，也可能不会损失精度，具体要看数据的真实大小。
*/
public class IntTest03{
	public static void main(String[] args){
		
		long x = 1000L;

		// 错误: 不兼容的类型: 从long转换到int可能会有损失
		//int y = x;

		// 强制类型转换。
		int y = (int)x;


		long a = 55L;

		int b = (int)a;

		System.out.println("b = " + b); // 55


		// 分析程序执行结果。
		int k = 128;

		byte e = (byte)k;

		System.out.println("e = " + e); // -128

		// 分析程序的执行结果：
		int m = 129;
		byte n = (byte)m;
		System.out.println("n = " + n); // -127

		// 自动类型转换。
		double d = 1;
		System.out.println(d); // 1.0

	}
}