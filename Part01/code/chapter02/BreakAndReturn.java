/*
	break;终止的是循环。
	return;终止的是方法。
*/
public class BreakAndReturn{

	public static void main(String[] args){

		for(int i = 0; i < 10; i++){
			if(i == 5){
				//break;
				return;
			}
			System.out.println("i = " + i);
		}

		System.out.println("Hello World!");
	}

}