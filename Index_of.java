import java.util.*;
public class Index_of {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Joker");
        list.add("Oder");
        list.add("Older");
        list.add("Order");
        System.out.println(list);
        System.out.println("index of order "+ list.indexOf("Order"));
    }
    
}
