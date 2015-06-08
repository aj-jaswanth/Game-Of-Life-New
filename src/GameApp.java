public class GameApp {
    public static void main(String[] args) {
        Game game = new Game(5, 5);
        boolean[][] initialGrid = new boolean[][]{{false, true, true},
                {false, false, false},
                {true, false, true}};
        game.setSeed(initialGrid);
        game.start();
    }
}
