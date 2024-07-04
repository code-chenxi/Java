/*
编写一个程序，根据输入的成绩，输出对应的等级。例如
输入成绩为 90~100，则输出“优秀”；
输入成绩为 70~89，则输出“良好”，
输入成绩为 60~69，则输出“及格”，
输入成绩为 0~59，则输出“不及格”，

必须用switch，不能用if。
*/
import java.util.Scanner;

public class SwitchTest03{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("请输入考试成绩：");

		double score = s.nextDouble();

		// 这是一个算法，经过这个算法之后，数就变少了。
		int grade = (int)(score / 10);
		
		/*
		switch(grade){
		case 9:case 10:
			System.out.println("优秀");
			break;
		case 7: case 8:
			System.out.println("良好");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
		}
		*/

		switch(grade){
		default:
			System.out.println("不及格");
			break;
		case 9:case 10:
			System.out.println("优秀");
			break;
		case 7: case 8:
			System.out.println("良好");
			break;
		case 6:
			System.out.println("及格");
			break;
		}
	}
}