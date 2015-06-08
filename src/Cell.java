public class Cell {
    private int x, y;
    private boolean alive;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setDead() {
        alive = false;
    }

    public void setAlive() {
        alive = true;
    }
}
