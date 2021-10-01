package lcs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LCSIntegerArrayTest {
  @Test
  public void testFindLCSDupArray() {
    LCSIntegerArray lcs = new LCSIntegerArray();
    int[] arr1 = new int[] {1,2,3,4,5};
    int[] arr2 = new int[] {1,2,3,4,5};
    int lcs1 = lcs.findLCS(arr1, arr2);
    System.out.println("Longest common subsequence length is " + lcs1);
    assertEquals(lcs1, arr1.length);
  }

  @Test
  public void testFindLCSSubArray() {
    LCSIntegerArray lcs = new LCSIntegerArray();
    int[] arr1 = new int[] {1,2,3};
    int[] arr2 = new int[] {1,2,3,4,5};
    int lcs1 = lcs.findLCS(arr1, arr2);
    System.out.println("Longest common subsequence length is " + lcs1);
    assertEquals(lcs1, arr1.length);
  }

  @Test
  public void testFindLCSRandArray() {
    LCSIntegerArray lcs = new LCSIntegerArray();
    int[] arr1 = new int[] {1,2,5,3,6,4};
    int[] arr2 = new int[] {1,2,3,4,5,6};
    int lcs1 = lcs.findLCS(arr1, arr2);
    System.out.println("Longest common subsequence length is " + lcs1);
    assertEquals(lcs1, 4);
  }

}