import java.util.*;
public class Problem8{
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        set.add(4);
        set.add(1);
        set.add(33);
        set.add(8 );
        set.add(70);
        set.add(4); 
        set.add(6); 
        int element=5;
        set.add(element);
        
        TreeSet<Integer>TreeSet=new TreeSet<>(set);

        System.out.println("The hashet is : " + set);
        System.out.println("hashet converted to treeset is : " + TreeSet);


        
}
}
