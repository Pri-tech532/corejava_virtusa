import java.util.*;
class Pop 
{
    public static void main(String[] args)
    {
        LinkedList<String> stack = new LinkedList<String>();
        stack.push("A");
        stack.push("B");
        System.out.println(stack);
        String s=stack.pop();//stack.pop(); works only for pop operation
        System.out.println(s);
        stack.push("C");
        System.out.println(stack);

    }
    
}
