import java.util.Scanner;

public class IfTest01{
	public static void main(String[] args){
		// 编写一个程序，输入一个人的年龄age，如果他的年龄大于等于18岁，则输出"你已经成年了"，否则不输出任何东西
		Scanner s = new Scanner(System.in);
		System.out.print("请输入您的年龄：");
		int age = s.nextInt();
		
		/*
		if(age >= 18){
			System.out.println("你已经成年了！");
		}
		*/

		// 注意：对于if语句来说，如果分支中只有一条java语句，大括号可以省略。但是为了程序的可读性，不建议省略。
		if(age >= 18) System.out.println("你已经成年了！");
		
	}
}