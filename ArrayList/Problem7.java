import java.util.ArrayList;

public class Problem7 {

    public static int searchElement(ArrayList<String> color, String s) {
       
        for (int i=0;i<color.size();i++) {
            if (color.get(i) == s) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
    ArrayList<String>Color=new ArrayList<>();
    Color.add("red");
    Color.add("blue");
    Color.add("purple");
    Color.add("black");
    Color.add("grey");
    
    String s="purple";
    int index=searchElement(Color, s);
    if(index!=0)
    {
        System.out.println("Found element at index :"+index);
    }
    else{
        System.out.println("not found the element");
    }
    
    
    
}
}
