import java.util.ArrayList;
import java.util.Arrays;

public class Part2 {
    public static void main(String[] args){
        anArrayIterator();

    }
    public static void anArrayIterator(){
        String[] names = {"Bob", "Kenn", "Kevin", "Erin"};
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList(names));
        for(String item: studentList){
            System.out.println(item);
        }
    }
}
