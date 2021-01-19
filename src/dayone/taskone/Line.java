package dayone.taskone;

import java.util.Objects;

public class Line {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    double length;

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        length=Math.hypot(endX-startX,endY-startY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) {
            return false;
        }
        Line line = (Line) o;
        return Double.compare(line.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    public double getLength() {
        return length;
    }
}
