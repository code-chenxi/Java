/*
找1~100之间的质数，并输出两两相邻的质数差值等于 2 的质数对，例如（3，5），（5，7），（11，13），（17，19）等等
*/
public class ForTest11{
	public static void main(String[] args){

		for(int j = 2; j <= 98; j++){ 

			// 判断num是否为质数
			int num = j;
			boolean isPrime = true;
			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){
				// 如果第一个数字是质数。才有必要继续判断。
				num += 2;
				
				boolean isPrime2 = true;
				for(int i = 2; i <= num / 2; i++){
					if(num % i == 0){
						isPrime2 = false;
					}
				}

				if(isPrime2){
					System.out.println("(" + (num-2) + "," + num + ")");
				}

			}

		}

	}
}