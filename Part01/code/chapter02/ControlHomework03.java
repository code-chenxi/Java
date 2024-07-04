/*
韩信点兵，三人一组余两人，五人一组余三人，七人一组余四人，请问最少需要多少士兵
*/
public class ControlHomework03{
	public static void main(String[] args){
		
		int i = 1;
		
		/*
		while(true){
			i++;
			if(i % 3 == 2 && i % 5 == 3 && i % 7 == 4){
				System.out.println("至少" + i + "个士兵");
				break;
			}
		}
		*/

		while(!(i % 3 == 2 && i % 5 == 3 && i % 7 == 4)){
			i++;
		}
		System.out.println("至少" + i + "个士兵");
	}
}