import java.util.*;
class OfferFirst {
    public static void main(String[] args)
    {
        LinkedList<Comparable> list=new LinkedList<Comparable>();
        list.add("C");
        list.add("Java");
        list.add("Oracle");
        System.out.println(list);
        list.offerFirst("Python");
        System.out.println(list);
    }
}
