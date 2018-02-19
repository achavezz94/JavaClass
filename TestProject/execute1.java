public class execute1{
  static void display(char[][] b){

    for (int i = 0; i < 3; i++){
      System.out.print(" | ");
      for (int j=0;j < 3;j++)
      System.out.print(b[i][j] != '\0000' ? b[i][j]+" | ": " | ");
         System.out.println("\n----------");
    }

  }
}
