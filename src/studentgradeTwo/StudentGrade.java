package studentgradeTwo;

import java.util.Scanner;

import java.util.Arrays;

public class StudentGrade {

    private int studentGrades[][];

    Scanner sc = new Scanner(System.in);

    public void setStudentGrades(int numberOfStudents, int numberOfSubjects) {

        studentGrades = new int[numberOfStudents][numberOfSubjects];

    }

    public int[][] getStudentGrades() {

        return studentGrades;

    }

    public int[][] gradesEntry() {

        for(int student = 0; student < studentGrades.length; student++){

            int index = 0;

            for(int subject = 0; subject < studentGrades[index].length; subject++) {

                System.out.printf("Entering score for student %d%n", student + 1);

                System.out.printf("Enter score for subject %d%n", subject + 1);

                studentGrades[student][subject] = sc.nextInt();

                while((studentGrades[student][subject] < 0) || (studentGrades[student][subject] > 100)) {

                    System.out.printf("Entering score for student %d%n", student + 1);

                    System.out.printf("Enter score for subject %d%n", subject + 1);

                    studentGrades[student][subject] = sc.nextInt();

                }

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");

                System.out.println("Saved successfully");

                System.out.println();

            }

            index++;

        }

        return studentGrades;
    }

    public int studentGradesTotal(int student) {

        int total = 0;

        for(int subject = 0; subject < studentGrades[student].length; subject++) {

            total = total + studentGrades[student][subject];

        }

        return total;
    }

    public double studentGradesAverage(int student) {

        int total = 0;

        double subjectNumber = 0;

        for(int subject = 0; subject < studentGrades[student].length; subject++) {

            total = total + studentGrades[student][subject];

            subjectNumber++;

        }

        double average = total / subjectNumber;

        return average;
    }

    public int studentPosition(int student) {

        int position = 1;

        int otherStudent = 0;

        for(int counter = 0; counter < studentGrades.length; counter++) {

            if(studentGradesTotal(student) < studentGradesTotal(otherStudent)) {

                position++;

            }

            otherStudent++;

        }

        return position;

    }

    public void studentGradesTable() {

        System.out.println("=================================================");

        System.out.printf("%-10s", "STUDENT");

        for(int subject = 0; subject < studentGrades[0].length; subject++) {

            System.out.printf("%5s%d", "SUB", subject + 1);

        }

        System.out.printf("%6s %6s %6s%n", "TOT", "AVE", "POS");

        System.out.println("=================================================");

        for(int student = 0; student < studentGrades.length; student++){

            System.out.printf("%s %-2d","Student", student + 1);

            for(int subjects = 0; subjects < studentGrades[student].length; subjects++) {

                System.out.printf("%5d ", studentGrades[student][subjects]);

            }

            System.out.printf("%6d", studentGradesTotal(student));

            System.out.printf("%8.2f", studentGradesAverage(student));

            System.out.printf("%5d", studentPosition(student));

            System.out.println();
        }

        System.out.println("=================================================");

        System.out.println("=================================================");

        System.out.println();
    }

    public int subjectTotal(int subject) {

        int total = 0;

        for(int student = 0; student < studentGrades.length; student++){

            total += studentGrades[student][subject];

        }

        return total;
    }

    public double subjectAverage(int subject) {

        int total = 0;

        double numberOfStudents = 0;

        for(int student = 0; student < studentGrades.length; student++){

            total += studentGrades[student][subject];

            numberOfStudents++;

        }

        double average = total / numberOfStudents;

        return average;

    }

