import java.util.Scanner;

public class Fibonacci_series_Upto_N{
    
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an postive integer number:");


    try{
      int user = input.nextInt();
      if(user <= 0){
        System.out.println("You have enter invalid number");
        return;
      }
      int number1 = 0;
      int number2 = 1;
      System.out.println(number1);
      System.out.println(number2);
      for(int number = 1 ; number <= user ; number++)
      { int number3 = number1 + number2;

        // if (number3 > user) { 
        //   break;
        // }

        System.out.println(number3);
        number1 = number2;
        number2 = number3;
      }
    }
    catch(Exception e){
        System.out.println("You have enter invlaid input");
    }
}
}

