public class ArrayOps {
  public static int sum(int[] arr) {
    int sumcounter = 0;
    for (int i=0; i < arr.length; i++) {
      sumcounter += arr[i];
    }
    return sumcounter;
  }
}
