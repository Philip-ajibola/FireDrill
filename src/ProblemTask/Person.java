package ProblemTask;

import java.util.ArrayList;

public class Person {
    private ArrayList<Problem> problems = new ArrayList<>();

    public void add(Problem problem) {
        problems.add(problem);
    }

    public ArrayList<Problem> recountProblem() {
        return problems;
    }

    public void solveProblem(Problem problem) {
            if(contain(problem)) {
                problems.remove(problem);
                problem.problemSolved();
            }
    }
    public boolean contain(Problem problem){
        boolean condition = false;
        for(int count = 0; count<problems.size();count++) {
            if (problem.equals(problems.get(count))) {condition =  true;break;}
            else condition = false;
        }
        return condition;
    }
}
