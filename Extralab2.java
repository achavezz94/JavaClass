public class Extralab2{
  public static void main(String[] args){
    // create 4 by 4 array
    int[][] matrix = new int[4][4];
    int row0 = 0;
    int row1 = 0;
    int row2 = 0;
    int row3 = 0;
    int col0 = 0;
    int col1 = 0;
    int col2 = 0;
    int col3 = 0;
    int count = 0;

    //fill array with 0 and 1 randomly
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < 4; j++){
        matrix[i][j] = (int)(Math.random()*2);
      }
    }
    //print the array
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < 4; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println(" ");
    }
    //find the column with most 1s
    for (int col = 0; col < 4; col++){
        if( matrix[col][0] == 1){
          col0++;

      }
    }
    for (int col = 0; col < 4; col++){
        if( matrix[col][1] == 1){
          col1++;

      }
    }
    for (int col = 0; col < 4; col++){
        if( matrix[col][2] == 1){
          col2++;

      }
    }
    for (int col = 0; col < 4; col++){
        if( matrix[col][3] == 1){
          col3++;

      }
    }
    if (col0 > col1 && col0> col2 && col0 > col3){
      System.out.println("The first column has the most ones");
    } else if( col1 > col2 && col1 > col3){
      System.out.println("The second column has the most ones");
    } else if (col2 > col3){
      System.out.println("The third column has the most ones");
    } else{
      System.out.println("The fourth column has the most ones");
    }

    //find the row with most 1s
    for (int row = 0; row < 4; row++){
        if( matrix[0][row] == 1){
          row0++;

      }
    }
    for (int row = 0; row < 4; row++){
        if( matrix[1][row] == 1){
          row1++;

      }
    }
    for (int row = 0; row < 4; row++){
        if( matrix[2][row] == 1){
          row2++;

      }
    }
    for (int row = 0; row < 4; row++){
        if( matrix[3][row] == 1){
          row3++;

      }
    }
    if (row0 > row1 && row0> row2 && row0 > row3){
      System.out.println("The first row has the most ones");
    } else if( row1 > row2 && row1 > row3){
      System.out.println("The second row has the most ones");
    } else if (row2 > row3){
      System.out.println("The third row has the most ones");
    } else{
      System.out.println("The fourth row has the most ones");
    }
  }
}
