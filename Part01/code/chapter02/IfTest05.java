/*
编写一个程序，输入一个数字num，判断它是否为正数、负数或零，并输出对应的信息。
例如，如果num是正数，则输出"num是正数"，如果num是负数，则输出"num是负数"，如果num等于0，则输出"num等于0"。
*/
import java.util.Scanner;

public class IfTest05{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("请输入一个整数：");

		int num = s.nextInt();

		if(num > 0){
			System.out.println(num + "是正数");
		}else if(num < 0){
			System.out.println(num + "是负数");
		}else{
			System.out.println(num + "是零");
		}
	}
}