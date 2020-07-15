package array;

//Print All Distinct Elements of a given integer array

// we'll use two nested loops to traverse the and check if there is same element or not
// The outer loop picks an element one by one starting from the leftmost element. 
//The inner loop checks if the element is present on left side of it. If present, then ignores the element, else prints the element
public class DistinctElements {

	void findDistinct(int [] arr,int n) 
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				break;
			}
			if(i==j)
				System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DistinctElements dee =new DistinctElements();
		int arr[]= {6,10,5,4,9,120,4,6,10};
		int n=arr.length;
		dee.findDistinct(arr, n);
				
	}

}
