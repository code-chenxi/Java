
/*
package语法：

1. package是包机制，有什么用？
	便于管理。不同的类放在不同的包下。好维护。

2. package语句只能写1行，并且只能写在java源码的第一行。

3. 怎么定义包？
	package 包名;

4. 定义了包之后，怎么带包编译？
	javac -d . PackageTest01.java
	语法：javac -d 生成目录 源文件路径

	当然，也可以不带包编译，编译之后，可以手动创建目录，这种方式比较麻烦。

5. 一旦定义了package之后，有了包之后，怎么运行java程序呢？
	重点强调：有了package之后，完整的类名是带包名的。所以运行的时候一定要添加包名：
		java org.apache.struts.PackageTest02

6. package命名规范：
	- 所有的包名都是小写。
	- 包名的命名规范：
		公司域名倒序 + 项目名 + 模块名 + 功能名;
	- 例如：com.powernode.oa.empmgt.service;

7. import语句只能出现在package和class定义之间。

8. import语句可以编写多个。

9. 什么时候必须使用import语句？
	A类中使用B类，当A和B类不在同一个包下。并且B类也不属于java.lang包，必须使用import引入。

10. import支持模糊导入。

11. import还支持静态导入：
	不常用。了解即可。

*/
// com.PackageTest01

package com;

// 导入其他类。
import com.powernode.oa.empmgt.service.UserService;
import java.util.Scanner;
//import java.util.*;

// 静态导入，将System类中的所有静态变量和静态方法全部导入。
import static java.lang.System.*;
import static java.lang.Math.*;


// 语法错误。
//import *;

/*
class A{

}
*/

// package语句只能出现在java源代码的第一行。
//package com;

public class PackageTest01{
	public static void main(String[] args){
		System.out.println("java语言中的包机制！");

		//类名.方法名(实参);
		//com.PackageTest03.doSome();

		PackageTest03.doSome();

		/*
		com.powernode.oa.empmgt.service.UserService.delUser();
		com.powernode.oa.empmgt.service.UserService.delUser();
		com.powernode.oa.empmgt.service.UserService.delUser();
		com.powernode.oa.empmgt.service.UserService.delUser();
		com.powernode.oa.empmgt.service.UserService.delUser();
		*/

		UserService.delUser();
		UserService.delUser();
		UserService.delUser();
		UserService.delUser();
		UserService.delUser();

		//java.lang.String name = "jackson";
		String name = "jackson";

		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		
		/*
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		*/
		
		out.println("1");
		out.println("2");
		out.println("3");
		out.println("4");

		//System.out.println(Math.abs(-110));

		System.out.println(abs(-120));

	}
}