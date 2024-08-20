package BasicProjects;
import java.util.Scanner;
public class ScientificCalculator {
    static Scanner sc = new Scanner(System.in);

    // ADDITION
    public static void add() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        double result = a + b;
        System.out.println("RESULT :- "+result);
    }

    // SUBTRACTION
    public static void sub() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double result = a - b;
        System.out.println("RESULT :- "+result);
    }

    // MULTIPLICATION
    public static void mul() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double result = a * b;
        System.out.println("RESULT :- "+result);
    }

    // DIVISION
    public static void div() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double result = a / b;
        System.out.println("RESULT :- "+result);
    }

    // POWER
    public static void power() {
        System.out.print("Enter base: ");
        double a = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double b = sc.nextDouble();
        double result = Math.pow(a, b);
        System.out.println("RESULT :- "+result);
    }

    // SQUARE
    public static void square() {
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        double result = a*a;
        System.out.println("RESULT :-"+result);
    }

    //SQUARE ROOT
    public static void squareroot() {
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        double result = Math.sqrt(a);
        System.out.println("RESULT :- "+result);

    }

    //sin
    public static void sin() {
        System.out.print("Enter the angle in degrees: ");
        double a = sc.nextDouble();
        double result = Math.sin(Math.toRadians(a));
        System.out.println("RESULT :- "+result);
    }

    //cos
    public static void cos() {
        System.out.print("Enter the angle in degrees: ");
        double a = sc.nextDouble();
       double result = Math.cos(Math.toRadians(a));
        System.out.println("RESULT :- "+result);
    }

 //tan
    public static void tan() {
        System.out.println("Enter the angle in degrees: ");
        double a = sc.nextDouble();
        double result = Math.tan(Math.toRadians(a));
        System.out.println("RESULT :- "+result);

    }

    //log (base 10)
    public static void log10() {
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        if(a>0) {
            double result = Math.log10(a);
            System.out.println("RESULT :- "+result);
        } else{
            System.out.println("Logarthim of zero and non positive numbers are not defined!");
        }
    }

    //log (base e)
    public static void log(){
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        if(a>0){
            double result = Math.log(a);
            System.out.println("RESULT :- "+result);
        } else{
            System.out.println("Logarthim of zero and non positive numbers are not defined!");
        }
    }

    //EXIT
    public static void exit () {
        System.out.println("EXITING....");
    }
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("--------*** SCIENTIFIC CALCULATOR ***--------");
        int choice;
        do {
            System.out.println("\nOperations to perform:- ");
            System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Power \n 6. Square \n 7. Square Root \n 8. Sin \n " +
                    "9. Cos \n 10. Tan \n 11. Log base(10) \n 12. Log base(e) \n 13. Exit \n");

            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    square();
                    break;
                case 7:
                    squareroot();
                    break;
                case 8:
                    sin();
                    break;
                case 9:
                    cos();
                    break;
                case 10:
                    tan();
                    break;
                case 11:
                    log10();
                    break;
                case 12:
                    log();
                    break;
                case 13:
                    exit();
                default:
                    System.out.println("Invalid choice!!");
            }
        } while (choice != 13);

    }
    }

