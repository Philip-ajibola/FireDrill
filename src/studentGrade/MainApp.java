package studentGrade;

public class MainApp {
    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();

        grade.setGrade();
        grade.printResult();
        grade.highestScoring();
        grade.printBestStudent();

    }
}
