import java.util.Scanner;

public class Reverse_order_from_Nto1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer number");
        int user = input.nextInt();

        for(int number = user; number > 0 ; number-- ){
            System.out.println("Reverse order from Nth to 1 :"+ number);
        }
}
}