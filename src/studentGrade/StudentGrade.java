package studentGrade;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
    private int[][]  grade;
    private  int numberOfStudent;
    private  int numberOfSubject;
    private static Scanner input = new Scanner(System.in);

    public void setGrade(){
        boolean condition = true;
        while (condition) {
            try {
                System.out.println("How Many Student Do You Have? ");
                numberOfStudent = input.nextInt();
                System.out.println("How Many Subject do they offer? ");
                numberOfSubject = input.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>");
                System.out.println("Successfully Saved ");
                System.out.println();
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Input MisMatchException\nEnter A Valid input ");
                input.next();
            }
        }

        grade = new int[numberOfStudent][numberOfSubject];
        for(int counter = 0;counter<grade.length;counter++){
            for(int count = 0;count<grade[counter].length;count++){
                 condition= true;
                while(condition){
                    try {
                        System.out.printf("Entering Score For Student %d%n", counter + 1);
                        System.out.printf("Enter Score For Subject %d%n", count + 1);
                        grade[counter][count] = input.nextInt();
                        while (grade[counter][count] < 0 || grade[counter][count] >= 100) {
                            System.out.println("I Think This Was A Mistake \n Please Enter Student Real Score");
                            grade[counter][count] = input.nextInt();
                        }
                        condition = false;

                        System.out.println("Saving >>>>>>>>>>>>>>>>");
                        System.out.println("Successfully Saved ");
                        System.out.println();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        input.next();
                    }
                }
            }
        }
    }

    public int[] getStudentTotal(){
        int[] studentTotal = new int[grade.length];
        int total = 0;
        for(int counter = 0;counter<grade.length;counter++){
            total = 0;
            for(int count = 0;count<grade[counter].length;count++){
                total += grade[counter][count];
            }
            studentTotal[counter] = total;
        }
        return studentTotal;
    }
    public double[] average(){
        double[] averageScore = new double[grade.length];
        for(int counter = 0; counter<grade.length;counter++){
            averageScore[counter] = (double)getStudentTotal()[counter]/grade[0].length;
        }

        return averageScore;
    }
    public int[] reverseTotal(){
        int[] reverse = new int[getStudentTotal().length];
        reverse = getStudentTotal();
        Arrays.sort(reverse);
        return reverse;
    }
    public void printResult(){
        reverseTotal();
        System.out.println("========================================================================");
        System.out.print("Students");
        for(int count = 0;count<grade[0].length;count++){
            System.out.printf("%10s%d","SUB",count+1);
        }
        System.out.printf("%10s","TOT");
        System.out.printf("%10s","AVE");
        System.out.printf("%10s%n","POS");
        System.out.println("========================================================================");
        for(int counter = 0;counter<grade.length;counter++){
            System.out.printf("Student %d",counter+1);
            for(int count = 0;count<grade[counter].length;count++){
                System.out.printf("%10d",grade[counter][count]);
            }
            System.out.printf("%10d",getStudentTotal()[counter]);
            System.out.printf("%10.2f",average()[counter]);
            int numb = grade.length;
            for(int count1 = 0;count1<getStudentTotal().length;count1++){
                if(getStudentTotal()[counter]==reverseTotal()[count1]){
                    System.out.printf("%10d",numb);
                }
                numb--;
            }
            System.out.println();

        }
        System.out.println("========================================================================");
        System.out.println("========================================================================");
    }
    public void highestScoring(){
        System.out.println();
        System.out.println("SUBJECT SUMMARY");
        int[] subjectPass = new int[grade.length];
        int[] subjectFail = new int[grade.length];
        for(int counter  = 0; counter<grade[0].length;counter++){
            int highest = grade[0][counter];
            int lowest = grade[0][counter];
            int number = 1;
            int number1 = 1;
            int total = 0;
            int pass = 0;
            int fail = 0;
            for(int count = 0;count<grade.length;count++){
                total+=grade[count][counter];
                if(grade[count][counter]>highest){
                    highest = grade[count][counter];
                    number=count+1;
                }
                if(grade[count][counter]<lowest){
                    lowest = grade[count][counter];
                    number1 = count+1;
                }
                if(grade[count][counter]>49){
                    pass++;
                }
                else if(grade[count][counter]<50){
                    fail++;
                }

            }
            double average = (double)total/grade.length;
            System.out.printf("Subject %d%n",counter+1);
            System.out.printf("Highest Scoring Student Is: Student %d Scoring %d%n",number,highest);
            System.out.printf("Lowest Scoring Student Is: Student %d Scoring %d%n",number1,lowest);
            System.out.printf("Total Scoring %d%n",total);
            System.out.printf("Total Scoring %.2f%n",average);
            System.out.printf("Number Of Passes %d%n",pass);
            System.out.printf("Number Of Fails %d%n",fail);
            System.out.println();
            subjectPass[counter] = pass;
            subjectFail[counter] = fail;

        }
        int checkPass = subjectFail[0];
        int num = 1;
        for(int count1 = 0; count1<grade.length;count1++){
            if(subjectFail[count1]>checkPass){
                checkPass = subjectFail[count1];
                num++;
            }
        }
        System.out.printf("The hardest subject is Subject %d with %d Failures %n",num,checkPass);
        checkPass = subjectPass[0];
        num = 1;
        for( int count1 = 0; count1<grade.length;count1++){
            if(subjectPass[count1]>checkPass){
                checkPass = subjectPass[count1];
                num++;
            }
        }
        System.out.printf("The easiest subject is Subject %d with %d Passes %n",num,checkPass);

    }

    public void printBestStudent(){
        int[] studentHighest = new int[grade.length];
        int totalHighestScore = 0;

        int highest = grade[0][0];
        int lowest = grade[0][0];
        int num = 1;
        int num2 = 1;
        int num3 = 1;
        int num4 = 1;
        for(int count = 0; count<grade.length;count++){
            for(int counter = 0; counter<grade[count].length;counter++){
                if(grade[count][counter]>highest){
                    highest = grade[count][counter];
                    num = counter+1;
                    num3 = count+1;
                }
                if(grade[count][counter]<lowest){
                    lowest = grade[count][counter];
                    num2=counter+1;
                    num4 = count +1;
                }
            }

        }

        for(int counter = 0;counter<grade.length;counter++){
            totalHighestScore = 0;
            for(int count = 0;count<grade[counter].length;count++){

                totalHighestScore += grade[counter][count];
            }
            studentHighest[counter] = totalHighestScore;
        }


        System.out.printf("The overall Highest score is scored by Student %d in Subject %d Scoring %d%n",num3,num,highest);

        System.out.printf("The overall lowest score is scored by Student %d in Subject %d Scoring %d%n",num4,num2,lowest);

        System.out.println();
        System.out.println("======================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("======================================================");
        int greatest1 = studentHighest[0];
        int smallest1 = studentHighest[0];
        int numb2=1;
        int numb1=1;
        int totalScore = 0;
        for(int count = 0;count<studentHighest.length;count++){
            totalScore +=studentHighest[count];
            if(studentHighest[count]>greatest1){
                greatest1 = studentHighest[count];
                numb1 = count+1;
            }
            if(studentHighest[count]<smallest1){
                smallest1 = studentHighest[count];
                numb2 = count+1;
            }
        }
        System.out.printf("Best graduating student is: Student %d scoring %d%n",numb1,greatest1);
        System.out.println("======================================================");

        System.out.println();
        System.out.println();

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst graduating student is: Student %d scoring %d%n",numb2,smallest1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println();
        System.out.println("====================================================");
        System.out.printf("Class total score is %d%n",totalScore);
        double totalAverage = (double)totalScore/studentHighest.length;
        System.out.printf("Class average Score is %.2f%n",totalAverage);
        System.out.println("====================================================");



    }



}