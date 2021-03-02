import java.io.*;
public class File2Program {
    public static void main(String[] args) throws IOException {
        String firstName, lastName, phoneNumber;
        int age;

        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File2//file2.txt"));

        for (int i = 1; i <= 5; i++) {
        
            firstName = rF.readLine();
            lastName = rF.readLine();
            phoneNumber = rF.readLine();
            age = Integer.parseInt(rF.readLine());
            
            System.out.println(firstName + "\t" + lastName + "\t" + phoneNumber + "\t");
        }
        rF.close();
    }
}
