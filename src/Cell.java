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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cell cell = (Cell) o;

        if (x != cell.x)
            return false;
        if (y != cell.y)
            return false;
        return alive == cell.alive;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (alive ? 1 : 0);
        return result;
    }
}
