import java.util.Scanner;

public class App {
  private static boolean ehPalindromoExecution(char[] input) {
    int left = 0;
    int right = input.length - 1;
    for (int i = 0; i < input.length / 2; i++) {
      if (input[left] != input[right])
        return false;
      left = i;
      right = right - i;
    }
    return true;
  }

  private static boolean ehPalindromo(String input) {
    return ehPalindromoExecution(input.toCharArray());
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a palindrome: ");
    String input = sc.next();
    System.out.println(ehPalindromo(input));
    sc.close();
  }
}
