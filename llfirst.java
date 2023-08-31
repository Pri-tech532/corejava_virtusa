import java.util.*;
class Main {
    public static void main(String args[]){
        LinkedList<String> list= new LinkedList<String>();
        list.add("welcome");
        list.add("hello");
        list.add("hi");


        Collection<String> collect= new ArrayList<String>();
        collect.add("1st");
        collect.add("2nd");
        collect.add("3rd");
        collect.add("4th");
        collect.add("5th");

        System.out.println("The linked list before appending collection is: " + list);
        list.addAll(collect);
        System.out.println("The linked list after appending collection is: " + list);
    }
    
}
