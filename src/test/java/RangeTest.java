import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RangeTest {
    @Test
    public void  isStartWithInclusive() {
        Range range = new Range("[1,5)");
        boolean actualResult = range.isStartWithInclusive();
        assertTrue(actualResult);
    }

    @Test
    public void  isStartWithBracket() {
        Range range = new Range("(1,5]");
        boolean actualResult = range.isStartWithBracket();
        assertTrue(actualResult);
    }

    @Test
    public void  isStartInputNumber() {
        Range range = new Range("(1,5]");
        int actualResult = range.isStartInputNumber();
        assertEquals(1, actualResult);
    }

    @Test
    public void  isEndInputNumber() {
        Range range = new Range("(1,5]");
        int actualResult = range.isEndInputNumber();
        assertEquals(5, actualResult);
    }

    @Test
    public void  isEndWithInclusive() {
        Range range = new Range("(1,5]");
        boolean actualResult = range.isEndWithInclusive();
        assertTrue(actualResult);
    }

    @Test
    public void  isEndWithBracket() {
        Range range = new Range("(1,5)");
        boolean actualResult = range.isEndWithBracket();
        assertTrue(actualResult);
    }
}
