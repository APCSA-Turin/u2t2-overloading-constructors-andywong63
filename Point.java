public class Point {
    // Instance vars
    private int x;
    private int y;

    // Constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int xyVal) {
        x = xyVal;
        y = xyVal;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    // Setter
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }

    // Getter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }
}
