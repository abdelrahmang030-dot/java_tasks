import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String productName = "Laptop";
        int quantity = 2;
        double price = 15000.50;
        boolean inStock = true;
        double totalPrice = price * quantity;
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price + " EGP");
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + inStock);

        Scanner input = new Scanner(System.in);
      System.out.print("Enter your score: ");
        int score = input.nextInt();
        if (score >= 90) {
           System.out.println("Excellent");

        } else if (score >= 75) {
           System.out.println("Good");
        } else if (score >= 60) {
           System.out.println("Pass");
       } else {
           System.out.println("Fail");

        }
switch (score/10)
{
    case 10, 9 -> System.out.println("Excellent");
    case 8, 7 -> System.out.println("Good");
    case 6 -> System.out.println("Pass");
    default -> System.out.println("Fail");
}

    }
    }





















