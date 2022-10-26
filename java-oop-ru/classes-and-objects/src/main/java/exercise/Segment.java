package exercise;

// BEGIN
public class Segment {

    private Point beginPoint;
    private Point endPoint;

    public Segment (Point begin, Point end) {
        this.beginPoint = begin;
        this.endPoint = end;
    }

    protected Point getBeginPoint() {
        return beginPoint;
    }

    protected Point getEndPoint() {
        return endPoint;
    }

    protected Point getMidPoint() {
        Integer midX = (beginPoint.getX() + endPoint.getX()) / 2;
        Integer midY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(midX, midY);
    }
}
// END
