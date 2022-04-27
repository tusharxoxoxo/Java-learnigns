import java.text.NumberFormat;
public class format_numbers{
  public static void main(String[] args){
    //NumberFormat currency = new NumberFormat;
    // the above line will show error because it NumberFormat is an abstract it cannot be instantiated
    // try random stupid stuff
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(234234.234);
    System.out.println(result);
 // slkjflsjfjs dfj alkjfl jsdf;lkj as;lkfj ;   
    

    NumberFormat percentage = NumberFormat.getPercentInstance();
    String besult = percentage.format(.34);
    System.out.println(besult);

    //but there is a better way of doing the same thing
    String chertentage = NumberFormat.getPercentInstance().format(.64);
    System.out.println(chertentage);

  }
 }
