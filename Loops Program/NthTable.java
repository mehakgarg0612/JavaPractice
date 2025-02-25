import java.util.Scanner;

public class NthTable {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();
        // int multiply = 1;

        for(int number = 1; number<=10 ; number ++)
        {
                System.out.println(user + "x" + number + "=" + (user*number));
        }
}
}
