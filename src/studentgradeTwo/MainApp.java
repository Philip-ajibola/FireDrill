package studentgradeTwo;

import java.util.Scanner;

public class StudentGradeApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("How many students do you have?");

            int numberOfStudents = sc.nextInt();

            while(numberOfStudents < 0) {

                System.out.println("How many students do you have?");

                numberOfStudents = sc.nextInt();

            }

            System.out.println("How many subjects do they offer?");

            int numberOfSubjects = sc.nextInt();

            while(numberOfSubjects < 0) {

                System.out.println("How many subjects do they offer?");

                numberOfSubjects = sc.nextInt();

            }

            StudentGrade lagbajaSchools = new StudentGrade();

            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");

            System.out.println("Saved successfully");

            lagbajaSchools.gradesEntry();

            lagbajaSchools.studentGradesTable();

            lagbajaSchools.subjectSummary();

            lagbajaSchools.finalSummary();

        }

    }
}
