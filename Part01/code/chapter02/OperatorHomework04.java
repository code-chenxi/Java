/*
题目5：从键盘上接收一个整数三位数，请分别输出它的个位、十位、百位。
*/
public class OperatorHomework04{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("请输入一个三位数：");
		int num = scanner.nextInt();

		System.out.println("个位：" + num % 10);
		System.out.println("十位：" + num / 10 % 10); 
		System.out.println("百位：" + num / 100);
	}
}