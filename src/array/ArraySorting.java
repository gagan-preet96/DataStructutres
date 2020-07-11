package array;

//Sort an array of 0s, 1s and 2s
//Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. 
//The functions should put all 0s first, then all 1s and all 2s in last.
public class ArraySorting {

	void printArray(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	void sortArray(int arr[],int n)
	{
		int i, cnt0 =0,cnt1 =0,cnt2 =0;
		for (i=0;i<n;i++)
		{
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}
		
		i=0;
		
		while(cnt0 > 0) {
			arr[i++]=0;
			cnt0--;
		}
		while(cnt1 > 0) {
			arr[i++]=1;
			cnt1--;
		}
		while(cnt2 >0) {
			arr[i++]=2;
			cnt2--;
		}
		printArray(arr, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySorting as=new ArraySorting();
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0,1};
		int n= arr.length;
		
		as.sortArray(arr, n);
	}

}
