/*
一旦有浮点型数据参与运算得出的结果，一定不要使用“==”与其它数字进行“相等比较”
主要原因是：任何浮点型数据，在计算机底层存储的都是它的近似值。
*/
public class FloatTest03{
	public static void main(String[] args){

		double a = 6.9;

		double b = 3.0;

		double c = a / b;

		System.out.println("c = " + c); // c = 2.3000000000000003

		System.out.println(c == 2.3); // false

		/*
		if(c == 2.3){
			System.out.println("相等");
		}
		*/

		if(c - 2.3 < 0.00000001){
			System.out.println("相等");
		}
	}
}