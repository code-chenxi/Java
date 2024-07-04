/*
方法的递归调用：

1. 什么是方法的递归调用？
	方法自己调用自己。

2. 递归调用如果没有结束条件的话，会出现栈内存溢出错误：
	java.lang.StackOverflowError

3. 所有的递归调用必须要有结束条件。

4. 在实际开发中，使用递归调用的时候，即使有的时候，结束条件是存在的，并且结束条件也是合法的。
但仍然会发生栈内存溢出错误，这可能是因为递归太深，栈内存不够了导致的。所以递归调用一般是不建议
使用的。只有在不使用递归调用时这个问题解决不了的情况下，才建议使用递归调用。
	原则：能用循环尽量使用循环。
	因为递归调用太耗费栈内存。

5. 在实际开发中，如果因为递归调用发生了栈内存溢出错误，你该怎么办？
	首先可以调整栈内存的大小。扩大栈内存。
	如果扩大之后，运行一段时间还是出现了栈内存溢出错误。
	可能是因为递归结束条件不对。需要进行代码的修改。
*/
public class RecursionTest01{
	public static void main(String[] args){
		recursion();
	}

	public static void recursion(){
		System.out.println("recursion begin");

		// 方法的递归调用
		recursion();

		System.out.println("recursion over");
	}
	
	/*
	public static void recursion(){
		System.out.println("recursion begin");

		// 方法的递归调用
		recursion();

		System.out.println("recursion over");
	}

	public static void recursion(){
		System.out.println("recursion begin");

		// 方法的递归调用
		recursion();

		System.out.println("recursion over");
	}

	public static void recursion(){
		System.out.println("recursion begin");

		// 方法的递归调用
		recursion();

		System.out.println("recursion over");
	}

	public static void recursion(){
		System.out.println("recursion begin");

		// 方法的递归调用
		recursion();

		System.out.println("recursion over");
	}

	public static void recursion(){
		return;
	}
	*/
	//........
}