import org.junit.jupiter.api.Test;

public class RangeTest {
    @Test
    public void  isStartWithKampoo() {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isStartWithInclusive();
        assertTrue(actualResult);
    }

    private void assertTrue(boolean actualResult) {

    }
}
