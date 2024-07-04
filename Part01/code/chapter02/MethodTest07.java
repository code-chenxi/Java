/*
	系统可以接收用户名和密码，判断用户名和密码，如果用户名是admin，密码是abc123，则登录成功。
	如果用户名或密码不对，请继续让用户输入用户名和密码，直到登录成功。

	题目要求：
		只要求大家能够封装一个方法，这个方法专门完成登录验证。
*/
public class MethodTest07{
	public static void main(String[] args){
		login();
	}

	/**
	* 完成登录业务。直到用户登录成功为止。登录失败之后，会尝试让用户重新登录。
	*/
	public static void login(){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		while(true){
			System.out.print("用户名：");
			String username = scanner.next();
			System.out.print("密码：");
			String password = scanner.next();

			boolean isOk = check(username, password);

			if(isOk){
				System.out.println("登录成功");
				return;
			}else{
				System.out.println("登录失败");
			}
		}


	}

	/**
	* 检查用户名和密码是否正确。
	* @param username 用户名
	* @param password 密码
	*/
	public static boolean check(String username, String password){
		/*
		if(username.equals("admin") && password.equals("abc123")){
			return true;
		}else{
			return false;
		}
		*/
		
		/*
		if(username.equals("admin") && password.equals("abc123")){
			return true;
		}
		return false;
		*/

		return username.equals("admin") && password.equals("abc123");
		
		
	}
}