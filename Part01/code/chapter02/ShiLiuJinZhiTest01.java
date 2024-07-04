/*
1. 十六进制：满十六进一
2. 
	十进制		1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32
	十六进制	1 2 3 4 5 6 7 8 9 a  b  c  d  e  f  10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20

3. 十进制转换成十六进制：
	除16取余，一直到商0为止，最后将所有的余数逆序输出。

4. 十六进制转换成十进制：
	每一位与权值相乘，最后求和。
*/
public class ShiLiuJinZhiTest01 {
	public static void main(String[] args){

		// 十进制转换成十六进制
		// 如果一个字面量以0x开始，后面的值是一个十六进制的值。
		System.out.println(0x146); // 326

		// 十进制
		System.out.println(10); // 10
		// 八进制
		System.out.println(010); // 8
		// 二进制
		System.out.println(0b10); // 2
		// 十六进制
		System.out.println(0x10); // 16
	}
}