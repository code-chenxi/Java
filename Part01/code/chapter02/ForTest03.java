/*
输出1~100中所有的偶数
*/
public class ForTest03{
	public static void main(String[] args){
		
		for(int i = 1; i <= 100; i++){
			//System.out.println("i = " + i);
			if(i % 2 == 0){
				System.out.println("i = " + i);
			}
		}

		// 效率较高。循环次数较少的。而且还不需要使用if语句进行判断。
		for(int i = 2; i <= 100; i += 2){
			System.out.println("i = " + i);
		}

		// 请编写程序计算1-100所有偶数的和。
		int sum = 0;
		for(int i = 2; i <= 100; i += 2){
			//i是偶数，就累加。
			sum += i;
		}
		System.out.println("sum = " + sum); // sum = 2550

	}
}