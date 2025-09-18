import java.util.Scanner;

public class Assignment1Program2 {
  public static String convertToBase(int number, int base) {
if (number < base) {
return Integer.toString(number);
} else {
  return convertToBase(number / base, base) +
  (number % base);
}
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter base (2-9): ");
    int base = sc.nextInt();

    int maxInBase10 = (int) (Math.pow(base, 4) - 1);

    System.out.println("maximun 4 digit base 10 number in base " + base + " is " + maxInBase10 + " . ");

    System.out.println("enter base 10 number in the range 0 to " + " 67 convert: ");
    int number = sc.nextInt();

    String converted = convertToBase(number, base);

    System.out.println(number + " (base 10) = " + converted + " (base " + base + ") ");

    sc.close();
  }
}
