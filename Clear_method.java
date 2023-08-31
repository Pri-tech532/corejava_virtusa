import java.util.*;
public class Clear_method {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();
        list.add("To");
        list.add("be");
        list.add("Cleared at end");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("hi");
        System.out.println(list);
    }

    
}
