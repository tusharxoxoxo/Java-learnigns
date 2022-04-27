import java.util.Scanner;
public class fizzbuzz{
  public static void main(String[] args){
      
    System.out.println("Enter your fizzer");
    Scanner scanner = new Scanner(System.in);
      int no = scanner.nextInt();
    
    if(no % 5 == 0) System.out.println("fizz");
    else if(no % 3 == 0) System.out.println("buzz");
    else if(no % 3 == 0 && no % 5 == 0) System.out.println("fizzbuzz");
    else System.out.println("not fizzbuzz");
      
  }
}
