public class Grid {

    private boolean[][] grid;

    public Grid(int x, int y) {
        grid = new boolean[x][y];
    }


    public void set(int x, int y, boolean state) {
        grid[x][y] = state;
    }

    public boolean get(int x, int y) {
        return grid[x][y];
    }

    public void display() {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++)
                System.out.print(grid[x][y] == true ? 1 : 0);
            System.out.println();
        }
    }
}