    public int numberOfPasses(int subject) {

        int numberOfPasses = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] > 50) {

                numberOfPasses += 1;

            }

        }

        return numberOfPasses;

    }

    public int numberOfFails(int subject) {

        int numberOfFails = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] < 50) {

                numberOfFails += 1;

            }

        }

        return numberOfFails;

    }

    public int highestSubjectGrade(int subject) {

        int highestScoringGrade = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] > highestScoringGrade) {

                highestScoringGrade = studentGrades[student][subject] ;

            }

        }

        return highestScoringGrade;

    }

    public int subjectHighestStudent(int subject) {

        int highestScoringStudent = 0;

        int highestScoringGrade = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] == highestSubjectGrade(subject))  {

                highestScoringStudent = student + 1;

            }

        }

        return highestScoringStudent;

    }

    public int lowestSubjectGrade(int subject) {

        int lowestScoringGrade = 100;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] < lowestScoringGrade) {

                lowestScoringGrade = studentGrades[student][subject] ;

            }

        }

        return lowestScoringGrade;

    }////////////////////////////////////////////////////////////////////////////////////////////// remove things extra variables

    public int subjectLowestStudent(int subject) {

        int lowestScoringStudent = 0;

        int lowestScoringGrade = 100;

        for(int student = 0; student < studentGrades.length; student++) {

            if(studentGrades[student][subject] == lowestSubjectGrade(subject)) {

                lowestScoringStudent = student + 1 ;

            }

        }

        return lowestScoringStudent;

    }

    public void subjectSummary() {

        System.out.println("SUBJECT SUMMARY");

        for(int subject = 0; subject < studentGrades[0].length; subject++ ){

            System.out.printf("%s %d%n", "Subject", subject + 1);

            System.out.printf("Highest scoring student is: Student %d scoring %d%n", subjectHighestStudent(subject), highestSubjectGrade(subject));

            System.out.printf("Lowest scoring student is: Student %d scoring %d%n", subjectLowestStudent(subject), lowestSubjectGrade(subject));

            System.out.printf("Total Score is: %d%n", subjectTotal(subject));

            System.out.printf("Average Score is: %.2f%n", subjectAverage(subject));

            System.out.printf("Number of Passes: %d%n", numberOfPasses(subject));

            System.out.printf("Number of Fails:  %d%n", numberOfFails(subject));

            System.out.println();

        }

    }

    public int overallHighestScore() {

        int highestScore = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++){

                if(studentGrades[student][subject] > highestScore){

                    highestScore = studentGrades[student][subject];

                }

            }

        }

        return highestScore;
    }

    public int overallHighestScoreStudent() {

        int overallHighestScoreStudent = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++) {

                if(overallHighestScore() == studentGrades[student][subject]) {

                    overallHighestScoreStudent = student + 1;

                }

            }

        }

        return overallHighestScoreStudent;
    }

    public int overallHighestScoreSubject() {

        int overallHighestScoreSubject = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++) {

                if(overallHighestScore() == studentGrades[student][subject]) {

                    overallHighestScoreSubject = subject + 1;

                }

            }

        }

        return overallHighestScoreSubject;
    }

    public int overallLowestScore() {

        int lowestScore = 100;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++){

                if(studentGrades[student][subject] < lowestScore){

                    lowestScore = studentGrades[student][subject];

                }

            }

        }

        return lowestScore;
    }

    public int overallLowestScoreStudent() {

        int overallLowestScoreStudent = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++) {

                if(overallLowestScore() == studentGrades[student][subject]) {

                    overallLowestScoreStudent = student + 1;

                }

            }

        }

        return overallLowestScoreStudent;
    }

    public int overallLowestScoreSubject() {

        int overallLowestScoreSubject = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++) {

                if(overallLowestScore() == studentGrades[student][subject]) {

                    overallLowestScoreSubject = subject + 1;

                }

            }

        }

        return overallLowestScoreSubject;
    }


    public int classTotalScore() {

        int totalScore = 0;

        for(int student = 0; student < studentGrades.length; student++){

            for(int subject = 0; subject < studentGrades[student].length; subject++){

                totalScore += studentGrades[student][subject];

            }

        }

        return totalScore;
    }

    public double classAverageScore() {

        int totalScore = 0;

        double numberOfStudents = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            for(int subject = 0; subject < studentGrades[student].length; subject++) {

                totalScore += studentGrades[student][subject];

            }

            numberOfStudents++;

        }

        double averageScore = totalScore / numberOfStudents;

        return averageScore;
    }

    public int studentGraduatingScore(int student) {

        int studentGraduatingScore = 0;

        for(int subject = 0; subject < studentGrades[subject].length; subject++) {

            studentGraduatingScore += studentGrades[student][subject];

        }

        return studentGraduatingScore;

    }

    public int bestGraduatingScore() {

        int bestGraduatingScore = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if (studentGraduatingScore(student) > bestGraduatingScore) {

                bestGraduatingScore = studentGraduatingScore(student);

            }

        }

        return bestGraduatingScore;
    }

    public int bestGraduatingStudent() {

        int bestGraduatingStudent = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(bestGraduatingScore() == studentGraduatingScore(student)) {

                bestGraduatingStudent = student + 1;

            }

        }

        return bestGraduatingStudent;
    }

    public int worstGraduatingScore() {

        int worstGraduatingScore = 400;

        for(int student = 0; student < studentGrades.length; student++) {

            if (studentGraduatingScore(student) < worstGraduatingScore) {

                worstGraduatingScore = studentGraduatingScore(student);

            }

        }

        return worstGraduatingScore;
    }

    public int worstGraduatingStudent() {

        int worstGraduatingStudent = 0;

        for(int student = 0; student < studentGrades.length; student++) {

            if(worstGraduatingScore() == studentGraduatingScore(student)) {

                worstGraduatingStudent = student + 1;

            }

        }

        return worstGraduatingStudent;
    }

	/*public int easiestSubjectPasses() {

		int easiestSubjectPasses = 0;

		for(int subject = 0; subject < studentGrades[subject].length; subject++){

			if(numberOfPasses(subject) > easiestSubjectPasses){

				easiestSubjectPasses = numberOfPasses(subject);

			}

		}

		return easiestSubjectPasses;
	}

	public int easiestSubject() {

		int easiestSubject = 0;

		for(int subject = 0; subject < studentGrades[subject].length; subject++){

			if(easiestSubjectPasses() == numberOfPasses(subject)){

				easiestSubject = subject + 1;

			}

		}

		return easiestSubject;

	}


	public int hardestSubjectFails() {

		int hardestSubjectFails = 0;

		for(int subject = 0; subject < studentGrades[subject].length; subject++){

			if(numberOfFails(subject) > hardestSubjectFails){

				hardestSubjectFails = numberOfFails(subject);

			}

		}

		return hardestSubjectFails;
	}

	public int hardestSubject() {

		int hardestSubject = 0;

		for(int subject = 0; subject < studentGrades[subject].length; subject++){

			if(hardestSubjectFails() == numberOfFails(subject)){

				hardestSubject = subject + 1;

			}

		}

		return hardestSubject;

	}*/

    public void finalSummary() {

        //System.out.printf("The hardest subject is Subject %d with %d failures%n", hardestSubject(), hardestSubjectFails());
        //System.out.printf("The easiest subject is Subject %d with %d passes%n", easiestSubject(), easiestSubjectPasses());
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", overallHighestScoreStudent(), overallHighestScoreSubject(), overallHighestScore());
        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", overallLowestScoreStudent(), overallLowestScoreSubject(), overallLowestScore());
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("=====================================================");
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestGraduatingStudent(), bestGraduatingScore());
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstGraduatingStudent(), worstGraduatingScore());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("=====================================================");
        System.out.printf("Class Total score is: %d%n", classTotalScore());
        System.out.printf("Class average score is: %.1f%n", classAverageScore());
        System.out.println("=====================================================");





    }
}
