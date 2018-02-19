public class TicTacToe {
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

}
