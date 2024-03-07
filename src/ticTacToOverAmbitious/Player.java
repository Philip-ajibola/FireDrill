package ticTacToOverAmbitious;


public record Player(int id, Value type) {
    public void play(TicTacToeOverAmbitious ticTacTo, int position) {
        ticTacTo.pickPosition(position,type());
    }
}
