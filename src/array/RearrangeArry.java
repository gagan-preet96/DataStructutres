package array;

//Rearrange positive and negative numbers with constant extra space

//Given an array of positive and negative numbers, arrange them such that all 
//negative integers appear before all the positive integers in the array 

public class RearrangeArry {

	void printArray(int[] arr,int n) 
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	void rearrangePosition(int [] arr, int n)
	{
		int key,j;
		
		for (int i=0;i<n;i++)
		{
			key=arr[i];
			
			if(key>0)
			  continue;
			
			j=i-1;
			while (j >=0 && arr[j] > 0)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RearrangeArry ra= new RearrangeArry();
		
		int arr[]= {-12,11,-13,-5,6,-7,5,-3,-6};
		int n=arr.length;
		
		ra.rearrangePosition(arr,n);
		ra.printArray(arr, n);
		
	}

}
