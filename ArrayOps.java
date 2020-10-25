public class ArrayOps {
  public static int sum(int[] arr) {
    int sumcounter = 0;
    for (int i=0; i < arr.length; i++) {
      sumcounter += arr[i];
    }
    return sumcounter;
  }
  public static  int largest(int[]arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] retarr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      retarr[i] = sum(matrix[i]);
    }
    return retarr;
  }
}
