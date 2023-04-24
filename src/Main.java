import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Board board = new Board();
        board.getDeck().createDeck();
        board.howManyPlayers();
        while(board.getDeck().deck.size() != 0) {
            board.dealCard();
            board.getTopCard();
            for (int i = 0; i < 24; i++) {
                board.play();
            }

            board.dealCard();

            for (int i = 0; i < 24; i++) {
                board.dealCard();
                board.play();

            }


        }

    }
}