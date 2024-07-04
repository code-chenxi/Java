/*
逻辑运算符
1.逻辑运算符有哪些？ 
	&	逻辑与（并且）   左右两边都是true，结果就是true。只要有一个是false，结果就是false。
	|	逻辑或（或者）	  左右两边只要有一个是true，结果就是true。两边都是false，结果才是false。
	^	逻辑异或		  咱俩不一样，结果就是true。
	!	逻辑非			  !false结果就是true。!true结果就是false。

	&&	短路与（并且）   和逻辑与运算结果是完全相同的，没有区别。只不过&&存在短路现象。（左边是false发生短路现象。）
	||	短路或（或者）   和逻辑或运算结果是完全相同的，没有区别。只不过||存在短路现象。（左边是true发生短路现象。）

	注意：开发中优先使用短路与和短路或，效率较高。

2. 逻辑运算符的特点：
	逻辑运算符两边的操作数要求是布尔类型。
	并且最终运算结果也是一个布尔类型。

*/
public class OperatorTest04{
	public static void main(String[] args){
		int a = 100;
		int b = 99;

		System.out.println(a > b & a > ++b); // false

		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false

		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false

		System.out.println(!false); // true
		System.out.println(!true); // false

		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(true ^ true); // false
		System.out.println(false ^ false); // false

		
		/*
		int x = 99;
		int y = 100;
		// 逻辑与 &
		System.out.println(x > y & x > ++y);
		System.out.println("y = " + y); // 101
		*/

		int x = 99;
		int y = 100;
		// 短路与 &&
		System.out.println(x > y && x > ++y);
		System.out.println("y = " + y); // 100
	}
}