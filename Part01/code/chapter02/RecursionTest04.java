
// 使用递归计算n的阶乘（经常考的面试题：笔试题）
// 5的阶乘：5 * 4 * 3 * 2 * 1
public class RecursionTest04{

	public static void main(String[] args){
		int n = 5;
		int result = jieCheng(n);
		System.out.println("result = " + result);
	}

	public static int jieCheng(int n){
		if(n == 1){
			return 1;
		}
		return n * jieCheng(n - 1);
	}
}