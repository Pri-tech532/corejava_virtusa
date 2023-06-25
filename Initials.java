//okay
import java.util.*;
class Initials {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str,n=" ",t=" ",s="";
        int l;
        char c;
        str=" " + sc.nextLine();
        l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            c=str.charAt(i);
            if(c==' ')
            {
                t=str.substring(i+1);//surname
                n=str.substring(0,i);
                break;
            }
        }
        l=n.length();
        for(int i=0;i<l;i++)
        {
            c=n.charAt(i);
            if(c==' ')
            {
                s=s+n.charAt(i+1)+".";
            }

        }
        s=s+t;
        System.out.println(s);

    }
}
