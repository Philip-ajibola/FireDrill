package turtle;

public class Position {
    private int row;
    private int column;
    public Position(int column,int row){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }
    public int getColumn(){
        return column;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Position position){
            return (row == position.row  && column == position.column) ;
        }
        return false;
    }
}
