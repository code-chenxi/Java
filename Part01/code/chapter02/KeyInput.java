/*
	怎么使用键盘接收用户的输入。这个代码可以复制粘贴。
*/
public class KeyInput{
	public static void main(String[] args){
		
		// 1.创建一个键盘扫描器对象
		// 以下代码中s是变量名。名字是随意的，只要是合法的标识符就行。
		// 你可以把现在的s叫做 键盘扫描器
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.print("请输入一个数字：");

		// 程序执行到这里就会停下来，等待键盘的输入。键盘如果没有输入，这里就会一直卡着。
		// 直到用户输入了内容之后，敲回车，这行代码就执行结束了。
		// s.nextInt()会专门从键盘上扫描int类型的数字，然后将扫描到的int数字赋值给num变量。
		// 这样就完成了数据从控制台到内存。
		// 针对nextInt()方法来说，只能接收整数数字。输入其他的字符串会报错。
		int num = s.nextInt();

		System.out.println("您输入的数字是：" + num);

		System.out.print("请输入一个浮点型数据：");

		// 想从键盘上接收一个double类型的数据。
		// 执行到这里会停下来，等待用户的输入。
		double num2 = s.nextDouble();
		System.out.println("您输入的这个浮点数据是：" + num2);


		//System.out.print("请输入您的尊姓大名：");
		// 从键盘上接收一个字符串，但是接收的是第一个空格之前的内容。
		// 程序执行到这里，等待用户的输入。
		//String username = s.next();
		//System.out.println("欢迎您" + username);

		System.out.print("请输入您的真实姓名：");
		// 从键盘上接收一个字符串，但是接收的是第一个换行符\n之前的内容。
		s.nextLine(); // 第一次调用这个方法是读取缓存中遗留的 \r 回车符。
		String name = s.nextLine(); // 第二次调用这个方法才会真正的接收用户的输入。
		System.out.println("欢迎您" + name);

	}
}