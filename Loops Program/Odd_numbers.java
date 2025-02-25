// import java.util.*;
// public class Odd_numbers {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter integer number");
//         int user = input.nextInt();
//         for(int number = 0; number <= user; number++){
//             if(number%3 == 0 && (number%2!=0 && number%3!=0)){
//                 System.out.println("All odd number: "+ number);
//             }
// }
//     }
// }

import java.util.*;

public class Odd_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();

        System.out.println("All odd numbers up to " + user + ":");
        for (int number = 1; number <= user; number += 2) { 
            System.out.println(number);
        }
    }
}

