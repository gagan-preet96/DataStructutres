package array;

//Find position of an element in a sorted array of infinite numbers
//approach used:
//Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of 
//array.If the array is infinite, that means we don’t have proper bounds to apply binary search. 
//So in order to find position of key, first we find bounds and then apply binary search algorithm.
//Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
//->if it is greater than high index element then copy high index in low index and double the high index.
//->if it is smaller, then apply binary search on high and low indices found.

public class SearchInInfiniteArray {

	static int binarySearch(int [] arr, int l, int r , int x)
	{
		if(r>=l)
		{
			int mid = l + (r-l )/2;
			if (arr[mid] == x)
				return mid;
			if(arr[mid] >x)
				return binarySearch(arr,l,mid+1,x);
			return binarySearch(arr,mid+1,r,x);
		}
		return -1;
	}
	
	//Method takes an infinite size array and a key to be searched and returns its position if found else -1. 
    // We don't know size of arr[] and we can assume size to be infinite in this function. 
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
	
	static int findPos(int []arr, int key)
	{
		int low=0, high =1;
		int val =arr[0];
		
		while(val<key)
		{
			low= high; //// store previous high check that 2*h doesn't exceeds array length to prevent ArrayOutOfBoundException
			if (2*high < arr.length -1)
				high =2*high;
			else
				high =arr.length -1;
			
			val = arr[high];
		}
		return binarySearch(arr,low,high,key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SearchInInfiniteArray child =new SearchInInfiniteArray();
		int arr[]= {3,5,7,9,10,90,100,130,140,160,170};
		
		int ans = child.findPos(arr, 100);
		
		if(ans == -1)
			System.out.println("element not found");
		else
			System.out.println("element found at index : " + ans);
		
	}

}
