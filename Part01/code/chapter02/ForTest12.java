/*
********
********
********
********
********

    ********  1-->4
   ********   2-->3
  ********    3-->2
 ********     4-->1
********      5-->0

    *		 1->4
   ***		 2->3
  *****	     3->2
 *******	 4->1
*********	 5->0

*/
public class ForTest12{
	public static void main(String[] args){
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 8; j++){
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("===================================");

		for(int i = 1; i <= 5; i++){
			
			for(int k = 5 - i; k > 0; k--){
				System.out.print(" ");
			}

			for(int j = 1; j <= 8; j++){
				System.out.print("*");			
			}
			System.out.println();
		}

		System.out.println("===================================");
		
		int n = 10;
		for(int i = 1; i <= n; i++){ 

			for(int k = n - i; k > 0; k--){
				System.out.print(" ");
			}

			for(int j = 1; j <= i * 2 - 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}