public class Part1 {

    public static void main(String[] args) {
        int lastNumber = 100;
        System.out.println("Starting Count to " + lastNumber);
        countTheNumbers(lastNumber);
        }

    public static void countTheNumbers(int lastNumber){
        for(int counter =0; counter < lastNumber; counter ++){
            System.out.println(counter);
        }
    }
}
