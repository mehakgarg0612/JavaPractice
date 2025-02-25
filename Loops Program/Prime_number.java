
import java.util.*;
public class Prime_number {

    public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter integer number");
int user = input.nextInt();
int temporary_no = 0;

for(int number = 2; number <= user-1 ; number++){
    if(user%number == 0){
        temporary_no = temporary_no + 1;
    }
}
if(temporary_no > 0){
    System.out.println("Number is not prime number");
}
else{
    System.out.println("Number is prime number");
}


// if (user <= 1){
//     System.out.println("Not a prime number");
// }
// else{

//     for(int number = 2 ; number <= user/2 ; number++)
//     {
//          if(user % number == 0){
//             System.out.println("Not a prime number");
//          }
//          else{
//             System.out.println("prime number");
//          }
//     }

// }


// }


}
}
    

