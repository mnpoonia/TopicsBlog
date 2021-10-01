package lcs;

import java.util.Arrays;

public class LCSIntegerArray {

  /**
   *
   * @param arr1
   * @param arr2
   * @return longest common subsequence length
   */
  public int findLCS(int[] arr1, int[] arr2) {
    // For LCS use a matrix of arr1.size and arr2.size
    int length = 0;
    int numOfRows = arr1.length; // equals string 1 length +1
    int numOfCols = arr2.length; // equlas string 2 lenght + 1
    System.out.println(numOfRows);
    System.out.println(numOfCols);

    int[][] storageArr = new int[numOfRows+1][numOfCols+1];
    initialize(numOfRows, numOfCols, storageArr);
    for (int i=0;i<numOfRows;i++) {
      int i1 = arr1[i];
      for(int j =0;j<numOfCols;j++) {
        if (i1 == arr2[j]) {
          storageArr[i+1][j+1] = storageArr[i][j] + 1;
          print2DArray(storageArr);
        } else {
          storageArr[i+1][j+1] = Math.max(storageArr[i][j+1], storageArr[i+1][j]);
          print2DArray(storageArr);
        }
      }
    }
    length = storageArr[numOfRows][numOfCols];
    return length;
  }

  private void initialize(int length1, int length2, int[][] storageArr) {
    //initialize first row and column as 0
    for (int i = 0; i<= length2; i++) {
      storageArr[0][i] = 0;
    }
    for (int i = 0; i<= length1; i++) {
      storageArr[i][0] = 0;
    }
  }

  private void print2DArray(int[][] storageArr) {
    for (int[] x : storageArr)
    {
      for (int y : x)
      {
        System.out.print(y + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
