import java.io.*;
public class File1 {
    public static void main(String[] args) throws IOException {
        String firstName, lastName, favColor;
        int age;

        DataInputStream input = new DataInputStream(System.in);
        PrintWriter fileOut = new PrintWriter (new FileWriter ("file1.txt"));
        //same folder in java, but you have to normally have it outside your source program.

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter your last name: ");
            lastName = input.readLine(); //assign input after I prompted the user
            
            System.out.print("Enter first name: "); 
            firstName = input.readLine(); //assign input after I prompted the user

            System.out.print("Enter age: ");
            age = Integer.parseInt(input.readLine()); //assign input after I prompted the user

            System.out.print("Enter favourite color: ");
            favColor = input.readLine(); //assign input after I prompted the user
            
            fileOut.println(lastName + "\t" + firstName + "\t" + age + "\t" + favColor);
        }
        fileOut.close();
    }
}