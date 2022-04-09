import java.util.Arrays;

public class multiArray {
  public static void main(String[] args) {
    int[][] numbers = new int[2][3];
    numbers[0][0] = 1;
    // numbers[0][1] = 34;
    // numbers[1][0] = 345;
    // numbers[1][1] = 34;
    System.out.println(Arrays.deepToString(numbers));


    int[][][] numberss = new int[2][3][3];
    numberss[0][0][0] = 1;
    System.out.println(Arrays.deepToString(numberss));

    int[][] chumbers = {{1, 2, 3}, {2, 3, 5}};
    System.out.println(Arrays.deepToString(chumbers));
  }
}
