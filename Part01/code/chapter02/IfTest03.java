/*
编写一个程序，输入一个数字num，判断它是否为7的倍数。如果是，则输出"num是7的倍数"，否则输出"num不是7的倍数"。
*/
import java.util.Scanner;

public class IfTest03{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = s.nextInt();

		/*
		if(num % 7 == 0){
			System.out.println(num + "是7的倍数");
		}else{
			System.out.println(num + "不是7的倍数");
		}
		*/

		/*
			编写一个程序，输入一个数字num，判断它是否同时为3的倍数和5的倍数。
			如果是，则输出"num既是3的倍数又是5的倍数"，否则输出"num不同时是3的倍数和5的倍数"。
		*/

		if(num % 3 == 0 && num % 5 == 0){
			System.out.println(num + "既是3的倍数又是5的倍数");
		}else{
			System.out.println(num + "不同时是3的倍数和5的倍数");
		}
	}
}