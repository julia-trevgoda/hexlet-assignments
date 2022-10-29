package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home home) {
        if (getArea() > home.getArea()) {
            return 1;
        } else if (getArea() < home.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
       return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
