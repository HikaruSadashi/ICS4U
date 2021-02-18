import java.io.*;

public class ReviewActivity4 {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        // assigning variables
        double taxRate = 0, taxPaid, grossEarnings;

        // prompting user for their gross earnings
        System.out.print("Please enter your gross earnings: ");
        grossEarnings = Double.parseDouble(input.readLine());

        while (grossEarnings <= 0) {
            System.out.print("Invalid input, please re-enter your grossEarnings: ");
            grossEarnings = Double.parseDouble(input.readLine());
        }

        if (grossEarnings < 35000) {
            taxRate = 0.15;
        }
        if (grossEarnings >= 35000 & grossEarnings < 50000) {
            taxRate = 0.20;
        }
        if (grossEarnings >= 50000) {
            taxRate = 0.25;
        }

        taxPaid = taxRate * grossEarnings;

        System.out.println();
        System.out.println("Your tax rate is " + (taxRate * 100) + "%");
        System.out.println("The dollar amount of tax you will pay is: " + taxPaid + "$");
        System.out.println("Your earnings after paying tax are: " + (grossEarnings - taxPaid) + "$");

    }
}
