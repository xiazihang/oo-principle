package cc.oobootcamp.length;

public class Length {
    private Integer absoluteValue;

    public Length(Integer absoluteValue) {
        this.absoluteValue = absoluteValue;
    }

    public boolean isLongerThan(Length otherLength) {
        return absoluteValue > otherLength.absoluteValue;
    }

}
