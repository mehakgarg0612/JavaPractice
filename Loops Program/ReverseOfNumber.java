import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();

        int number = user;
        int remainder;
        int reverse = 0;

      while (number > 0){
        remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
      }
      System.out.println("Reverse of a number is: "+ reverse);
}
}
