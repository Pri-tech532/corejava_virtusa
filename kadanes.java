//not okay
import java.util.*;

class Kadanes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();

        }
        Solution1 s=new Solution1();
        System.out.println(s.maxSubarraySum(array,n));
    }}
class Solution1{
      int maxSubarraySum(int arr[], int n){
            int min=0,max=arr[0],sum=0;
            for (int i=0;i<n;i++)
            {
                sum += arr[i];
                max=Math.max(sum-min,max);
                min=Math.min(sum,min);
                
            }
            return max;
            
        }
        
    }