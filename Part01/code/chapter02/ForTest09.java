/*
输出1到1000之间既能被5整除又能被3整除的数，并且每行输出5个
*/
public class ForTest09{
	public static void main(String[] args){

		int count = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 5 == 0 && i % 3 == 0){
				System.out.print(i + " ");
				count++;
			}
			if(count == 5){
				System.out.println();
				count = 0;
			}
		}
	}
}