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
        System.out.println("The number was found in the array in index: " + i);
        break;
      }
    }



  }

}
