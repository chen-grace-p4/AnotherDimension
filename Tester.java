public class Tester{
  public static void main(String[]args) {
    int[] TesterA = {100,9,8,0,3,4,990};
    int[][] TesterB = { {1,2,3}, {3,4,5}, {1,2}};
    //System.out.print(ArrayOps.sum(TesterA));
    //System.out.print(ArrayOps.largest(TesterA));
    System.out.print(ArrayOps.sumRows(TesterB));
    //^^I tested the above in a Java Visualizer to see if the array
    //^^returned was correct and it is indeed correct.
  }
}
