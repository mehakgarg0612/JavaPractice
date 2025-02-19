/*public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello2222, World!");
    }
}

for(int i = 1;i<=5;i++)
{
    System.out.println("I will not eat all the cookies 🍪 " + i);
}

Write a program to check whether a number is even or odd.
*/
class HelloWorld {
    static  Boolean  num;
    public static void main(String[] args){
        EvenOdd();
        //DataType();
        
        System.out.println(num);

    }

    public static void DataType()
    {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println("hello my name is sunil");
        System.out.print("hello my name is mehak");
        System.out.println(myNum+" "+myBool);
    

        }
    
    public static void EvenOdd()
    {
            String nae=null;
        int num = 2;
        String name="Mehak";
        if (num % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}