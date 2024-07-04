/*
	条件运算符：三元运算符：三目运算符：

		1. 语法格式：
			布尔表达式 ? 表达式1 : 表达式2

		2. 运算原理？
			当布尔表达式结果是true的时候，将表达式1的执行结果作为整个表达式的执行结果。
			当布尔表达式结果是false的时候，将表达式2的执行结果作为整个表达式的执行结果。
*/
public class OperatorTest13{
	public static void main(String[] args){
		
		// 不是一个java语句。
		//10;

		// 不是一个java语句。
		//'男';

		boolean sex = false;

		// 不是一个java语句。
		//sex ? '男' : '女';

		System.out.println(sex ? '男' : '女');

		char c = sex ? '男' : '女';
		System.out.println(c);
		
		// 错误: 不兼容的类型: 条件表达式中的类型错误
		//char cc = sex ? '男' : "女";

		System.out.println(sex ? '男' : "女");

		String s = sex ? "男" : "女";
		System.out.println(s);

		/*
			请使用三目运算符完成两个数字中较大数字的筛选。
		*/
		int a = 300;
		int b = 200;
		
		System.out.println(a > b ? a : b);
	}
}