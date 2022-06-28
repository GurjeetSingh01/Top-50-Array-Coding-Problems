// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
   static int equalPartition(int n, int a[])
   {
       int sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+a[i];
           
       }
       if(sum%2!=0)
       return 0;
       int s1=sum/2;
       int s2=s1;
      if (check(a,s1,s2,n-1))
      return 1;
      return 0;
       
   }
   static boolean check(int a[],int s1,int s2,int n)
   {
       if(n<0)
       {
       if(s1==0 && s2==0)
       return true;
         
         else return false;
       }
       return check(a,s1-a[n],s2,n-1) || check(a,s1,s2-a[n],n-1);
       
  }
}