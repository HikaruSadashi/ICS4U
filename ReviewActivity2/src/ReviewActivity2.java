import java.io.*;
public class ReviewActivity2 {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        // assigning values
        int heightOfPrism, lengthOfPrism, widthOfPrism;
        String units = "???";

        // introducing the user
        System.out.println("Welcome to RectangularPrism Calculator4000!");
        System.out.println();

        // prompting the user
        // extra feature: units of measurement
        System.out.print("Enter the units of measurement you will be using for all values: ");
        units = input.readLine();

        System.out.print("Enter the height of the rectangular prism (no decimals please):  ");
        heightOfPrism = Integer.parseInt(input.readLine());

        System.out.print("Enter the length of the rectangular prism (no decimals please):  ");
        lengthOfPrism = Integer.parseInt(input.readLine());

        System.out.print("Enter the width of the rectangular prism (no decimals please):   ");
        widthOfPrism = Integer.parseInt(input.readLine());

        // calculating and assigning volume
        int volumeOfPrism = heightOfPrism*lengthOfPrism*widthOfPrism;

        // printing volume
        System.out.println();
        System.out.print("The volume of the rectangular prism is: " + volumeOfPrism + " " + units + "^3");

    }
}
