import java.io.*;
public class File5 {
    public static void main(String[] args) throws Exception {
        String lastName, firstName;
        Double mathAvg, engAvg, average, classAvg = 0.0;
        
        BufferedReader rF = new BufferedReader (new FileReader("c://Users//Khalid Zabalawi//Documents//GitHub//ICS4U//File5//students.txt"));

        System.out.println("Last" + "\t" + "First" + "\t" + "Math" + "\t" + "English" + "\t" + "Average");
        System.out.println();

        for (int i= 1; i <= 11; i++) {
            lastName = rF.readLine();
            System.out.print(lastName + "\t");

            firstName = rF.readLine();
            System.out.print(firstName + "\t");

            mathAvg = Double.parseDouble(rF.readLine());
            System.out.print(mathAvg + "\t");

            engAvg = Double.parseDouble(rF.readLine());
            System.out.print(engAvg + "\t");

            average = ((engAvg + mathAvg)/2);
            //decimal format this to 1 extra if I want
            System.out.println(average);
            classAvg = classAvg + average;
        }
        classAvg = (classAvg/11);
        //decimal format this if I want too.
        System.out.println();
        System.out.println("Class Avg" + "\t" + "\t" + "\t" + classAvg);
    }
}
