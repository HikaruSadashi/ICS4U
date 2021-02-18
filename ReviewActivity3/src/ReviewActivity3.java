import java.io.*;

public class ReviewActivity3 {
    public static void main(String[] args) throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        // assigning variables
        int itemChoice, unitCost, totalCost, unitQuantity;
        final double SALESTAX = 0.13;
        double grandTotal;

        // displaying the menu of items for the user
        System.out.println("Welcome to Central Merch, here is the wide selection of products you can purchase: ");
        System.out.println();
        System.out.println("1) Central T-shirt: $5  CAD");
        System.out.println("2) Central Hat:     $10 CAD");
        System.out.println("3) Central Hoodie:  $8  CAD");
         
        //prompting the user to select an item
        System.out.println("Please select an item to purchase by entering an integer value:");
        itemChoice = Integer.parseInt(input.readLine());
        
        //bullet proodfing itemchoice input
        while (itemChoice != 1 && itemChoice = 2 && itemChoice 3) {
            System.out.println("invalid input, please re-enter your item choice:");
            itemChoice = Integer.parseInt(input.readLine());
        }

        //assigning unit cost
        if (itemChoice == 1) {
            unitCost = 5;
        }
        else if (itemChoice == 2) {
            unitCost = 10;
        }
        else if (itemChoice == 3) {
            unitCost = 8;
        }

        //prompting user for quantity
        System.out.println("How much of the item do you want?");
        unitQuantity = Integer.parseInt(input.readLine());

        //bullet proofing quantity input
        while (unitQuantity <= 0 ) {
            System.out.println("invalid input, please re-enter item quantity:");
            unitQuantity = Integer.parseInt(input.readLine());
        }

        //calculating costs
        totalCost = unitQuantity*unitCost;
        grandTotal = ((totalCost*SALESTAX)+totalCost);

        //printing results
        System.out.println();
        System.out.println("The unit cost is $" + unitCost);
        System.out.println("The quantity is " + unitQuantity);
        System.out.println("The total cost is " + totalCost);
        System.out.println("The amount of money you have to pay in sales tax is" + SALESTAX*totalCost );
        System.out.println("Your grand total is " + grandTotal);
    }
}
