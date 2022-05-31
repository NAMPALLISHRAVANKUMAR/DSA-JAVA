package sortings;

public class SelectionsSort {

	public static void main(String[] args) {
		int arr[]= {111,1,2,3,4,5,66,7,8,9,10,11,15,16,19};
		selectionSort(arr);
		for(int i:arr)
			System.out.println(i);

	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int temp=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[temp]>arr[j])
					 temp=j;
			}
			int t=arr[i];
			arr[i]=arr[temp];
			arr[temp]=t;
		}
	}

}
