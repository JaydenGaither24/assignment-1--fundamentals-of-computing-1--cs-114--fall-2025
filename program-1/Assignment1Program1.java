import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void printInitials() {
    System.out.println(" JJJJJJJJJJJJJJJJJJJJ    GGGGGGGGGGGGG   ");
    System.out.println("         JJJJ          GGGG       GGGG  ");
    System.out.println("         JJJJ          GGGG             ");
    System.out.println("         JJJJ          GGGG             ");
    System.out.println("         JJJJ          GGGG             ");
    System.out.println("         JJJJ          GGGG     GGGG    ");
    System.out.println("         JJJJ          GGGG       GGGGG ");
    System.out.println("         JJJJ          GGGG        GGGG ");
    System.out.println(" JJJ     JJJJ          GGGG        GGGG ");
    System.out.println("  JJJ    JJJ            GGGGGGGGGGGGG   ");
    System.out.println("    JJJJJJJJ              GGGGGGGGGGG   ");

  }

  public static double convertToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5.0 / 9.0;
  }

  public static String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    printInitials();

    System.out.print("Enter a 5-character string: ");
    String inputStr = scanner.nextLine();

    if (inputStr.length() != 5) {
      System.out.println("Invalid input. Please enter exactly 5 characters. ");
      scanner.close();
      return;
    
    }

    String middle = inputStr.substring(1, 4);
    String reversedMiddle = reverseString(middle);

    System.out.print("Enter temperature in farenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = convertToCelsius(fahrenheit);

    int randomNum = rand.nextInt(16384 - 32 + 1) + 32;

    System.out.println("\n--- Final Output ---");
    System.out.println("Reversed middle characters: " + reversedMiddle);
    System.out.printf("Temperature in Celsius: %.2f\n", celsius);
    System.out.println("Random number: " + randomNum);

    String finalOutput = reversedMiddle + "-" + String.format("%.2f", celsius) + "-" + randomNum;
    System.out.println("Combined Result: " + finalOutput);

    scanner.close();
  }
}
