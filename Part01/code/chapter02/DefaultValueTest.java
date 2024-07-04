/*
	关于八种基本数据类型的默认值：
		数据类型		默认值
		---------------------------------
		byte			0
		short			0
		int				0
		long			0L
		float			0.0F
		double			0.0
		boolean			false
		char			\u0000

		所有的引用数据类型，默认值是：null

	语法规则：
		在java中，如果成员变量没有手动赋值，系统会赋默认值
*/
public class DefaultValueTest{

	// 成员变量：1.静态变量  2.实例变量。
	// 静态变量
	static int k;

	static boolean sex;

	static String name;

	public static void main(String[] args){

		// 变量必须先声明，再赋值，才能访问。
		int i; // 局部变量
		// 错误: 可能尚未初始化变量i
		//System.out.println(i);

		i = 100;

		System.out.println(i);

		System.out.println("k = " + k);

		System.out.println("sex = " + sex);

		System.out.println("name = " + name);
	}
}