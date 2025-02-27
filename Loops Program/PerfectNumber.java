import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");

        try{
        int user = input.nextInt();
        if(user < 0){
          System.out.println("Number is not palindrome (Negative numbers cannot be palindromes).");
          return;
        }
            int remainder;
            
        for(int number = 1 ; number<=user ; number++){

        }
        }

        catch (Exception e) {
            System.out.println("you have enter invalid input");
        }
}
}
