package array;

//You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. 
//Traverse array only once.

public class SegregateArray {

	void segregate0and1(int arr[],int n)
	{
		int count =0;
		for (int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				count++;
			}
		}
		
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		
		for(int i=count;i< n;i++)
		{
			arr[i]=1;
		}
	}
	void printArray(int[] arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SegregateArray sa = new SegregateArray();
		int arr[]= {0,1,0,1,1,1};
		int n=arr.length;
		
		sa.segregate0and1(arr, n);
		System.out.println("array after segregation :");
		sa.printArray(arr, n);
	}

}
