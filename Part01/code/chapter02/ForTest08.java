/*
输入一个正整数n，计算1-2+3-4+5-6+…-(n-1)+n的和
*/
public class ForTest08{
	public static void main(String[] args){
		
		int n = 6;
		int result = 0;
		for(int i = 1; i <= n; i++){
			//System.out.println(i);
			if(i % 2 == 0){
				result -= i;
			}else{
				result += i;
			}
		}
		System.out.println("result = " + result);

	}
}