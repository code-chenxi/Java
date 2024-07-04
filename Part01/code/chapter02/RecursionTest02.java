// 先不使用递归调用，计算1+2+3+4+...n的和。

public class RecursionTest02{

	public static void main(String[] args){
		int n = 5;
		int result = sum(n);
		System.out.println("result = " + result);
	}

	// 计算1到n的和。
	public static int sum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}