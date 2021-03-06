// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
     static int maxIndexDiff(int A[], int N) {
       int k=0;
       int i=0;
       int j=N-1;
       int max=0;
       while(k!=N){
           for(int idxi=0, idxj=k; !(idxi==(k+1) || idxj==(-1)); idxi++, idxj--){
               if(A[i+idxi]<=A[j-idxj] &&(i+idxi)<=(j-idxj)){
                   max=(j-idxj)-(i+idxi);
                   break;
               }
           }
           k++;
           if(max!=0) break;
       }
       
       return max;
   }
}

