public class DoWhileTest01{
	public static void main(String[] args){
		
		do{
			System.out.println("循环体执行了");
		}while (false);

		// 死循环
		/*
		do{
			System.out.println("循环体执行了");
		}while (true);
		*/

		int i = 0;
		do{
			i++;
			System.out.println("i = " + i);
			//i++;
		}while (i < 10);


	}
}