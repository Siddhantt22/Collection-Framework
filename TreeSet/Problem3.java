import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        TreeSet<String>t_set=new TreeSet<>();
        t_set.add("red");
        t_set.add("blue");
        t_set.add("yellow");
        t_set.add("green");
        t_set.add("purple");
     TreeSet<String>t_Set2=new TreeSet<>();
     t_Set2.add("pink");
     t_Set2.add("grey");
     t_Set2.addAll(t_set);

     System.out.println("First tree set : "+t_set);

        System.out.println("Second tree set with all element is : "+t_Set2);


    }
}
