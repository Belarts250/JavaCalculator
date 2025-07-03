import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int times;
        int years;
        double amount;
        System.out.print("Enter your principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in %) rate: ");
        rate = scanner.nextDouble();

        System.out.print("Enter # of times compounded per year: ");
        times = scanner.nextInt();

        System.out.print("Enter # of years: ");
        years = scanner.nextInt();

        double interestRate = rate/100;
        int k = times * years;
        double interest = 1+ (interestRate/times);


        amount = principal * Math.pow(interest, k);
        System.out.print(amount);
    }
}
