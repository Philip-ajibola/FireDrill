package ProblemTask;

public class Problem {
    private String name;
    private Type type;
    private boolean isSolved;
    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public boolean isSolved(){
        return isSolved;
    }
    public void problemSolved(){
        isSolved= true;
    }
}
