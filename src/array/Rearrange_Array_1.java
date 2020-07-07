package array;

//Positive elements at even and negative at odd positions
public class Rearrange_Array_1 {

	
	static void swap (int arr[],int i,int j)
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	void printArray(int [] arr,int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rearrange_Array_1 ra= new Rearrange_Array_1();
		int [] arr = {1,-3,5,6,-3,6,7,-4,9,10};
		int n= arr.length;
        
		ra.printArray(arr, n);
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] >=0 && i%2 ==1)
			{
				for (int j=i +1; j<n;j++)
				{
					if(arr[j]<0 && j%2 ==0)
					{
						swap(arr,i,j);
						break;
					}
				}
			}
			else if(arr[i] <0 && i%2 == 0)
			{
				for (int j=i+1;j<n;j++)
				{
					if (arr[i] >=0 && j%2 ==1)
					{
						swap(arr,i,j);
						break;
					}
				}
			}
		}
		System.out.println("array after rearrangement");
		ra.printArray(arr, n);
	}

}
