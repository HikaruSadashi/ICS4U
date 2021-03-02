import java.io.*;
public class File1 {
    public static void main(String[] args) throws IOException {
        String firstName, lastName, favColor;
        int age;

        DataInputStream input = new DataInputStream(System.in);
        PrintWriter fileOut = new PrintWriter (new FileWriter ("file1.txt"));

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter your last name: ");
            lastName = input.readLine(); //assign input after I prompted the user
            fileOut.print(lastName + "\t"); //write to the file
            
            System.out.print("Enter first name: "); 
            firstName = input.readLine(); //assign input after I prompted the user
            fileOut.print(firstName + "\t"); //write to the file

            System.out.print("Enter age: ");
            age = Integer.parseInt(input.readLine()); //assign input after I prompted the user
            fileOut.print(age + "\t"); //write to the file

            System.out.print("Enter favourite color: ");
            favColor = input.readLine(); //assign input after I prompted the user
            fileOut.println(favColor); //write to the file
        }
        fileOut.close();
    }
}