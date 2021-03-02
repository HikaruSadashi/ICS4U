import java.io.*;
import java.text.*;
public class File4 {
    public static void main(String[] args) throws IOException {
        //lastnames, fisrt names, hours, rate, gross pay, total pay roll
        String lastName, firstName;
        int hours, overTime=0;
        double rate, grossPay = 0.0, totalPayroll = 0.0;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File4//file4.txt"));
        NumberFormat d = new DecimalFormat ("##,##0.00");
        //decimal formatting

        System.out.println("Last" + "\t" + "First" + "\t" + "Hours" + "\t" + "Gross Pay");
        System.out.println();

        for (int i= 1; i <= 12; i++) {
        
            lastName = rF.readLine();
            firstName = rF.readLine();
            hours = Integer.parseInt(rF.readLine());
            if (hours >= 40) {
                overTime = hours - 40;
            }
            rate = Double.parseDouble(rF.readLine());
            grossPay = (rate*(hours-overTime))+(overTime*(1.5*rate));
            
            System.out.println(lastName + "\t" + firstName + "\t" + hours + "\t" + grossPay);

            totalPayroll = totalPayroll + grossPay;
        }
        rF.close();
        System.out.println();
        System.out.println("Total" + "\t" + "\t" + "\t" + totalPayroll);
    }
}
