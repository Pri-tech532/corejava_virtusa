//not okay
// import java.util.*;
// class Change {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         String str, t="",w="";
//         int i,l,k=0;
//         char c;
//         str="Blue bottle is in blue bag lying on blue carpet";
//         str=str+' ';
//         l=str.length();
//         for(i=0;i<l;i++)
//         {
//             c=str.charAt(i);
//             if(c==' ')
//             {
//                 w=str.substring(k, i);
//                 if(w.equalsIgnoreCase("Blue")==true){
//                     w="red";
//                     t=t+w+" ";}
//                 else{
//                     t=t+w+" ";
//                     k=i+1;
//                 }
//             }
            
//         }
//         System.out.println(t);

//     }
    
// }

//okay
import java.util.*;
class Change {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(str.replace("blue","red"));
    }
}
