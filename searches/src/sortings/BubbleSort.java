package sortings;

public class BubbleSort {

	public static void main(String[] args) {
	

		int arr[]= {111,1,2,3,4,5,66,7,8,9,10,11,15,16,19};
		bubbleSort(arr);
		for(int i:arr)
			System.out.println(i);

	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
			
		}
	}

}
