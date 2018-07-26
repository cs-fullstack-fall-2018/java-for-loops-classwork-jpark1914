import java.util.ArrayList;
import java.util.Arrays;

public class Part2 {
    public static void main(String [] args){
        String[] names = {"Bob","Kenn","Kevin","Erin"};
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList(names));
        arrayLoop(studentList);
    }
    public static void  arrayLoop(ArrayList<String> anArray){
        for(String item: anArray){
            System.out.println(item);
        }

    }
}
