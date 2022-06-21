// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n){
        // regSum = Regular iterative summ of rray
	   //  pSum = Sum acc. to the pattern
	    int regSum = arr[0] ,  pSum = 0;
	    for(int i=1;i<n;i++){
	        regSum+=arr[i];
	        pSum += (i*arr[i]);
	    }
	    int maxSum = pSum;
	    for(int i=1;i<n;i++){
	        int x = pSum-regSum+arr[i-1]+((n-1)*arr[i-1]);
	        maxSum = Math.max(maxSum,x);
	        pSum = x;
	    }
	    return maxSum;
    }	
}