/*
编写一个程序，输入一个学生的分数score（百分制），
如果学生的分数大于等于60，则输出"你已经及格了"，
如果学生的分数小于60，则输出“很抱歉，你不及格”。
*/
import java.util.Scanner;

public class IfTest02{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.print("请输入您的成绩：");

		double score = s.nextDouble();
		
		/*
		if(score >= 60){
			System.out.println("你已经及格了");
		}

		if(score < 60){
			System.out.println("很抱歉，你不及格！");
		}
		*/

		// 以上程序的效率比较低，判断了两次。
		// 像这种只有两种情况的，建议使用if else语句。效率高。因为只判断一次。
		if(score >= 60){
			System.out.println("你已经及格了");
		}else{
			System.out.println("很抱歉，你不及格！");
		}

		/*
		if(score >= 60)
			System.out.println("你已经及格了!!!!");
		else
			System.out.println("很抱歉，你不及格！!!!!");
		*/

		/*
		if(score >= 60)
			System.out.println("你已经及格了!!!!");
			System.out.println("Hello World!");
		else
			System.out.println("很抱歉，你不及格！!!!!");
		*/
		

	}
}