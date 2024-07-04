/*
	++ 自加1
	-- 自减1

	1. ++ 可以出现在变量前，也可以出现在变量后。
		++i; 可以
		i++; 也可以

		像++这种运算符，只有一边有操作数，我们把这种运算符称为：一元运算符。

		a + b，这里的+两边有两个操作数，所以这种运算符被称为：二元运算符。

	2. 无论++出现在变量前，还是变量后，执行结束后，都会让变量中的值自加1.

	3. 当 ++ 出现在变量后？？？？
		先赋值后自加1

	4. 当 ++ 出现在变量前？？？？
		先自加1后赋值。
		
*/
public class OperatorTest02{
	public static void main(String[] args){
		int i = 10;
		i++;
		System.out.println("i = " + i);

		int a = 10;
		++a;
		System.out.println("a = " + a);

		int k = 10;
		int f = k++; // 运算原理：先将k中的值赋值给f，然后k变量自己再加1
		System.out.println("k = " + k); // 11
		System.out.println("f = " + f); // 10

		int e = 100;
		int x = ++e;
		System.out.println("e = " + e); // 101
		System.out.println("x = " + x); // 101

		int y = 100;
		System.out.println(y++); // 100
		System.out.println(y); // 101

		int z = 100;
		System.out.println(++z); //101
		System.out.println(z); //101
	}
}


/*
PrintStream中的源码：
public void println(int x) {
        if (getClass() == PrintStream.class) {
            writeln(String.valueOf(x));
        } else {
            synchronized (this) {
                print(x);
                newLine();
            }
        }
    }
*/