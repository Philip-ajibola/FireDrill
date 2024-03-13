package studentgradeTwo;

import static org.junit.jupiter.api.Assertions.*;


    import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class StudentGradeTest {
        private static StudentGrade studentGrade;
        //private static int[][] studentGrades;

        @BeforeEach
        public void setStudentGrades() {

            studentGrade = new StudentGrade();



            int[][] studentGrades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};

            studentGrade.setStudentGrades(studentGrades);


            //int[][] expectedOutput = new int[4][3];

            //int[][] actualOutput = lagbajaSchools.getStudentGrades();

            //assertArrayEquals(expectedOutput, actualOutput);

        }

/////////////////////////////int[][] studentGrades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};

	/*@Test
	public void testSetAndStudentGrades() {



		//lagbajaSchools.setStudentGrades(4,3);

		//int[][] expectedOutput = new int[4][3];

		int[][] actualOutput = lagbajaSchools.getStudentGrades();

		assertArrayEquals(expectedOutput, actualOutput);

	}*/

        @Test
        public void studentGradesTotal() {


            int expectedOutput = 137;

            int actualOutput = studentGrade.studentGradesTotal(0);


            assertEquals(expectedOutput, actualOutput);

        }


    }



