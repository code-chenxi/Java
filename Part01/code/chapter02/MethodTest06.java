/*
	找出1-100所有的质数。请使用方法。
*/
public class MethodTest06{
	public static void main(String[] args){

		for(int i = 2; i <= 100; i++){
			boolean flag = isPrime(i);
			if(flag){
				System.out.println(i);
			}
			/*
			if(isPrime(i)){
				System.out.println(i);
			}
			*/
		}
	}

	// 定义一个方法，专门判断某个数字是否为质数。
	// true表示是质数。
	// false表示不是质数。
	public static boolean isPrime(int num){
		// 判断num是否为质数
		// 是质数：return true;
		// 不是质数：return false;
		for(int i = 2; i <= num / 2; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

	
}
