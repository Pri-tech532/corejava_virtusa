import java.util.*;
class OfferLast {
    public static void main(String[] args)
    {
        LinkedList<Comparable> list=new LinkedList<Comparable>();
        list.add("hello");
        list.add("how");
        list.add("are");
        System.out.println(list);
        list.offerLast("you");
        System.out.println(list);

    }
    
}
