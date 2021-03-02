import java.io.*;
import java.text.*;
public class File4 {
    public static void main(String[] args) throws IOException {
        //lastnames, fisrt names, hours, rate, gross pay, total pay roll
        String lastName, firstName;
        int hours;
        double rate, grossPay = 0.00, totalPayroll = 0.00, overTime = 0.00;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File4//file4.txt"));
        NumberFormat d = new DecimalFormat ("0.00");
        //decimal formatting

        System.out.println("Last" + "\t" + "First" + "\t" + "Hours" + "\t" + "Rate" + "\t" + "Gross Pay");
        System.out.println();

        for (int i= 1; i <= 12; i++) {
        
            lastName = rF.readLine();
            firstName = rF.readLine();
            hours = Integer.parseInt(rF.readLine());
            rate = Double.parseDouble(rF.readLine());
            if (hours >= 40) {
                overTime = hours - 40.00;
                grossPay = ((rate*40)+(overTime*1.5*rate));
            }
            else {
                grossPay = (rate*hours);
            }
            
            System.out.println(lastName + "\t" + firstName + "\t" + hours + "\t" + d.format(rate) + "\t" + d.format(grossPay));

            totalPayroll = totalPayroll + grossPay;
        }
        rF.close();
        System.out.println();
        System.out.println("Total Payroll:" + "\t" + "\t" + "\t" + d.format(totalPayroll));
    }
}
