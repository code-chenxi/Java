/*
编写一个程序，输入一个学生的分数score（百分制），根据成绩的不同输出不同的评价。
如果学生的分数大于等于90分，则输出"你的成绩是优秀"；
如果分数大于等于80分但小于90分，则输出"你的成绩是良好"；
如果分数大于等于70分但小于80分，则输出"你的成绩是中等"；
如果分数大于等于60分但小于70分，则输出"你的成绩是及格"；
否则输出"你的成绩不及格"。
*/
import java.util.Scanner;

public class IfTest06{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("请输入您的考试成绩：");
		double score = s.nextDouble();
		
		// 百分制（如果输入的成绩小于0，或者大于100，认为不合法的成绩，程序直接退出。）
		if(score < 0 || score > 100){
			System.out.println("对不起，您输入的成绩不合法！");
			// 直接结束当前方法。
			return;
		}

		// 程序如果能够执行到这里，说明成绩一定是合法的。
		/*
		if(score >= 90){
			System.out.println("你的成绩是优秀");
		}else if(score >= 80 && score < 90){
			System.out.println("你的成绩是良好");
		}else if(score >= 70 && score < 80){
			System.out.println("你的成绩是中等");
		}else if(score >= 60 && score < 70){
			System.out.println("你的成绩是及格");
		}else{
			System.out.println("你的成绩不及格");
		}
		*/

		// 第一次改进
		/*
		if(score >= 90){
			System.out.println("你的成绩是优秀");
		}else if(score >= 80){
			System.out.println("你的成绩是良好");
		}else if(score >= 70){
			System.out.println("你的成绩是中等");
		}else if(score >= 60){
			System.out.println("你的成绩是及格");
		}else{
			System.out.println("你的成绩不及格");
		}
		*/
		
		// 第二次改进
		String str = "你的成绩不及格";

		if(score >= 90){
			str = "你的成绩是优秀";
		}else if(score >= 80){
			str = "你的成绩是良好";
		}else if(score >= 70){
			str = "你的成绩是中等";
		}else if(score >= 60){
			str = "你的成绩是及格";
		}

		System.out.println(str);

	}
}