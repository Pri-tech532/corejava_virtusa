import java.util.*;
class Set {
    public static void main(String[] args)
    {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Apple");
    list.add("Grape");
    list.add("Mango");
    list.add("Banana");
    list.add("Strawberry");
    System.out.println(list);
    System.out.println(list.set(2, "kiwi"));
    System.out.println(list.set(3, "orange"));
    System.out.println(list);
    }
}
