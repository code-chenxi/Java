/*
编写一个程序，根据输入的运算符符号，输出两个数的运算结果。
例如输入符号为“+”，则输出两个数的和；输入符号为“-”，则输出两个数的差，以此类推
*/
import java.util.Scanner;

public class SwitchTest02{
	public static void main(String[] args){
		System.out.println("欢迎使用简易版的计算器。");
		Scanner s = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int num1 = s.nextInt();
		System.out.print("请输入运算符 + - * / % 中的一个：");
		String oper = s.next();
		System.out.print("请输入第二个数字：");
		int num2 = s.nextInt();
		int result = 0;
		switch(oper){
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default : 
			System.out.println("不支持此运算！");
			return;
		}
		System.out.println(num1 + oper + num2 + "=" + result);
	}
}