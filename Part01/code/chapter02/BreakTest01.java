/*
break;语句
	1. break;语句可以使用在switch当中，终止switch的执行。

	2. break;可以使用在循环中，用来终止循环的执行。
		for
		while
		do while
		这些循环中都可以使用break;

	3.默认情况下，单独使用“break;”语句，终止的是离它最近的循环。
*/
public class BreakTest01{
	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 10; i++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i);
		}
		*/
		
		/*
		for(int j = 0; j < 2; j++){
			for(int i = 1; i <= 10; i++){
				if(i == 5){
					break;
				}
				System.out.println("i = " + i);
			}
		}
		*/


		f1:for(int j = 0; j < 2; j++){
			f2:for(int i = 1; i <= 10; i++){
				if(i == 5){
					break f1;
				}
				System.out.println("i = " + i);
			}
		}




		System.out.println("Hello World!");

	}
}