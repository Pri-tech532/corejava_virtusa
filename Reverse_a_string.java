import java.util.*;
class Reverse_a_string 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String s=sc.nextLine();
        char ch=' ';
        String r=" ";
        int j=s.length();
        for(int i=j-1;i>=0;i--)
        {
            ch=s.charAt(i);
            r=r+ch;

        }

        System.out.println("Reverse of the string is "+ r);
        sc.close();

    }
}