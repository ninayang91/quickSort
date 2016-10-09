
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={99,22,88,66,44,33,77,11,55};
		//bubbleSort(a);
		//selectionSort(a);
		//insertionSort(a);
		//mergeSort(a);
		//shellSort(a);
		//quickSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
	
	public static void quickSort(int[] a){
		quickSort(a,0,a.length-1);
	}
	public static void quickSort(int[] a, int low, int high){
		if(low>=high)return;
		int pivotPos=partition(a,low,high);
		quickSort(a,low,pivotPos-1);
		quickSort(a,pivotPos+1,high);
	}
	public static int partition(int[] a, int low, int high){
		int pivot=a[low];
		while(low<high){
			while(low<high&&a[high]>=pivot){
				high--;
			}
			a[low]=a[high];
			while(low<high&&a[low]<=pivot){
				low++;
			}
			a[high]=a[low];
		}
		a[low]=pivot;
		return low;
	}




}
