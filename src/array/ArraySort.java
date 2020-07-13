package array;

//Sort an array which contain 1 to n values
//You have given an array which contain 1 to n element,
//your task is to sort this array in an efficient way and without replace with 1 to n numbers.


// approach used
//Replace every element with it’s position. it takes O(n) efficient time and give you the sorted array.

public class ArraySort {

	void sortArray(int[] arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]= i+1;
		}
	}
	
	void printArray(int[] arr,int n)
	{
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySort as= new ArraySort();
		int arr[]= {10, 7, 9, 2, 8,3, 5, 4, 6, 1};
		int n=arr.length;
		
		as.sortArray(arr, n);
		as.printArray(arr, n);
	}

}
