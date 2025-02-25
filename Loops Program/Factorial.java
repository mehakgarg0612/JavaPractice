import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();
        int multiply = 1;
        for(int number = 1 ; number <= user ; number++){
            multiply = multiply * number;
        }
        System.out.println("Factorial of a number : "+ multiply);
}
}
