/*
	按位取反：
		~

		~1 : 0
		~0 : 1
*/
public class OperatorTest11{

	public static void main(String[] args){

		// 00000000 00000000 00000000 00001010
		int a = 10;
		
		/*
			取反：
			11111111 11111111 11111111 11110101（补码）
			10000000 00000000 00000000 00001011（原码）
		*/
		System.out.println(~a); // -11

		/*
			按位取反的具体应用：将某个二进制位清0
		*/
		int value = 0b1111111111; // 待清0的数据（将低位第4个清0）
		int flag = (1 << 3);

		// 11111111 11111111 11111111 11110111
		//&00000000 00000000 00000011 11111111
		//-------------------------------------
		// 00000000 00000000 00000011 11110111
		value = value & (~flag);

		System.out.println(value);
		System.out.println(0b1111110111);

	}
}