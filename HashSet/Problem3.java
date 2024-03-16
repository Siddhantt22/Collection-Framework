import java.util.*;
public class Problem3{
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2 );
        set.add(3 );
        set.add(4); 
        set.add(4); 
        int element=5;
        set.add(element);
       
        int size=set.size();
        System.out.println(size);
}
}
