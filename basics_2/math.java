public class math{
  public static void main(String[] args){
    int result = Math.round(1.1F);
    System.out.println(result);

    double besult = Math.ceil(1.1F);
    System.out.println(besult);

    int zesult = (int)Math.ceil(1.1F);
    System.out.println(zesult);

    int aesult = (int)Math.floor(1.1F);
    System.out.println(aesult);

    int maxxy = Math.max(1, 3);
    System.out.println(maxxy);

    int minssy = Math.min(1, 3);
    System.out.println(minssy);


    double randomm = Math.random();
    System.out.println(randomm);
    // the above no. is floating point random no. between 0 and 1.1

    double garden = Math.random() * 100;
    System.out.println((garden));
    // the above will return a random floating point no. between 0 and 100

    double barden = Math.round(Math.random() * 100);
    System.out.println(barden);
  }
}
