/*
请定义合理的变量用来存储个人信息（姓名、年龄、性别、联系电话），并编写程序定义这些变量，给变量赋值，并打印输出。输出效果如下
姓名		年龄		性别		联系电话
张三		20		男		12545457585
李四		30		女		15622525855

*/
public class DataTypeHomework01{
	public static void main(String[] args){

		String name1 = "张三";
		int age1 = 20;
		char gender1 = '男';
		String tel1 = "12545457585";

		String name2 = "李四";
		int age2 = 30;
		char gender2 = '女';
		String tel2 = "15622525855";

		System.out.println("姓名\t年龄\t性别\t联系电话");
		System.out.println(name1 + "\t" + age1 + "\t" + gender1 + "\t" + tel1);
		System.out.println(name2 + "\t" + age2 + "\t" + gender2 + "\t" + tel2);
	}
}