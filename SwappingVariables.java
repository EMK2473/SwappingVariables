package SwappingVariables;

import java.util.Scanner;

public class SwappingVariables {
   
   /* Define your method here */
   public static void swapValues(int[] intArray){
    int tempVal = intArray[0];
    intArray[0] = intArray[1];
    intArray[1] = tempVal;

    tempVal = intArray[2];
    intArray[2] = intArray[3];
    intArray[3] = tempVal;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
   }
}
