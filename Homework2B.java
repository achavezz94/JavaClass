
import java.util.*;

public class Homework2B {

  public static void main(String[] args){
    TicTacToe game = new TicTacToe();
    game.printBoard();
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
    System.out.println("hello");
  }

  public void printBoard(){
    System.out.println("----------");

    for (int i = 0; i < 3; i++){
      System.out.print("| ");
      for (int j = 0; j < 3; j++){
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-----------");
    }
  }

}
