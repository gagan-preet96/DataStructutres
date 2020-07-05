package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

// i'll be using Hashset for this

public class RearrangeArray {

	public static int[] rearrange(int[] arr)
	{
		Set<Integer> s = new HashSet<Integer>(); 
		
		//store all the values in hashset
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		
		for (int i=0;i<arr.length;i++)
		{
			if(s.contains(i))
				arr[i]=i;
			else
				arr[i]= -1;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-1,6,1,9,3,2,-1,4,-1};
		int arr1[]={19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		System.out.println(Arrays.toString(rearrange(arr1)));
		System.out.println(Arrays.toString(rearrange(arr)));
	}

}
