/*
猜数字小游戏：程序生成 1~100 之间的一个随机数，要求用户猜这个数是多少，程序做出相应的提示，
如果猜中了则输出恭喜信息，并记录猜的次数，如果猜错了可以提示用户再猜一次。使用 while 循环实现游戏的主体流程。
*/
import java.util.Scanner;
import java.util.Random;
public class WhileTest02{
	public static void main(String[] args){
		
		// 专门生成随机数的一个类。
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		//System.out.println("随机数：" + randomNum);
		
		// 创建键盘扫描器对象
		Scanner scanner = new Scanner(System.in);

		// 计数器
		int count = 0;

		while(true){

			count++;

			System.out.print("请输入你要猜测的数字：");

			int guess = scanner.nextInt();

			if(guess == randomNum){
				System.out.println("恭喜你，猜对了！");
				System.out.println("您一共猜了" + count + "次");
				// 终止程序的执行
				return;
			}else if(guess > randomNum){
				System.out.println("猜大了");
			}else{
				System.out.println("猜小了");
			}
		}
		

	}
}