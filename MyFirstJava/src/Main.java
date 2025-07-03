// Sit back🪑 , relax⛷️ and enjoy the show 🤭
// importing the utility for scanner which receives the users inputs
// this makes a class called scanner in your program

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // comments in java
        /* multi line
        comments
         */
        System.out.print("Hello world!\n");//println helps to print on anew line
        System.out.print("I like pizza !");// print helps to print only
        System.out.println(" Hello world !");
        System.out.println("I like pizza !");
        System.out.println();

        // ✅ variable =  a reusable container for a value
        //               a variable behaves as if it was the value it contains

        // 🔴primitive =  simple value stored directly in memory (stack)
        // 🔵reference =  memory address (stack) that points to the (heap)

        //   🔴primitive   vs   🔵reference
        //     --------         ---------
        //       int              string
        //       double           array
        //       char             object
        //       boolean

        // 2 steps to creating a variable
        // ------------------------------
        // 1. initialization
        // 2. declaration


        int age = 21 ;
        int year = 2025;
        System.out.println(age);
        System.out.println("The year is " + year);

        // double

        double price = 19.99;
        System.out.println("$" + price);

        // char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(currency);

        // boolean

        boolean isStudent = true;
        boolean isOnline = false;

        System.out.println(isOnline);

        if(isOnline){
            System.out.println("Uraceka!");
        }else{

            System.out.println("Waragoswe! ");
        }

        String name = "Bro Code";
        System.out.println("He is " + name + ". He likes pizza!");

        // printing multiple data types in one line
        System.out.println("Your name is " + name + " and you are " + age + "  " +  year);


        // a scanner is an object used to receive the user's inputs
        // Scanner with capital s on the start is class where that with small s is an object

        Scanner scanner = new Scanner(System.in);

        //accepting the string
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();// nextLine method is used to read user input with
                                             // spaces and if you want to read without spaces use next
        //accepting the integer
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        //accepting the double
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        //accepting the boolean
        System.out.println("Are you a billionaire? (true/false)");
        boolean isBillionaire = scanner.nextBoolean();

        System.out.println("Hello, " + username);
        System.out.println("you are " + userAge + " years old");
        System.out.println("You earn $" + salary + " dollars");

        if(isBillionaire){
            System.out.println("You are a Billionaire");
        }else{
            System.out.println("Work hard!");
        }


        //if you want to accept the number before the string, use below format
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        scanner.nextLine(); //  add this line of code

        System.out.print("Enter your favorite color: ");
        String color =  scanner.nextLine();

        System.out.println("You like number " + num );
        System.out.println("You like " + color + " color");


        // Let's dive to the mathematician world! ➕➖➗✖️

        System.out.print("Enter width: ");
        double width  = scanner.nextDouble();

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        double area = width * length;
        System.out.println("The area of the rectangle is " + area);



        // if you don't close your scanner it will lead to unexpected behaviour
        scanner.close();


    }
}
