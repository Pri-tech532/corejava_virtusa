import java.util.*;
class Arraytolist {
    public static void main(String args[])
    {
        String[] courses={"python", "hadoop"};
        List<String> coursesList =new LinkedList<>();
        for (String s: courses)
        {
            coursesList.add(s);
        }
        coursesList.add("1");
        System.out.println(courses);
        System.out.println(coursesList);
        

        



    
    } 
    
}
