/*
编写程序模拟用户登录，用户名和密码正确则登录成功，反之则登录失败（输入用户名是admin，密码是abc123,表示登录成功。）

注意：字符串的比较不能使用“==”，必须手动调用equals方法来进行比较。（先记住，后面就知道了。）

String name = "admin";

if(name == "admin"){} 这种写法是不专业的，错误的。不建议的。

应该这样写:
	if(   name.equals("admin")    ){}
*/
import java.util.Scanner;

public class IfTest04{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("欢迎用户使用本系统，请先进行用户登录。");

		System.out.print("请输入用户名：");
		String username = s.next();

		System.out.print("请输入密码：");
		String password = s.next();
		
		if(username.equals("admin") && password.equals("abc123")){
			System.out.println("登录成功");
		}else{
			System.out.println("用户名不存在或者密码错误，登录失败！");
		}

	}
}