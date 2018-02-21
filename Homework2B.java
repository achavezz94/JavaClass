
import java.util.*;

public class Homework2B {

  public static void main(String[] args){
    TicTacToe game = new TicTacToe();
    game.isBoardFull();
    if (isBoardFull == false){
      game.printBoard();
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      game.placeMark(row,col);
      game.printBoard();
    }

  }

}

class TicTacToe {
  private char[][] board;
  private char currentPlayerMark;

  public TicTacToe(){
    board = new char[3][3];
    currentPlayerMark = 'X';
    initializeBoard();
  }

  public void initializeBoard() {
    for (int i = 0; i < 3; i++){
      for(int j = 0; j < 3;j++){
        board[i][j] = '-';
      }
    }
  }

  public void printBoard(){
    System.out.println("\n-------------");

    for (int i = 0; i < 3; i++){
      System.out.print("| ");
      for (int j = 0; j < 3; j++){
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("\n-------------");
    }
  }

  public boolean isBoardFull(){
    boolean isFull = true;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3 ;j++ ) {
        if(board[i][j] == '-'){
          isFull = false;
        }
      }
    }
    return isFull;
}

public void changePlayer() {
     if (currentPlayerMark == 'x') {
         currentPlayerMark = 'o';
     }
     else {
         currentPlayerMark = 'x';
     }
 }

 public boolean placeMark(int row, int col) {

      // Make sure that row and column are in bounds of the board.
      if ((row >= 0) && (row < 3)) {
          if ((col >= 0) && (col < 3)) {
              if (board[row][col] == '-') {
                  board[row][col] = currentPlayerMark;
                  return true;
              }
          }
      }

      return false;
    }

}
