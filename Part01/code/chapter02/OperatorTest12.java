/*
赋值运算符：

	基本的赋值运算符：
		=

	扩展的赋值运算符：
		+=
		-=
		*=
		/=
		%=
		
		以下的很少用：
			>>=
			<<=
			>>>=
			&=
			|=
			^=
			~=
	
	特别注意：对于扩展赋值运算符来说，中间不能使用空格。
		+= 是正确的。
		+ = 是错误的。
	
	对于扩展的赋值运算符来说，永远都不会改变运算结果类型。哪怕精度损失。
*/
public class OperatorTest12{
	public static void main(String[] args){
		
		// 基本的赋值运算符
		int i = 10;
		
		// 重新赋值
		i = 20;
		System.out.println("i = " + i);

		// 可以
		byte b = 127;
		
		// 报错
		//byte b2 = 128;

		// +=
		int k = 100;
		// 以下这个代码完成了累加，给k再累加200
		k = k + 200;
		System.out.println("k = " + k);

		int e = 100;
		// 累加效果
		e += 200; // 等同于 e = e + 200;
		System.out.println("e = " + e);

		int x = 10;
		x *= 3;
		System.out.println("x = " + x); // 30

		x = 10;
		x /= 3;
		System.out.println("x = " + x); // 3

		x = 10;
		x %= 3;
		System.out.println("x = " + x); // 1

		x -= 100;
		System.out.println("x = " + x); // -99

		/*
			i += 10; 和 i = i + 10; 完全一样吗？
				i += 10; 自带强制类型转换。
				i = i + 10; 没有强制类型转换。
		*/
		byte m = 10;
		// 错误: 不兼容的类型: 从int转换到byte可能会有损失
		//m = m + 20;

		m += 20; // 底层实际上对应的是：m = (byte)(m + 20);
		System.out.println("m = " + m);

		m += 100000; // 底层实际上对应的是：m = (byte)(m + 100000);
		System.out.println("m = " + m);
		
	} 
}