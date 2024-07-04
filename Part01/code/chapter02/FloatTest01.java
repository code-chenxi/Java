/*
	浮点型数据：
		1.包括两个类型：
			float(4个字节)：单精度，可以精确到7位小数。
			double(8个字节)：双精度，可以精确到15位小数。
		2. double是常用的。
		3. 浮点型的字面量默认都会被当做double类型来处理，如果想让其当做float类型来处理的话，需要在字面量后面添加F/f
*/
public class FloatTest01{
	public static void main(String[] args){
		
		// 不存在类型转换。
		double d = 3.14;

		// 编译报错
		// 3.14默认是double类型,8个字节。
		// f变量是4个字节，大容量不能直接转换成小容量。
		//float f = 3.14;

		// 修改
		// 第一种方案：不存在类型转换
		//float f = 3.14F;

		// 第二种方案：借助强制类型转换
		float f = (float)3.14;

		double x = 1.5656856894;
		System.out.println(x);

		float y = 1.5656856894F;
		System.out.println(y);

	}
}