import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CellTest {
    @Test
    public void canChangeStateOfAToAlive() {
        Cell cell = new Cell(10, 10);
        cell.setAlive();

        boolean actualState = cell.isAlive();

        assertThat(actualState, is(equalTo(true)));
    }

    @Test
    public void canChangeStateOfACellToDead() {
        Cell cell = new Cell(10, 10);
        cell.setDead();

        boolean actualState = cell.isAlive();

        assertThat(actualState, is(equalTo(false)));
    }
}
