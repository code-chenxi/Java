
/*
	请记住这个语法规则：
		1.当一个整数型字面量没有超出byte的取值范围的时候，可以直接赋值给byte类型的变量。
		2.当一个整数型字面量没有超出short的取值范围的时候，可以直接赋值给short类型的变量。
*/
public class IntTest04{
	public static void main(String[] args){

		// 可以直接赋值，不需要强制类型转换。
		byte b = 1;

		// 可以直接赋值，不需要强制类型转换。
		byte a = 127;

		// 编译报错，因为128超出byte取值范围了。
		//byte c = 128;

		// 如果想编译通过，只能做强制类型转换了。
		byte c = (byte)128;
		System.out.println(c); // -128

		// short取值范围：-32768 ~ 32767
		// 通过
		short s = 32767;
		
		// 编译报错。
		//short s1 = 32768;

		// 必须强制类型转换
		short s1 = (short)32768;
		System.out.println(s1); // -32768

	}
}