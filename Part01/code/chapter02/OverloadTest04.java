public class OverloadTest04{
	public static void main(String[] args){
		// 方法重载的优点：我们使用的时候很轻松。
		// 这个println方法是PrintStream类中的方法。
		// 在java.io.PrintStream类中有很多println方法，这些方法都已经构成了方法的重载。
		System.out.println(10);
		System.out.println("abc");
		System.out.println(true);
		System.out.println(false);
		System.out.println(10L);
		System.out.println(3.14);
	}
}