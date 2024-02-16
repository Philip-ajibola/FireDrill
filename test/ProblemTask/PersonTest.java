package ProblemTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    @Test
    public void testThatPeronHardToProblemList(){
        Person person =  new Person();
        Problem problem = new Problem("financial Problem",Type.FINANCIAL);
        person.add(problem);
        ArrayList<Problem> problems = person.recountProblem();
        assertEquals(1,problems.size());
    }
    @Test
    public void testThatProblemCanBeSolved(){
        Person person = new Person();
        Problem problem = new Problem("financial Problem",Type.FINANCIAL);
        Problem problem1 = new Problem("Lack Of Sales",Type.BUSINESS);
        person.add(problem);
        person.add(problem1);
        person.solveProblem(problem1);
        assertEquals(1,person.recountProblem().size());
        assertTrue(problem1.isSolved());

    }


}