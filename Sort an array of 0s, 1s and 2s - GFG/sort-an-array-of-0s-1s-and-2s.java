// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
       //Time O(n) using Dutch Flag Algorithm
       
       int l =0, mid =0, h = a.length-1;
       int tmp=0;
       while(mid<=h){
           if(a[mid]==0){
               tmp= a[l];
               a[l]=a[mid];
               a[mid]=tmp;
               l++;
               mid++;
           }
           else if(a[mid]==1){
               mid++;
           }
            else if(a[mid]==2){
                tmp = a[h];
                a[h]=a[mid];
                a[mid]=tmp; 
                h--;
            }
       }
       
      
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends