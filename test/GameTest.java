import org.junit.Test;

public class GameTest {

    @Test
    public void gameShouldInitializeTheSeed() {
        Game game = new Game(3, 3);

        boolean[][] initialGrid = new boolean[][]{
                {false, true, true},
                {false, false, false},
                {true, false, true}
        };
        game.setSeed(initialGrid);
    }
}
