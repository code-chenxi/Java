public class ForTest04{
	public static void main(String[] args){
		
		//输出100,97,94,91...........1
		for(int i = 100; i >= 1; i -= 3){
			System.out.println("i = " + i);
		}

		// 计算1~100所有奇数的和
		int sum = 0;
		for(int i = 1; i <= 99; i += 2){
			//System.out.println("i = " + i);
			sum += i;
		}
		System.out.println("sum = " + sum); // 2500

		// 计算n的阶乘
		// 5的阶乘: 5 * 4 * 3 * 2 * 1
		int n = 5;
		int result = 1;
		for(int i = n; i >= 1; i--){
			//System.out.println("--->" + i);
			result *= i; 
		}
		System.out.println("result = " + result);

	}
}