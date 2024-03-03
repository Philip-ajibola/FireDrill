package ticTacToTwo;

public record Player(int id, Value type) {
    public void play(TicTacTo ticTacTo,int position) {
        ticTacTo.pickPosition(position,type());
    }
}
