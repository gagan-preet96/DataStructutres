package array;

//calculating number of times an array has been rotated using binary search by finding index of minimum element

public class BinarySearch {

	static int countrotations(int arr[],int low,int high)
	{
		//if array is not rotated
		if(high<low)
			return 0;
		
		//if there is only one element
		if(high == low)
			return low;
		
		//finding mid 
		int mid = (low + high)/2;
		
		//check if (mid +1) element is minimum element.
		if(mid<high && arr[mid+1] < arr[mid])
			return (mid +1);
		
		//check if mid itself element is minimum element.
		if(mid>low && arr[mid] < arr[mid-1])
			return mid;
		
		//decide whether we need to check left half of array or right half
		if(arr[high]>arr[mid])
			return countrotations(arr, low, mid-1);
		else
			return countrotations(arr, mid+1, high);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,18,2,3,6,12};
		int arr1[]= {12,13,14,5,6,7};
		int n=arr.length;
		
		System.out.println(countrotations(arr1, 0, n-1));
	}

}
