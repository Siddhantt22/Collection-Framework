import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        TreeSet<String>t_set=new TreeSet<>();
        t_set.add("red");
        t_set.add("blue");
        t_set.add("yellow");
        t_set.add("green");
        t_set.add("purple");
        
        String First=t_set.getFirst();

        String Last=t_set.getLast();

            System.out.println("First element is : "+ First);
            System.out.println("Last element is : "+ Last);

        



    }
}
