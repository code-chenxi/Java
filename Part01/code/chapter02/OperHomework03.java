/*
编写 Java 代码，输入三个整数，分别判断第一个数是否大于 0，
第二个数是否小于 10，第三个数是否是偶数。如果都满足条件，
则输出“三个条件都满足”，否则输出“不满足所有条件”
*/
import java.util.Scanner;

public class OperHomework03{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);		
		System.out.println("请依次输入3个整数");
		System.out.print("请输入第一个整数：");
		int a = s.nextInt();
		System.out.print("请输入第二个整数：");
		int b = s.nextInt();
		System.out.print("请输入第三个整数：");
		int c = s.nextInt();

		if(a > 0 && b < 10 && c % 2 == 0){
			System.out.println("三个条件都满足");
		}else{
			System.out.println("不满足所有条件");
		}

		System.out.println((a > 0 && b < 10 && c % 2 == 0) ? "三个条件都满足" : "不满足所有条件");
	}
}