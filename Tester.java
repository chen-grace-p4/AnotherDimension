import java.util.Arrays;
public class Tester{
  public static void main(String[]args) {
    int[] TesterA = {100,9,8,0,3,4,990};
    int[][] TesterB = { {1,2,3}, {3,4,5}, {1,2}};
    int[][] TesterC = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 } };
    int[][] TesterD = { {  1,  2, 3, 4 },
                        {  2, 3,  4,  1 },
                        { 3, 4,  1, 2 } };
    //System.out.print(ArrayOps.sum(TesterA));

    //System.out.print(ArrayOps.largest(TesterA));

    //System.out.print(Arrays.toString( ArrayOps.sumRows(TesterB) ));

    //System.out.print(Arrays.toString(ArrayOps.largestInRows(TesterC)));

    //System.out.println(ArrayOps.sum(TesterC));
    //System.out.print(ArrayOps.sum(TesterB));

    //PART 5
    //System.out.print(Arrays.toString(ArrayOps.sumCols(TesterC)));

    System.out.println(ArrayOps.isRowMagic(TesterC));
    System.out.print(ArrayOps.isRowMagic(TesterD));
  }
}
