import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int element=6;
        int index=3;
        list.add(index,element);
       
        System.out.println(list);
}
}


