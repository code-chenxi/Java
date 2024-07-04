/*
	按位异或：^
		1 ^ 1: 0
		0 ^ 0: 0
		1 ^ 0: 1
		0 ^ 1: 1
	
	按位异或运算符具有自反性：
		a ^ b ^ b ==> a
*/
public class OperatorTest10{
	public static void main(String[] args){
		// 00001010
		int a = 10;
		// 00000011
		int b = 3;
		/*
			00001010
		^	00000011
		------------------
			00001001

		*/
		System.out.println(a ^ b); // 9
		
		/*
			00001001
		^	00000011
		----------------
			00001010

		*/
		System.out.println(a ^ b ^ b); // 10

		/*
			具体应用：加密解密
		*/
		int data = 2147483647; // 原始数据，这个数据将来要进行加密的。
		
		// 对以上的data进行加密
		// 秘钥（私人的，只有我知道这个钥匙）
		int key = 483;

		// 加密
		int password = data ^ key;
		System.out.println(password); // 2147483164

		// 解密
		int num = password ^ key;
		System.out.println(num);

	}
}