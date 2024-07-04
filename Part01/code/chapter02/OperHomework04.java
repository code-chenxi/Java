/*
编写 Java 代码，输入一个年份，判断它是否是闰年。
若该年份能被 4 整除且不能被 100 整除，或者能被 400 整除，则该年份为闰年。
输出结果为“该年是闰年”或“该年不是闰年”
*/
import java.util.Scanner;

public class OperHomework04{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int year = s.nextInt();

		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
	}
}