/*
题目6：681分钟是多少个小时+多少分钟。
*/
public class OperatorHomework05{
	public static void main(String[] args){

		int total = 681;

		int h = total / 60;

		int m = total % 60;

		System.out.println(total + "分钟是" + h + "小时" + m + "分钟");
	}
}