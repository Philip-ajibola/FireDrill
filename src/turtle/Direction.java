package turtle;

public enum Direction {
    EAST("NORTH"),
    NORTH("WEST"),
    WEST("SOUTH"),
    SOUTH("EAST");
    Direction(String left){
            this.left = left;
    }
    private String left;
    public Direction turnleft(){
        return Direction.valueOf(this.left);
    }
}
