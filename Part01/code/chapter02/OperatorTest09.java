/*
	按位或运算符：
		1|0 ：1
		0|1 ：1
		1|1 ：1
		0|0 ：0
*/
public class OperatorTest09{
	public static void main(String[] args){
		// 00100011
		int a = 35;
		// 00011011
		int b = 27;
		/*
			00100011
		|	00011011
		----------------
			00111011
		*/
		System.out.println(a | b); // 59

		/*
			具体应用：设置标志位。（按位或的具体应用。）
			将0这个数字的二进制位低位第4个二进制位设置为1.
		*/
		int flag = 0;
		flag = flag | (1 << 3);
		System.out.println(flag); // 8

	}
}