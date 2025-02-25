import java.util.Scanner;

public class Count_the_numberOf_digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer number");
        int user = input.nextInt();

    int count = 0;
    while(user > 0){
       user =  user / 10;
       count = count + 1;

    }
    System.out.println(count);


    
}
}
