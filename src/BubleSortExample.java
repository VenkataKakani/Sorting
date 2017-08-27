/**
 * 
 */

/**
 * @author 417765
 * Example on buble sort
 */
public class BubleSortExample {
	
	public static void main(String str[]){
		//initializing array
		int a[] = {10,2,5,1,25,17,4};
		sortElements(a);
		System.out.println("Bublesorting is complete....");
		
	}
	public static void sortElements(int a[]) {
		int length = a.length-1;
		for(int i = length; i >=0; i--){
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
			System.out.println("Pass:"+i );
			printElements(a);
			System.out.println("\n");
			
		}
		System.out.println("");
		System.out.println("The sorting elements are:" );
		printElements(a);
	}
	public static void printElements(int a[]) {
		for(int k = 0; k < a.length; k++){
			System.out.print(a[k]+",");
		}
		System.out.println("printing..");
	}

}
