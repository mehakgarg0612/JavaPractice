import java.util.Scanner;

public class SumOf_N_naturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();
        int sum = 0;
        for(int number =1 ; number<=user ; number++){
            sum = sum + number;

        }
        System.out.println("Sum of all natural numbers: " + sum);
}
}
