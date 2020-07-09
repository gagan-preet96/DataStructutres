package array;

//Given an array of n distinct elements,
//the task is to find all elements in array which have at-least two greater elements than themselves.

public class TwoGreatestNumbers {

	void findElements(int[] arr, int n)
	{
		int first= Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int i=0;i<n;i++)
		{
			if(arr[i]> first)
			{
				second=first;
				first=arr[i];
			}
			
			else if(arr[i] > second)
			{
				second = arr[i];
			}
		}
		
		for (int i=0;i<n;i++)
		{
			if(arr[i] < second)
			{
				System.out.println(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGreatestNumbers tg = new TwoGreatestNumbers();
		
		int arr[]= {2,-6,3,5,1};
		int n= arr.length;
        tg.findElements(arr, n);
		
	}

}
