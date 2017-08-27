
public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,12,-5,16};
		sortElementsUsingSelectionSort(a);
	}
	public static void sortElementsUsingSelectionSort(int a[]) {
		int totalLength =  a.length;
		for (int i = 0; i < (totalLength-1) ; i++) {
			int minIndex = i;
			for (int j = i+1; j<totalLength ;j++){
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		System.out.println("The sorted elements are::");
		for (int k=0;k < a.length;k++) 
		{
			System.out.println(a[k]+",");
		}
		
	}
}
