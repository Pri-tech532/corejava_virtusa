import java.util.*;
public class Clone_method {
    public static void main(String args[]){
        LinkedList<String> list= new LinkedList<String>();
        list.add("Best ");
        list.add("line to ");
        list.add("clone ");
        System.out.println("Before cloning"+list);
        LinkedList<String> nest = new LinkedList<String>();
        nest=(LinkedList<String>)list.clone();
        System.out.println("this the clone"+nest);

    }
    
}
