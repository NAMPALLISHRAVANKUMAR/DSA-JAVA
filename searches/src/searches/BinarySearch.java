package searches;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,15,16,19};
		int key=190;
		int index=binarySearch(arr,key);
		if(index==-1) 
			System.out.println("Sorry the number you are trying to search does not exists!!");
		else
			System.out.println("The number found at index "+ index);
		
		 //applications of binary search
		//finding near by square root of given number 
		int n=28;
		System.out.println("The square root of the number "+ n + " is " + squareRoot(n));

	}
  static int binarySearch(int arr[],int key) {
	  int l=0;
	  int r=arr.length -1;
	 
	  while(l<=r) {
		  int mid=l+(r-l)/2;
		  System.out.println("The mid value is "+ mid);
		  if(arr[mid]==key) 
			  return mid; //if the given key is at mid index
		  else if(arr[mid]<key) 
			  l=mid+1; // if the given key is greater than the mid value then left index shoud be moved to mid+1
		  else 
			  r=mid-1; // if the given key is less than the mid value then right index shoud be moved to mid-1
	  }
	  
	  return -1; //if while loop exits then it means we did not found the key,so we are sending a negative number since array index cant be negative.
  }
  
  static int squareRoot(int n) {
	  int l=0;
	  int r=n;
	  int root=1;
	  
	  while(l<=r) {
		  int mid=l+(r-l)/2;
		  
		  if(mid*mid<=n) {
			  root =mid;
			  l=mid+1;
		  }
		  else r=mid-1;
	  }
	  
	  return root;
  }
}

//the worst case time complexity will be O(log n) and the best case will be O(1) 