import java.io.*;
public class File3 {
    public static void main(String[] args) throws IOException {
        String firstName, lastName;
        int age;
        double salary = 0, totalSalary = 0;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File3//bedrock.txt"));

        System.out.println("First" + "\t" + "Last" + "\t" + "\t" + "Age" + "\t" + "Salary");
        //double tab part of the problem
        System.out.println();

        for (int i= 1; i <= 8; i++) {
            firstName = rF.readLine();
            System.out.print(firstName + "\t");

            lastName = rF.readLine();
            System.out.print(lastName + "\t");
            //some last names dont have a tab after them, and adding 1 more does not help

            age = Integer.parseInt(rF.readLine());
            System.out.print(age + "\t");

            salary = Double.parseDouble(rF.readLine());
            System.out.println(salary);

            totalSalary = totalSalary + salary;
        }
        rF.close();
        System.out.println();
        System.out.println("Total" + "\t" + "\t" + "\t" + "\t" + totalSalary);
    }
}
