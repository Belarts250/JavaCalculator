
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner calculate = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result = 0;

        System.out.print("Enter number 1: ");
        num1 = calculate.nextDouble();

        System.out.print("Enter operation (+,-,*,/,^): ");
        operation = calculate.next().charAt(0);

        System.out.print("Enter number 2: ");
        num2 = calculate.nextDouble();

        switch(operation){
        case '+' -> result = num1 + num2 ;
        case '-' -> result = num1 - num2 ;
        case '*' -> result = num1 * num2 ;
        case '/' -> {
            if(num2 == 0){
                System.out.println("Error cannot divide with 0");
            }else{
                result = num1 / num2;
            }
        }
        default ->{
            System.out.println("Invalid opeartion");
        }
        case '^' -> result = Math.pow(num1, num2);

        }
        System.out.println(result);
        calculate.close();
    }

}
