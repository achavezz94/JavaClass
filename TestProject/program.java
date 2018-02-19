import java.util.*;

class program{

  public static void main(String[] args){

      char [][] a = new char[3][3];
      display(a);

      makeaMove(a,'X');

      Won(a, 'X');
  }
  static void display(char[][] b){

    for (int i = 0; i < 3; i++){
      System.out.print("| ");
      for (int j=0;j < 3;j++)
      System.out.print(b[i][j] != '\u0000' ? b[i][j]+" | ": " | ");
         System.out.println("\n----------");
    }
  }
  static void makeaMove(char[][] b, char p){
    boolean done =false;
    Scanner input = new Scanner(System.in);
    do{
      System.out.print("enter a row " + p + " : ");
      int row = input.nextInt();
      System.out.print("enter a column " + p + " : ");
      int column = input.nextInt();
      if(b[row][column]=='\u0000'){
        b[row][column]=p;
        done = true;
      }else
        System.out.println("the cell is not empty");
    }while(!done);
  }

  static void Won(char[][] b, char p){
    for(int i=0;i<3;i++)
      if(p==b[i][0] && p==b[i][1] && p==b[i][2])
      System.out.println("you won");
    }

}
