/*
编写一个程序，输入一个年份year和一个月份month，判断这个月份有多少天。判断方法如下：
如果month为1、3、5、7、8、10、12中的一个，输出"month有31天"；
如果month为4、6、9、11中的一个，输出"month有30天"；
如果month为2并且year为闰年，输出"month有29天"；（如果一个年份能够被4整除但不能被100整除，或者能够被400整除，那么它就是闰年）
如果month为2并且year不是闰年，输出"month有28天"。
*/
import java.util.Scanner;

public class IfTest07{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("请告诉我一个年份，以及一个月份，我可以告诉你这一年的这个月有多少天。");

		System.out.print("请输入年份：");
		int year = s.nextInt();

		System.out.print("请输入月份：");
		int month = s.nextInt();
		
		/*
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			System.out.println(year + "年" + month + "月有31天");
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			System.out.println(year + "年" + month + "月有30天");
		}else{
			// 程序执行到这里，月份一定是2月。
			// if语句嵌套是可以的。
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.println(year + "年" + month + "月有29天");
			}else{
				System.out.println(year + "年" + month + "月有28天");
			}
		}
		*/
		/*
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(year + "年" + month + "月有31天");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(year + "年" + month + "月有30天");
			break;
		default:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.println(year + "年" + month + "月有29天");
			}else{
				System.out.println(year + "年" + month + "月有28天");
			}
		}
		*/

		//java12新特性
		switch(month){
			case 1,3,5,7,8,10,12 -> System.out.println(year + "年" + month + "月有31天!!!");
			case 4,6,9,11 -> System.out.println(year + "年" + month + "月有30天!!!");
			default -> {
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					System.out.println(year + "年" + month + "月有29天!!!");
				}else{
					System.out.println(year + "年" + month + "月有28天!!!");
				}
			}
		}

	}
}
