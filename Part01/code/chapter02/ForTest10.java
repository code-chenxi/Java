/*
求100到999之间的水仙花数。水仙花数的每个位上的数字的3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
*/
public class ForTest10{
	public static void main(String[] args){
		for(int i = 100; i <= 999; i++){
			int num = i;
			// 判断153这个数字是否为水仙花数
			int 个位 = num % 10;
			int 十位 = num / 10 % 10;
			int 百位 = num / 100;
			if(个位 * 个位 * 个位 + 十位 * 十位 * 十位 + 百位 * 百位 * 百位 == num){
				System.out.println(num + "是水仙花数");
			}	
		}
	}
}