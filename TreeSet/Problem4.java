import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        TreeSet<String>t_set=new TreeSet<>();
        t_set.add("red");
        t_set.add("blue");
        t_set.add("yellow");
        t_set.add("green");
        t_set.add("purple");
        
        Iterator<String>iterator=t_set.descendingIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }
}
