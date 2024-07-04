/*
	找出1~100的所有质数
*/
public class ForTest06{
	public static void main(String[] args){
		/*
		// 给你一个数字，起码要能判断出这个数字是否为质数。
		int num = 13;

		// 给一个标记（默认是质数）
		boolean isPrime = true;
		
		for(int i = 2; i <= num - 1; i++){
			if(num % i == 0){
				// 不是质数
				isPrime = false;
			}
		}

		if(isPrime){
			System.out.println(num + "是质数");
		}else{
			System.out.println(num + "不是质数");
		}
		*/
		
		

		/*
		int num = 19;
		boolean isPrime = true;
		for(int i = 2; i <= num / 2; i++){
			if(num % i == 0){
				isPrime = false;
			}
		}
		if(isPrime){
			System.out.println(num + "是质数");
		}else{
			System.out.println(num + "不是质数");
		}
		*/

		/*
		for(int i = 1; i <= 100; i++){
			System.out.println("===>" + i);
		}
		*/


		for(int j = 2; j <= 100; j++){
			int num = j;
			boolean isPrime = true;
			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.println(num + "是质数");
			}
		}

	}
}
