/*
	for循环嵌套
*/
public class ForTest05{
	public static void main(String[] args){
		/*
		for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}
		*/
		
		/*
		for(int j = 0; j < 2; j++){

			//System.out.println("j = " + j);
			for(int i = 0; i < 10; i++){
				System.out.println("i = " + i);
			}

		}
		*/

		/*
			使用for循环嵌套，打印九九乘法表：
			1*1=1
			1*2=2 2*2=4
			1*3=3 2*3=6 3*3=9
			1*4=4 2*4=8 3*4=12 4*4=16
			...............................
			...................................
			1*9=9....................................9*9=81
		*/

		for(int i = 1; i <= 9; i++){
			//System.out.println("i = " + i); // i是行号。

			for(int j = 1; j <= i; j++){ // 必须将当前行所有的表达式输出。
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}

			// 换行
			System.out.println();

		}



	}
}