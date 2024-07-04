/*
请设计一个程序，不断的从键盘上接收一个正整数或者负整数，要求计算所有正整数的和，如果接收到0，则程序退出。
*/
import java.util.Scanner;


public class ControlHomework01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		do{
			System.out.print("请输入整数：");
			num = scanner.nextInt();
			if(num > 0){
				sum += num;
			}
		}while(num != 0);

		System.out.println("sum = " + sum);
	}
}