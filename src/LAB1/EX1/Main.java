package LAB1.EX1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose: \n 1. Addition \n 2. Subtraction \n 3. Multiplication ");

        int Case = scanner.nextInt();

        // Read first number
        System.out.println("First number: ");
        int real = scanner.nextInt();
        int imag = scanner.nextInt();

        Complex first = new Complex(real, imag);

        // Read second number
        System.out.println("First number: ");
        real = scanner.nextInt();
        imag = scanner.nextInt();

        Complex second = new Complex(real, imag);

        Complex number = new Complex();
        switch(Case){
            case 1:
                Complex result1 = number.Addition(first,second);
                System.out.println(result1.getReal() + " " + result1.getImag());
                break;
            case 2:
                Complex result2 = number.Subtraction(first,second);
                System.out.println(result2.getReal() + " " + result2.getImag());
                break;
            case 3:
                Complex result3 = number.Multiplication(first,second);
                System.out.println(result3.getReal() + " " + result3.getImag());
                break;
        }

        // Close the scanner
        scanner.close();
    }
}