public class Game {
    private Grid grid;

    public Game(int x, int y) {
        grid = new Grid(x, y);
    }

    public void setSeed(boolean[][] seed) {
        for (int x = 0; x < seed.length; x++) {
            for (int y = 0; y < seed[x].length; y++)
                grid.set(x, y, seed[x][y]);
        }
    }

    public void start() {
        grid.display();
    }
}
