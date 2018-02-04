/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Alexis Chavez
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Random;

        Random rand = new Random();
        int numarray[] = new int[10001];
        for (int i = 0; i < numarray.length; i++){
            double n = rand.nextInt(10) + 0;
            numarray[i] = (int) n;
        }
        
        Arrays.sort(numarray);
        int countArray[] = new int[numarray[numarray.length-1]+1];
        for(int i:numarray){
            countArray[i] = countArray[i]+1;
        }
        for (int i=0;i<countArray.length;i++){
            System.out.println(i+" : " + countArray[i]);
        }
    }
}

    

