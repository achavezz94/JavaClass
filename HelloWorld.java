import java.util.Scanner;
public class HelloWorld {
    public static void main( String[] args ) {
      // TODO code application logic here
      //int counter = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Homework 1: ");
      double hw1 = input.nextDouble();
      if (hw1 > 100 || hw1 < 0 ){
        System.out.println("This is not a proper input");
      }else{
        System.out.println("this is okay");
      }

      //while (counter < 2){
        //Scanner input = new Scanner(System.in);
        //System.out.println("Homework 2: ");
        //System.out.println("Homework 1: ");
        //double hw1 = input.nextDouble();
        //counter += 1;
        }
    }
