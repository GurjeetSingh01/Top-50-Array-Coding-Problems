// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> h = new HashMap<>();
        int sm =0;
        int res =0;
        h.put(0,1);
        for(int val:arr){
            if(val ==0){
                sm--;
            }
            else {
                sm++;
            }
            if(h.containsKey(sm)){
                res+= h.get(sm);
            }
            h.put(sm,h.getOrDefault(sm,0)+1);
        }
        return res;
        
    }
}


