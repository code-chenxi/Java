/*
总结：基本数据类型转换规则
	1.八种基本数据类型中除了boolean类型之外，剩下7个都是可以互相转换的。
	2.小容量可以自动转换成大容量，称为自动类型转换，容量从小到大排序：
		byte < short < int < long < float < double
		       char  <
	3.大容量不能自动转换成小容量，必须添加强制类型转换符，编译才能通过。但是运行时可能损失精度。
	4.当整数型字面量没有超出byte short char的范围时，可以直接将其赋值给byte short char类型的变量。
	5.byte short char混合运算时，各自先转换成int再做运算。
	6.多种数据类型混合运算时，各自先转换成最大的容量，再做运算。
*/
public class DataTypeHomework03{
	public static void main(String[] args){
		// 通过
		short s = 100;
		// 报错：大容量不能直接赋值给小容量
		s = s - 99;
		// 通过
		byte b = 100;
		// 报错
		b = b + 1;
		// 通过
		char c = 'a';
		// 通过
		int i = 20;
		// 通过
		float f = .3F;
		// 通过
		double d = c + i + f;
		// 通过
		byte b1 = 11;
		// 通过
		short s1 = 22;
		// 报错
		short x = b1 + s1;
	}
}