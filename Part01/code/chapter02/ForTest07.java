
/*
	找出1~1000的所有质数，输出时每8个换一行
*/
public class ForTest07{
	public static void main(String[] args){

		// 定义一个计数器。
		int count = 0;

		for(int j = 2; j <= 1000; j++){
			int num = j;
			boolean isPrime = true;
			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){
				// 计数器加1
				count++;
				System.out.print(num + " ");
				/*
				if(count % 8 == 0){
					System.out.println();
				}
				*/
				if(count == 8){
					System.out.println();
					count = 0;
				}
			}
		}

	}
}
