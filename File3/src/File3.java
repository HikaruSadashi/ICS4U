import java.io.*;
import java.text.*;
public class File3 {
    public static void main(String[] args) throws IOException {
        String firstName, lastName;
        int age;
        double salary = 0, totalSalary = 0;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File3//bedrock.txt"));
        NumberFormat d = new DecimalFormat ("0.00");
        

        System.out.println("First" + "\t" + "Last" + "\t" + "Age" + "\t" + "Salary");
        System.out.println();

        for (int i= 1; i <= 8; i++) {
        
            firstName = rF.readLine();
            lastName = rF.readLine();
            age = Integer.parseInt(rF.readLine());
            salary = Double.parseDouble(rF.readLine());
            
            System.out.println(firstName + "\t" + lastName + "\t" + age + "\t" + salary); 

            totalSalary = totalSalary + salary;
        }
        rF.close();
        System.out.println();
        System.out.println("Total" + "\t" + "\t" + "\t" + d.format(totalSalary));
    }
}
