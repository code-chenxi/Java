/*
continue;语句

	1. continue;语句翻译为：继续

	2. 也是使用在循环语句当中。

	3. 作用：终止当前本次循环，直接进入下一次循环继续执行。
*/
public class ContinueTest01{
	public static void main(String[] args){
		
		/*
			i = 0
			i = 1
			i = 2
			i = 3
			i = 4
		*/
		for(int i = 0; i < 10; i++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i);
		}

		System.out.println("===================================");

		for(int i = 0; i < 10; i++){
			if(i == 5){
				continue;
			}
			System.out.println("i = " + i);
		}

		System.out.println("===================================");
		
		f1:for(int j = 0; j < 2; j++){
			f2:for(int i = 0; i < 10; i++){
				if(i == 5){
					continue f1;
				}
				System.out.println("i = " + i);
			}
		}
		


	}
}