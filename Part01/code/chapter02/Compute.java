/*
	从键盘上接收两个整数，然后求和。
*/
public class Compute{
	public static void main(String[] args){
		// 创建键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 输出欢迎信息
		System.out.println("欢迎使用计算器1.0版本：我现在只能帮助你实现加法运算！");
		System.out.print("请输入第一个数字：");
		int num1 = s.nextInt();

		System.out.print("请输入第二个数字：");
		int num2 = s.nextInt();

		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	} 
}