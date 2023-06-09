//okay
import java.util.*;

class Missing_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n-1];
        for (int i=0;i<n-1;i++)
        {
            array[i]=sc.nextInt();

        }
        Solution s=new Solution();
        System.out.println(s.missingNumber(array,n));


    }}
    class Solution {
        int missingNumber(int array[], int n) {
            int g=(n*(n+1))/2;
            int sum=0;
            for(int i=0;i<n-1;i++)
            {
                sum=sum+array[i];
                
            }
            return (g-sum);
        }
    
}
