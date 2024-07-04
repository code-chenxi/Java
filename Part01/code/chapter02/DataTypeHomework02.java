/*
有两个变量a和b，a变量中存储的数据100，b变量中存储的数据200，请编写程序交换两个变量中的数据。
让a变量存储200，让b变量存储100。并且计算两个int类型数据的和，要求最终输出200+100=300的效果。
*/
public class DataTypeHomework02{
	public static void main(String[] args){
		int a = 100;
		int b = 200;

		// 交换位置
		int temp = a;
		a = b;
		b = temp;

		int result = a + b;

		System.out.println(a + "+" + b + "=" + result);

		String name = "jackson";
		
		// 掌握字符串的拼接技巧。（将变量拼接到一个字符串当中。）
		System.out.println("登录成功，欢迎" + name + "回来");
	}
}