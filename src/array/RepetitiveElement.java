package array;

//Find the only repetitive element between 1 to n-1
//approach used:
//We know sum of first n-1 natural numbers is (n – 1)*n/2.
//We compute sum of array elements and subtract natural number sum from it to find the only missing element.
public class RepetitiveElement {

	int findRepetitive(int[] arr,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		int res;
		res= sum - (((n-1)*n)/2);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepetitiveElement ree=new RepetitiveElement();
		int arr[]= {9,8,2,6,1,8,5,3,4,7};
		int n=arr.length;
		
		int result =ree.findRepetitive(arr, n);
		System.out.println("the repetitive number is : " + result);
	}

}
