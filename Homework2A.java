public class Homework2A{

  public static void main(String[] args) {
    //create two dimensional array
    int [][] rannum = new int [10][10];
    //add values to array
    for (int i =0; i<rannum.length;i++){
      for (int j =0; j<rannum.length;j++){
        rannum[i][j] = (int) (Math.random()*1000);
      }
    }
    //print array
    for (int i =0; i<rannum.length;i++){
      for (int j =0; j<rannum.length;j++){
        System.out.print(rannum[i][j]+ " ");
      }
      System.out.println(" ");
    }
    //search for first max
    int firstmax = rannum[0][0];
    int secondmax = rannum[0][0];
    int RowFirstMax = 0;
    int ClmFirstMax = 0;
    int RowSecondMax = 0;
    int ClmSecondMax= 0;

    for (int i = 0; i<rannum.length; i++){
      for (int j = 0; j<rannum.length; j++){
        if(rannum[i][j]>=firstmax){
          firstmax=rannum[i][j];
          RowFirstMax = i;
          ClmFirstMax = j;
        }
        if(rannum[i][j]>=secondmax && rannum[i][j] != firstmax){
          secondmax=rannum[i][j];
          RowSecondMax = i;
          ClmSecondMax = j;
        }
      }
    }

    System.out.println("First max number is: " + firstmax + " Row is: " + RowFirstMax + " Column is: " + ClmFirstMax);
    System.out.println("Second max number is: " + secondmax + " Row is: " + RowSecondMax + " Column is: " + ClmSecondMax);
  }

}
