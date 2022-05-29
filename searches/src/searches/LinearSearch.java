package searches;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,15,16,19};
		int key=19;
		int index=linearSearch(arr,key);
		if(index==-1) 
			System.out.println("Sorry the number you are trying to search does not exists!!");
		else
			System.out.println("The number found at index "+ index);

	}
	 static int linearSearch(int arr[],int key) {
	
		 for(int i=0;i<arr.length ;i++)
			 if(arr[i]==key)
				 return i;
		 
		  return -1; //if for loop exits then it means we did not found the key,so we are sending a negative number since array index cant be negative.
	  }
}
