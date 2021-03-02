import java.io.*;
public class File4 {
    public static void main(String[] args) throws IOException {
        //lastnames, fisrt names, hours, rate, gross pay, total pay roll
        String lastName, firstName;
        int hours;
        double rate, grossPay = 0, totalPayroll = 0;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File4//file4.txt"));

        System.out.println("Last" + "\t" + "First" + "\t" + "Hours" + "\t" + "Gross Pay");
        System.out.println();

        for (int i= 1; i <= 12; i++) {
            lastName = rF.readLine();
            System.out.print(lastName + "\t");

            firstName = rF.readLine();
            System.out.print(firstName + "\t");

            hours = Integer.parseInt(rF.readLine());
            System.out.print(hours + "\t");

            rate = Double.parseDouble(rF.readLine());
            grossPay = rate*hours;
            System.out.println(grossPay);

            totalPayroll = totalPayroll + grossPay;
        }
        System.out.println();
        System.out.println("Total" + "\t" + "\t" + "\t" + totalPayroll);
        //you can format decimals here if you want
    }
}
