package array;

public class Array_rotation {

	
	 void leftrotate(int arr[], int d,int n)
	{
		for(int i = 0; i < d; i++)
		{
			leftrotatebyone(arr,n);
		}
	}
	 void  leftrotatebyone(int arr[] , int n)
	{
		int i,temp;
		temp = arr[0];
		for(i = 0 ; i < n - 1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
	
		
	}
	 void printarray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_rotation rotate= new Array_rotation();
		int arr[] = {1,2,3,4,5,6,7};
		rotate.leftrotate(arr, 2, 7);
		rotate.printarray(arr, 7);
				
	}

}
