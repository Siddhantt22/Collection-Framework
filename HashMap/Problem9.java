import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        TreeSet<String>t_set=new TreeSet<>();
        t_set.add("red");
        t_set.add("blue");
        t_set.add("yellow");
        t_set.add("green");

        TreeSet<String>t_set2=new TreeSet<>();

        t_set2.add("purple");
        t_set2.add("red");
        t_set2.add("pink");
        t_set2.add("green");

        
        for(String element :t_set)
        {
            if(t_set2.contains(element))
            {
                System.out.println("Yes it contains "+element);
                continue;
            }
            else{
                System.out.println("No it doesnt contain "+ element);

            }

        }




    }
}
