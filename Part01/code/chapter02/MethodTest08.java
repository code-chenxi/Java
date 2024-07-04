/*
1.方法如果只定义，不调用是不会分配内存空间。（从Java8开始，方法的字节码指令存储在元空间metaspace当中。元空间使用的是本地内存。）
2.方法调用的瞬间，会在JVM的栈内存当中分配活动场所，此时发生压栈动作。
3.方法一旦结束，给该方法分配的内存空间就会释放。此时发生弹栈动作。
*/
public class MethodTest08{
	public static void main(String[] args){
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	
	public static void m1(){
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}

	public static void m2(){
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}

	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
}

/*
main begin
m1 begin
m2 begin
m3 begin
m3 over
m2 over
m1 over
main over
*/