import org.junit.Test;

public class GameTest {

    @Test
    public void gameShouldInitializeTheSeed() {
        Game game = new Game(10, 10);

        boolean[][] initialGrid = new boolean[][]{{false, true, true},
                {false, false, false},
                {true, false, true}};
        game.setSeed(initialGrid);
    }
}
