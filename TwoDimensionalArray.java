/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  
import java.util.Arrays;
/**
 *
 * @author achavezz
 */
public class TwoDimensionalArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] RandomNumbers = new int [10][10];
        for(int i=0;i<RandomNumbers.length; i++){
            for (int j=0; j<RandomNumbers[i].length;j++){
                RandomNumbers[i][j]= (int)(Math.random()*100);
            }
        }

        //print count array
        for (int i=0; i<RandomNumbers.length; i++){
            for (int j=0; j<RandomNumbers[i].length;j++)
                System.out.print(RandomNumbers[i][j]+" ");
            System.out.println(" ");
        }
        //Search for max and min
        int max=RandomNumbers[0][0];
        int min=RandomNumbers[0][0];
        int RowMax = 0, ClmMax = 0;
        int RowMin = 0, ClmMin = 0;
        for (int i=0; i<RandomNumbers.length; i++){
            for (int j=0; j<RandomNumbers[i].length;j++){
                if (RandomNumbers[i][j]>=max){
                    max=RandomNumbers[i][j];
                    RowMax = i; ClmMax=j;
                }
                if (RandomNumbers[i][j]<=min){
                    min = RandomNumbers[i][j];
                    RowMin = i; ClmMin = j;
                }
            }
        }
        System.out.println("Min number is: " + min + " row min is: " + RowMin +" " +ClmMin);
        System.out.println("Max number is: " + max+ " row m is: " + RowMax +" " +ClmMax);

    }
}
