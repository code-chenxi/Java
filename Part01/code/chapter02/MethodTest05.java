/*
	在同一个域中：return语句后面的代码是无法执行的。请不要写。
*/
public class MethodTest05{

	// 缺少返回语句
	/*
	public static int m1(){
		int i = 100;
		if(i > 99){
			return 1;
		}
	}
	*/
	
	// 可以
	/*
	public static int m1(){
		int i = 100;
		if(i > 99){
			return 1;
		}else{
			return 0;
		}
	}
	*/

	public static int m1(){
		int i = 100;
		if(i > 99){
			System.out.println("位置1");
			return 1;
			//无法访问的语句
			//System.out.println("位置2");
		}
		System.out.println("位置3");
		return 0;
		// 无法访问的语句
		//System.out.println("位置4");
	}
}