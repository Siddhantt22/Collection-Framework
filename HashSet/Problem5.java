import java.util.*;
public class Problem5{
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
   
       System.out.println("before removing is hashset empty : "+set.isEmpty() +", hashset is : " + set);
       set.clear();
       

        System.out.println("after removing is hashset empty : "+set.isEmpty() +", hashset is :"+ set);
}
}
