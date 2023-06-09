// okay
import java.util.*;
class Min_jump_to_end {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();

        }
        Solution2 s=new Solution2();
        System.out.println(s.minJumps(array,n));
    }}

class Solution2{
    int minJumps(int array[], int n) {
        int maxR=array[0];
        int step=array[0];
        int jump = 1;
        if(n==1){ return 0;}
        else if(array[0]==0) return -1;
        else{
            for(int i=1;i<n;i++){
                if(i==n-1){
                    return jump;
                }
        maxR = Math.max(maxR,i+array[i]);
        step--;
        if(step==0){
            jump++;
            if(i>=maxR){
                return -1;
                }}
            step = maxR-i;
        }
        return step;}
    }
}