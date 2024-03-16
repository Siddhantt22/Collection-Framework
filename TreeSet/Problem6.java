import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        TreeSet<String>t_set=new TreeSet<>();
        t_set.add("red");
        t_set.add("blue");
        t_set.add("yellow");
        t_set.add("green");
        t_set.add("purple");
        TreeSet<String> t_Set2 = (TreeSet<String>)t_set.clone();

     System.out.println("First tree set : "+t_set);

        System.out.println("Second tree after cloning : "+t_Set2);


    }
}
