import java.util.*;
public class CubesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number");
        int user = input.nextInt();
        int sum = 0;
        int multiply = 1;

        for (int number = 1; number <= user; number++) {
            multiply = number * number * number;
            sum = sum + multiply;
        }
        System.out.println("Total Sum of cubes of all number :" + sum);
    }

}
