package array;
//program to find largest number in an array
public class LargestNumber {

	int largestNum(int [] arr,int n)
	{
		int max=arr[0];
		for (int i=0;i<n;i++)
		{
			if(arr[i]> max)
			{
				max= arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestNumber ln=new LargestNumber();
		int arr []= {10,20,50,60,5,8,115,54};
		int n= arr.length;
		int res= ln.largestNum(arr, n);
		System.out.println("laregst number in aray is " + res);
	}

}
