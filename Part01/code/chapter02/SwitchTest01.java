/*
switch语句的完整格式：
	switch(表达式){
	case 值1:
		分支1;
		break;
	case 值2:
		分支2;
		break;
	case 值3:
		分支3;
		break;
	case 值4:
		分支4;
		break;
	default:
		默认分支;
	}

1. 表达式最后执行完是一个值，这个值要求类型是：int，枚举类型，字符串类型。
	当然，也可以直接把byte short char放进去，会进行自动类型转换。

2. default语句不是必须的。建议写上，这样程序更加健壮。

3. break;语句只要执行，switch语句就会结束。
*/
import java.util.Scanner;

public class SwitchTest01{
	public static void main(String[] args){
		
		// 编译报错，long类型是不允许的。
		/*
		long x = 100L;
		switch(x){}
		*/

		// 修改
		/*
		long x = 100L;
		switch((int)x){}
		*/
		
		// byte可以自动转换成int类型。
		byte b = 1;
		switch(b){}

		short s = 1;
		switch(s){}

		char c = 'a';
		switch(c){}

		//String season = "春季";
		//switch(season){}
		
		// 不支持boolean类型。
		/*
		boolean sex = true;
		switch(sex){}
		*/

		//编写一个程序，根据输入的月份，输出该月份所属的季节
		// 3 4 5 春季
		// 6 7 8 夏季
		// 9 10 11 秋季
		// 12 1 2 冬季
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入月份：");

		int month = scanner.nextInt();
		
		/*
		switch(month){
		case 3:
			System.out.println("春季");
			break;
		case 4:
			System.out.println("春季");
			break;
		case 5:
			System.out.println("春季");
			break;
		case 6:
			System.out.println("夏季");
			break;
		case 7:
			System.out.println("夏季");
			break;
		case 8:
			System.out.println("夏季");
			break;
		case 9:
			System.out.println("秋季");
			break;
		case 10:
			System.out.println("秋季");
			break;
		case 11:
			System.out.println("秋季");
			break;
		case 12:
			System.out.println("冬季");
			break;
		case 1:
			System.out.println("冬季");
			break;
		case 2:
			System.out.println("冬季");
			break;
		}
		*/

		//case是可以合并的。
		/*
		switch(month){
		case 3: case 4: case 5:
			System.out.println("春季!");
			break;
		case 6: case 7: case 8:
			System.out.println("夏季!");
			break;
		case 9: case 10: case 11:
			System.out.println("秋季!");
			break;
		case 12: case 1: case 2:
			System.out.println("冬季!");
			break;
		}
		*/
		
		/*
		switch(month){
		case 3: case 4: case 5:
			System.out.println("春季!");
			break;
		case 6: case 7: case 8:
			System.out.println("夏季!");
			break;
		case 9: case 10: case 11:
			System.out.println("秋季!");
			break;
		case 12: case 1: case 2:
			System.out.println("冬季!");
			break;
		default:
			System.out.println("您输入的月份不存在！");
		}
		*/
		
		// break;语句缺少的话，可能会发生case穿透现象。
		switch(month){
		case 3: case 4: case 5:
			System.out.println("春季!");
		case 6: case 7: case 8:
			System.out.println("夏季!");
		case 9: case 10: case 11:
			System.out.println("秋季!");
			break;
		case 12: case 1: case 2:
			System.out.println("冬季!");
			break;
		default:
			System.out.println("您输入的月份不存在！");
		}

		/*
		String season = "您输入的月份不存在！";
		switch(month){
		case 3: case 4: case 5:
			season = "春季!";
			break;
		case 6: case 7: case 8:
			season = "夏季!";
			break;
		case 9: case 10: case 11:
			season = "秋季!";
			break;
		case 12: case 1: case 2:
			season = "冬季!";
			break;
		}
		System.out.println(season);
		*/

		// 请在控制台接收输入：A B C D
		// 当A时，输出优秀
		// 当B时，输出良好
		// 当C时，输出及格
		// 当D时，输出不及格
		System.out.print("请输入等级：");
		int grade = scanner.nextInt();

		char ccc = 'A';

		// case后面只能是字面量这样的值，不能使用变量。
		switch(grade){
		case 'A':
		//case ccc: 
			System.out.println("优秀");
			break;
		case 'B':
			System.out.println("良好");
			break;
		case 'C':
			System.out.println("及格");
			break;
		case 'D':
			System.out.println("不及格");
			break;
		default:
			System.out.println("您输入的有误！");
		}

	}
}