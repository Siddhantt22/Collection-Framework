import java.util.ArrayList;

public class Problem4 {

    
    public static void main(String[] args) {
    ArrayList<String>Color=new ArrayList<>();
    Color.add("red");
    Color.add("blue");
    Color.add("purple");
    Color.add("black");
    int index=2;
 if(index<Color.size())
 {
    System.out.println(Color.get(index));
 }
 else{
    System.out.println("out of bound");
 }
}
}