//not okay
import java.util.*;

class Palindrome_in_sentence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,w=" ",t=" ";
        int i,l,j,p,k=0;
        char c,ch;
        str=sc.nextLine()+" ";
        l=str.length();
        for(i=0;i<l;i++)
        {
            c=str.charAt(i);
            if(c==' ')
            {
                w=str.substring(k,i);
                p=w.length();
                for(j=p-1;j>=0;j--)
                {
                    ch=w.charAt(j);
                    t=t+ch;

                }
                if(w.equalsIgnoreCase(t)==true){
                System.out.println(w);}}
                k=i+1;
                t=" ";
            }
        }

    }
    

