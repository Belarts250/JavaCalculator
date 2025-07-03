import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

       double circumference ;
       double area;
       double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * radius * Math.PI;
        System.out.println("The circumference is : " + circumference);

        area = radius * radius * Math.PI;
        System.out.println("Tha area is " + area);

    }
}
