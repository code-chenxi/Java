
/*
	布尔型：boolean
		1. 在java中。boolean值只有两个true false，没有1和0这一说。
		2. boolean类型的数据主要用在哪里呢？
			逻辑判断，条件判断....
*/
public class BooleanTest01{
	public static void main(String[] args){
		
		// 不兼容的类型: int无法转换为boolean
		//boolean flag = 1;

		boolean flag = true;

		boolean gender = false;

		if(gender){
			System.out.println("男士");
		}else{
			System.out.println("女士");
		}

		int a = 1000;
		int b = 200;

		System.out.println(a > b);

		if(a > b){
			System.out.println(a + ">" + b);
		}else{
			System.out.println(a + "<" + b);
		}

	}
}