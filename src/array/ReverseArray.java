package array;
//Write a program to reverse an array or string
//Given an array (or string), the task is to reverse the array/string.
public class ReverseArray {

	 void reverseArray(int []arr, int start, int end)
	{
		int temp;
		
		while (start < end)
		{
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start ++;
			end --;
		}
	}
	
	 void printArray(int[] arr, int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArray rev = new ReverseArray();
		int arr[]= {1,2,3,4,5,6,7,8};
		rev.printArray(arr, 8);
		System.out.println("reversed array is :" );
		rev.reverseArray(arr, 0, 7);
		rev.printArray(arr, 8);
	}

}
