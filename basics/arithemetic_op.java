public class arithemetic_op{
  public static void main(String[] args){
      int result = 10 + 1;
      System.out.println(result);
      result = 12 - 1;
    System.out.println(result);
    result = 11 * 1;
    System.out.println(result);
    result = 11 / 1;
    System.out.println(result);
    double result1 = (double) 11 / (double) 1;
    System.out.println(result1);
    double result2 = (double) 32 / (double) 3;
    System.out.println(result2);


    int x = 1;
    int y = x++;  // first value is assigned then increament happens
    int z = ++x;  //first increament happens then value is assigned
    System.out.println(y);
    System.out.println(z);
    System.out.println(x);
  }
}
