package BasicProjects;
import java.util.Scanner;
public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INCOME TAX ACCORDING TO TAX SLABS");
        System.out.print("Enter your annual income: ");
        int income = sc.nextInt();
        System.out.println("\n");
        if(income<250000){
            System.out.println("No Tax");
        }
        if(income>=250000 && income<500000) {
            System.out.println("As per the tax slab of 5%");
            float tax = (income/100)*5.0f;
            System.out.printf("Your yearly Tax: %.2f", tax);
        }
        if(income>=500000 && income<1000000) {
            System.out.println("As per the tax slab of 20%");
            float tax = (income/100)*20.0f;
            System.out.printf("Your yearly Tax: %.2f", tax);
        }
        if(income>1000000) {
            System.out.println("As per the tax slab of 30%");
            float tax = (income/100)*30.0f;
            System.out.printf("Your yearly Tax: %.2f", tax);
        }

    }
}
