// 使用递归调用，计算1+2+3+4+...n的和。
// 思路：5 + 4 + 3 + 2 + 1

public class RecursionTest03{

	public static void main(String[] args){
		int n = 5;
		int result = sum(n);
		System.out.println("result = " + result);
	}

	// 计算1到n的和。
	public static int sum(int n){
		if(n == 1){
			return 1;
		}
		return n + sum(n - 1);
	}
}