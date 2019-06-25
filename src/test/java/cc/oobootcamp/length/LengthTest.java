package cc.oobootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void shouldReturnBiggerNumber() {
        Length smallerLength = new Length(1);
        Length biggerLength = new Length(2);

        boolean result = biggerLength.isLongerThan(smallerLength);
        assertTrue(result);
    }
}