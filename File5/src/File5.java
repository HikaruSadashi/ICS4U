\import java.io.*;
import java.text.*;
public class File5 {
    public static void main(String[] args) throws Exception {
        String lastName, firstName, gender;
        int mathAvg, engAvg, age = 0, grades = 0;
        double average, classAvg = 0.0;
        
        BufferedReader rF = new BufferedReader (new FileReader("students.txt"));
        NumberFormat d = new DecimalFormat ("0.00");

        System.out.println("Last" + "\t" + "First" + "\t" + "Math" + "\t" + "English" + "\t" + "Average");
        System.out.println();

        for (int i= 1; i <= 11; i++) {
        
            lastName = rF.readLine();

            firstName = rF.readLine();

            age = Integer.parseInt(rF.readLine());
            gender = rF.readLine();
            grades = Integer.parseInt(rF.readLine());

            mathAvg = Integer.parseInt(rF.readLine());

            engAvg = Integer.parseInt(rF.readLine());

            average = ((engAvg + mathAvg)/2.0);
            classAvg = classAvg + average;
            
            System.out.println(lastName + "\t" + firstName + "\t" + mathAvg + "\t" + engAvg + "\t" + average);
        }
        rF.close();
        classAvg = (classAvg/11.0);
        //decimal format this.
        System.out.println();
        System.out.println("Class Avg" + "\t" + "\t" + "\t" + d.format(classAvg));
    }
}
