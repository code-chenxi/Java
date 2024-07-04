/*
请编写一个程序，打印1~100所有的奇数，但是跳过所有以数字 3 结尾的数字
*/
public class ControlHomework02{
	public static void main(String[] args){
		
		for(int i = 1; i <= 100; i+=2){
			if(i % 10 == 3){
				continue;
			}
			System.out.println("i = " + i);
		}

	}
}