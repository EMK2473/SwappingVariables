package SwappingVariables;

import java.util.Scanner;

public class SwappingVariables {
   
   public static void swapValues(int[] intArray){
    int tempVal = intArray[0];
    intArray[0] = intArray[1];
    intArray[1] = tempVal;

    tempVal = intArray[2];
    intArray[2] = intArray[3];
    intArray[3] = tempVal;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 4;
      int[] values = new int[NUM_ELEMENTS];

      for(int i = 0; i < values.length; ++i){
        values[i] = scnr.nextInt();
        System.out.println(values[i]);
      }
      scnr.close();
   }
}
