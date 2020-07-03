package array;

// to find number of rotations in a given array using linear search

public class Linear_search {

	static int countRotaions(int arr[],int n)
	{
		int min=arr[0],min_index=-1;
		for (int i=0;i<n;i++) 
		{
			if(min>arr[i])
			{
				min = arr[i];
				min_index = i;
			}
		}
		
		return min_index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,13,14,1,2};
		int arr1[]= {15,18,2,3,6,12};
		int n=arr.length;
		
		int res = countRotaions(arr1, n);
		
		System.out.println(res);
		
	}

}
