import java.math.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class mortage_calculator {
  public static void main(String[] args) {
    System.out.print("Enter the Principle Amount:");
    Scanner scanner = new Scanner(System.in);
    double principle = scanner.nextDouble();
    System.out.print("Enter the Annual Rate of Interest:");
    Scanner canner = new Scanner(System.in);
    double rate = canner.nextDouble();
    System.out.print("Enter the number of Months:");
    Scanner banner = new Scanner(System.in);
    double numberOfmonths = banner.nextDouble();
    rate = ((rate / 100) / 12);
    double gate = rate + 1;
    double exponent = Math.pow(gate, numberOfmonths);
    double mortage = (principle * ((rate * exponent) / (exponent - 1)));
    String mortagee = NumberFormat.getCurrencyInstance().format(mortage);
    System.out.println("Your monthly mortage is:" + mortagee);
  }
}
