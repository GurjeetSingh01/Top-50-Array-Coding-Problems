// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
//         Set<Integer> list = new HashSet<Integer>();
//         Set<Integer> list1 = new HashSet<Integer>();
//         //Arrays.sort(arr);
//         for(int i =0; i<n; i++){
//             if(list.contains(arr[i])){
//                 if(list1.contains(arr[i])){
//                     continue;
//                 }
//                 else {
//                     list1.add(arr[i]);
//                 }
//             }
//             else {
//                 list.add(arr[i]);
//             }
//         }
//         if(list1.size()==0)
//         list1.add(-1);
//         ArrayList<Integer> list2 = new ArrayList<>(list1);
//         Collections.sort(list2);
//         return list2;
// }

        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(result.size()!=0 && result.get(result.size()-1) == arr[i]){
                continue; 
            }
            if(arr[i]== arr[i+1]){
                result.add(arr[i]);
            }
        }
        if(result.size()==0){
            result.add(-1);
        }
        return result;
    }

}