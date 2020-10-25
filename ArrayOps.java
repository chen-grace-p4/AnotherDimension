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
  public static int[] largestInRows(int[][] matrix) {
    int[] retarr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      retarr[i] = largest(matrix[i]);
    }
    return retarr;
  }
  public static int sum(int[][] arr) {
    int sumcounter = 0;
    for (int i=0; i < arr.length; i++) {
      for (int j=0; j < arr[i].length; j++) {
        sumcounter += arr[i][j];
      }
    }
    return sumcounter;
  }
  //PART 5
  public static int[] sumCols(int[][] matrix) {
    int[] retarr = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      int sums = 0;
      for (int j = 0; j < matrix.length; j++) {
        sums += matrix[j][i];
      }
      retarr[i] = sums;
    }
    return retarr;
  }
  public static boolean isRowMagic(int[][] matrix) {
    String returnstr = "f";
    int[] sumarr = sumRows(matrix);
    for (int i = 0; i < sumarr.length; i++ ) {
      if (sumarr[i] == sumarr[0]) {
        returnstr = "t";
      }else return false;
    }
    return returnstr == "t";
  }
}
