
/*
while循环

1.语法格式：
	while(布尔表达式){
		循环体;
	}

2. while循环的次数可能是：0-N次。
*/
public class WhileTest01{
	public static void main(String[] args){
		
		/*
		while(true){
			System.out.println("死循环");
		}
		*/
		
		/*
		int i = 100;
		while(i < 100){
			System.out.println("i = " + i);
		}
		*/

		/*
		int i = 99;
		while(i < 100){
			i++;
			System.out.println("i = " + i);
			// 让i变化，避免死循环
			//i++;
		}
		*/

		/*
		for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}
		*/

		// 修改为while
		int i = 0;
		while(i < 10){
			i++;
			System.out.println("i = " + i);
		}

	}
}