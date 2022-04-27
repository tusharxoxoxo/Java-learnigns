public class casting{
  public static void main(String[] args){
    short x = 34;
    int y = x + 34;
    System.out.println(y);
    // implicit casting is happening in the above case
    // it is automatically happening firstly the variable x is copied into another variable then 
    // it is added to y
    // it is called automatic conversion


    // byte automatically converted into  short(>) > int > long > float > double
    


    //explicit casting 
    double j = 2.30;
    int k = (int)j + 34;
    System.out.println(k);


    String g = "34";
    int h = Integer.parseInt(g) + 3;
    System.out.println(h);
  }
}
