// import java.util.Scanner;

// public class Sum_of_digits {
//      public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an integer number:");
//         int user = input.nextInt();
//         int remainder;

//         int sum = 0;
//         while(user>0){
//             remainder = user % 10;
//             sum = sum + remainder;
//             user = user / 10;
            
//         }
//         System.out.println("Sum of digits :" + sum);
// }
// }


import java.util.Scanner;

public class Sum_of_digits {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int user = input.nextInt();

        int count = 0;
        while(user>0){  
          user = user /  10;   
          count = count + 1; 
            
        }
        System.out.println("Sum of digits :" + count);
}
}

