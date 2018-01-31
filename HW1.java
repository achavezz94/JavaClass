
import java.util.Random;


public class HW1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int count = 0;


        while (count <= 1000){
            double n = rand.nextInt(9) + 0;
            System.out.println("Count = "+ count + " Random #: " + n);
            count += 1;
        }

    }

}
