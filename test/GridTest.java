import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GridTest {

    @Test
    public void gridIsTwoDimensional() {
        Grid grid = new Grid(100, 100);
        grid.set(10, 10, true);

        assertEquals(true, grid.get(10, 10));
    }

    @Test
    public void gridShouldSetAndGetStatesCorrectly() {
        Grid grid = new Grid(10, 10);
        grid.set(5, 5, true);

        boolean actualState = grid.get(5, 5);

        assertThat(actualState, is(equalTo(true)));
    }

    @Test
    public void gridShouldDisplayItsState() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Grid grid = new Grid(3, 3);
        grid.set(2, 2, true);

        grid.display();

        assertEquals(outputStream.toString(), "000\n000\n001\n");
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }
}
