/*
假设变量 a、b、c 分别为 6、9、10，请编写 Java 代码输出它们的最大值
*/
public class OperHomework02{
	public static void main(String[] args){

		/*
		int a = 60, b = 66, c = 10;
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max);
		*/

		int a = 60, b = 66, c = 70;

		int max = a > b ? (a > c ? a : c) : (b > c ? b: c);

		System.out.println(max);
	}
}