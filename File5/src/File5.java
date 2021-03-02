import java.io.*;
//add decimal formatting library and example
public class File5 {
    public static void main(String[] args) throws Exception {
        String lastName, firstName, gender;
        int mathAvg, engAvg, age = 0, grades = 0;
        double average, classAvg = 0.0;
        
        BufferedReader rF = new BufferedReader (new FileReader("students.txt"));

        System.out.println("Last" + "\t" + "First" + "\t" + "Math" + "\t" + "English" + "\t" + "Average");
        //1 output is not aligned
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
            //why divide by 2.0 instead?
            //decimal format this to 1 extra if I want
            classAvg = classAvg + average;
            
            System.out.println(lastName + "\t" + firstName + "\t" + mathAvg + "\t" + engAvg + "\t" + average);
        }
        rF.close();
        classAvg = (classAvg/11.0);
        //decimal format this.
        System.out.println();
        System.out.println("Class Avg" + "\t" + "\t" + "\t" + classAvg);
    }
}
