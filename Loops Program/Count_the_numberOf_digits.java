import java.util.Scanner;

public class Count_the_numberOf_digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer number");

        try{
        int user = input.nextInt();
            user = Math.abs(user);
        if(user == 0){
            System.out.println("Count of digit is 1");
            return;
        }

    int count = 0;
    while(user > 0){
       user =  user / 10;
       count = count + 1;

    }
    System.out.println("Count of digits: " + count);
}
catch(Exception e){
    System.out.println("You have enter invalid input");
}


    
}
}


