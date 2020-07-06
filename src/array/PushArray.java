package array;
//Move all zeroes to end of array
public class PushArray {

	 void pushZerostoEnd(int[] arr,int n)
	{
		int count =0;
		
		for (int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		while (count < n)
		{
			arr[count++]=0;
		}
	}
	void printArray(int arr[],int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PushArray pa=new PushArray();
		int arr[]= {1,4,6,0,0,5,9,0,8,0};
		int len=arr.length;
		pa.pushZerostoEnd(arr, len);
		pa.printArray(arr, len);
	}

}
