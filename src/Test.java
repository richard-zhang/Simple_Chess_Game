/**
 * Created by R on 12/1/15.
 */
public class Test {
    public static void main(String[] args) {
        Board board = new Board('A','H');
        Game game = new Game(board);

        System.out.println(game.getLocation("b8").occupiedBy());


    }
}