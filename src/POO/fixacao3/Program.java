
package exercicio.fixacao3;

import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter 1st student grade: ");
        student.nota1 = sc.nextDouble();
        System.out.println("Enter 2nd student grade: ");
        student.nota2 = sc.nextDouble();
        System.out.println("Enter 3th student grade: ");
        student.nota3 = sc.nextDouble();
        
        System.out.println("FINAL GRADE = " 
                + String.format("%.2f%n",student.finalGrade()) 
                + student.studentSituation());
        
        if(student.finalGrade() < 60){
            System.out.println("MISSING " + String.format("%.2f",student.missing())
            + " POINTS");
        }
        
    }
    
}
