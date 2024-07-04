/*
	关系运算符：
		>
		>=
		<
		<=
		==
		!=
	
	所有的关系运算符运算结果一定是布尔类型：true/false

	= 赋值运算符
	== 可以比较两个值是否相等

	关系运算符又叫做比较运算符。
*/
public class OperatorTest03{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		System.out.println(a > b); // false
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false
	}
}