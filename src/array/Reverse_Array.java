package array;

public class Reverse_Array {

	 void leftRotate(int arr[],int d)
	{
		if(d==0)
			return;
		int n= arr.length;
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}
	 void reverseArray(int arr[],int start,int end)
	{
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
	
	 void printArray(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Reverse_Array rev= new Reverse_Array();
       int arr[]= {1,2,3,4,5,6,7};
       rev.leftRotate(arr, 2);
       rev.printArray(arr, 7);
	}

}
