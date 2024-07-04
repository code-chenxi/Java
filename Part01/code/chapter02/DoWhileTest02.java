/*
求平均数：要求用户输入一组数字，用 -1 表示输入结束，使用 do-while 循环计算这些数字的平均数并输出。
要使用一个计数器来记录输入的数字个数，遇到 -1 则终止输入并计算平均数
*/
import java.util.Scanner;

public class DoWhileTest02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		/*
		while(true){
			int num = scanner.nextInt();
			System.out.println("您输入的数字是：" + num);
			if(num == -1){
				System.out.println("再见！");
				return;
			}
		}
		*/
		
		// 计数器
		//int count = 0;

		// 求和的结果
		//int sum = 0;
		
		/*
		do{
			count++;
			int num = scanner.nextInt();
			sum += num;
			System.out.println("您输入的数字是：" + num);
			if(num == -1){
				System.out.println("您一共输入了" + (--count) + "个数字");
				int avgValue = (sum + 1) / count;
				System.out.println("平均值是：" + avgValue);
				System.out.println("再见！");
				return;
			}
		}while(true);
		*/
		
		// 计数器
		int count = 0;
		// 求和结果
		int sum = 0;
		// 用户输入的数字（默认值是0）
		int num = 0; 
		do{
			sum += num;
			System.out.print("请输入数字：");
			num = scanner.nextInt();
			count++;
		}while(num != -1);

		System.out.println("平均值：" + sum / (--count));
	}
}