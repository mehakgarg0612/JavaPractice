import java.util.Scanner;

public class ProductDigits {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();

        int remainder;
        int multiply = 1;
        while(user > 0){
            remainder = user % 10;
            multiply = multiply * remainder;
            user = user/10;
        }

        System.out.println(multiply);
}
}
