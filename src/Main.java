import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double finalPrice = 0;
        double shippingCost = 0;
        final double SHIPPING_COST_RATE = 0.02;
        final int SHIPPING_COST_CUTOFF = 100;
        System.out.println("What is the price? ");
        String trash = "";
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your item price was " + trash);
            System.out.println("Run the program again and enter a valid price ");
            System.exit(0);
        }
        shippingCost = itemPrice * SHIPPING_COST_RATE;
        if(itemPrice >= SHIPPING_COST_CUTOFF)
        {
            finalPrice = itemPrice;
            shippingCost = 0;
        }
        else
        {
            finalPrice = itemPrice + shippingCost;
        }
        System.out.println("The Price with shipping is " + finalPrice);
        System.out.println("and shipping will cost " + shippingCost);
    }
}
