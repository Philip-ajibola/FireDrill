package turtle;

public class Turtle {

    private boolean penIsUp = true;

    public boolean isPenUp() {
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }
}
