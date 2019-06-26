package cc.oobootcamp.length;

public class Length {
    private int absoluteValue;

    public Length(Integer absoluteValue) {
        this.absoluteValue = absoluteValue;
    }

    public boolean isLongerThan(Length otherLength) {
        return absoluteValue > otherLength.absoluteValue;
    }

    public boolean isShorterThan(Length otherLength) {
        return absoluteValue < otherLength.absoluteValue;
    }

    public boolean isEqualWith(Length otherLength) {
        return absoluteValue == otherLength.absoluteValue;
    }
}
