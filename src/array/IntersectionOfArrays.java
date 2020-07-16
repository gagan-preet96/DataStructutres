package array;

//find the intersection of 2 arrays that is to find same elements in 2 arrays
//approach used
//1) Use two index variables i and j, initial values i = 0, j = 0
//2) If arr1[i] is smaller than arr2[j] then increment i.
//3) If arr1[i] is greater than arr2[j] then increment j.
//4) If both are same then print any of them and increment both i and j.

public class IntersectionOfArrays {

	void findIntersection(int [] arr1,int []arr2,int n,int m)
	{
		int i=0 ,j=0;
		while(i<n && j< m)
		{
			if(arr1[i] < arr2[j])
				i++;
			else if(arr2[j]<arr1[i])
				j++;
			else 
			{
				System.out.println(arr2[j++] + " ");
				i++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntersectionOfArrays child =new IntersectionOfArrays();
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {2,3,5,7};
		int n=arr1.length;
		int m=arr2.length;
		child.findIntersection(arr1, arr2, n, m);
				
	}

}
