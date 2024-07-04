/*
	1.查看以下程序的字节码，命令是：javap -c ReadClass01.class

	2. 重点要解读的字节码是：
	   bipush        10     ： 将10这个字面量压入操作数栈当中。
       istore_1	：将操作数栈顶元素弹出，然后将其存储到局部变量表的1号槽位上。
	
	3. 在java语言中，任何一个方法执行时，都会专门为这个方法分配所属的内存空间。供这个方法使用。
	每个方法都有自己独立的内存空间。这个内存空间中有两块比较重要的内存空间：
		一块叫做：局部变量表（存储局部变量的。）
		另一块叫做：操作数栈（存储程序运行过程中参与运算的数据）
*/
public class ReadClass01{
	public static void main(String[] args){
		int i = 10;
	}
}

/*
Compiled from "ReadClass01.java"
public class ReadClass01 {
  public ReadClass01();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: return
}
*/