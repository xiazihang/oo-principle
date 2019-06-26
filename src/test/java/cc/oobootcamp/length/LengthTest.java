package cc.oobootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void shouldReturnTrueWhenOneLengthIsLongerThanAnother() {
        Length shorterLength = new Length(1);
        Length longerLength = new Length(2);

        boolean result = longerLength.isLongerThan(shorterLength);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenOneLengthIsShorterThanAnother() {
        Length shorterLength = new Length(1);
        Length longerLength = new Length(2);

        boolean result = shorterLength.isShorterThan(longerLength);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenOneLengthIsEqualWithAnother() {
        Length lengthOne = new Length(1);
        Length lengthTwo = new Length(1);

        boolean result = lengthOne.isEqualWith(lengthTwo);
        assertTrue(result);
    }
}