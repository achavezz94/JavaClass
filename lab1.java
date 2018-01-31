import java.util.Scanner;
public class lab1 {
    public static void main( String[] args ) {
      // TODO code application logic here
       Student arr[];
       arr= new Studnet[2];
       System.out.println ("feed me the first student");
       arr[0] = new Student(0, input.)




      Scanner input = new Scanner(System.in);
      System.out.println("Welcome ");
      System.out.println("Homework 1: ");
      double hw1 = input.nextDouble();
      while (hw1 > 100 || hw1 < 0 ){
        System.out.println("This is not a proper input");
        hw1 = input.nextDouble();
      }

      System.out.println("Homework 2: ");
      double hw2 = input.nextDouble();
      while (hw2 > 100 || hw2 < 0 ){
        System.out.println("This is not a proper input");
        hw2 = input.nextDouble();
      }

      System.out.println("Homework 3: ");
      double hw3 = input.nextDouble();
      while (hw3 > 100 || hw3 < 0 ){
        System.out.println("This is not a proper input");
        hw3 = input.nextDouble();
      }

      System.out.println("Midterm: ");
      double mt = input.nextDouble();
      while (mt> 100 || mt < 0 ){
        System.out.println("This is not a proper input");
        mt = input.nextDouble();
      }

      System.out.println("Final Exam: ");
      double finalExam = input.nextDouble();
      while (finalExam > 100 || finalExam < 0 ){
        System.out.println("This is not a proper input");
        finalExam = input.nextDouble();
      }

      double hwAvg= (hw1+hw2+hw3) /3;
      double  Avg= hwAvg*0.3+mt*0.3+ finalExam*0.4;
      System.out.println("Your Final Grade is :" +Avg);

     if(90<=Avg && Avg<=100)
        System.out.println("Your Final Grade is A");
     else if(80<=Avg)
        System.out.println("Your Final Grade is A-");
     else if(75<=Avg)
         System.out.println("Your Final Grade is B+");
     else if(70<=Avg)
         System.out.println("Your Final Grade is B");
     else if(60<=Avg)
         System.out.println("Your Final Grade is C");
     else
         System.out.println("Your Final Grade is F");

    }
}
