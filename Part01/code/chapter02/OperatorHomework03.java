// 经典面试题
public class OperatorHomework03{
	public static void main(String[] args){
		int i = 10;
		i = i++;
		System.out.println(i); // 10（底层实现原理，实际上是找了一个临时的变量，将10先存起来一份。再做++，然后将10再重新覆盖掉11）

		/*
		int j = 10;
		int temp = j;
		j++;
		j = temp;
		*/
		
		/*
		int j = 10;
		j = ++j;
		System.out.println(j); // 11
		*/
	}
}

/*
       0: bipush        10
       2: istore_1
       3: iload_1
       4: iinc          1, 1
       7: istore_1
}
*/
