import java.util.Arrays;

class ExtraLab1 {
  public static void main(String[] args) {

    int numarray[] = new int[100];

    for (int i=0; i <numarray.length; i++){
        numarray[i]= (int)(Math.random()*10);
        System.out.println(numarray[i]);
    }

    int randnum = (int) (Math.random()*10);
    System.out.println("This number will be searched: " + randnum);

    for (int i=0; i <numarray.length; i++){
      if (randnum == numarray[i]){
        boolean found = true;
        break;
      }
      else{
        boolean found = false;
      }
    }

    if (found){
      System.out.println("The number's index: " + i);
    }
    else
      System.out.println("No");


      Arrays.sort(numarray);

    for (int i=0; i <numarray.length; i++){
      System.out.println(numarray[i]);
    }

  }
}
