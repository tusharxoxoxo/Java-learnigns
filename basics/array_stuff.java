import java.util.Arrays;

public class array_stuff {
  public static void main(String[] args) {
    // int[] numbers = new int[5];
    // numbers[0] = 1;
    // numbers[1] = 2;
    // System.out.println(Arrays.toString(numbers));

    int[] chumbers = {1, 2, 3, 333, 34};
    System.out.println(chumbers.length);
    System.out.println(Arrays.toString(chumbers));
    Arrays.sort(chumbers);

    System.out.println(Arrays.toString(chumbers));
  }
}
