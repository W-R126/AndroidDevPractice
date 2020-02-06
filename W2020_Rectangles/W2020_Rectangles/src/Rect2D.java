public class Rect2D {
  double cx;
  double cy;
  double x1;
  double y1;
  double x2;
  double y2;
  double height;
  double width;
  String rectName;

  public Rect2D(double cx, double cy, double height, double width, String rectName) {
    this(cx, cy, height, width);
    this.rectName = rectName;
  }

  public Rect2D(double cx, double cy, double height, double width) {
    double halfWidth = width / 2.0D;
    double halfHeight = height / 2.0D;
    this.x1 = cx - halfWidth;
    this.x2 = cx + halfWidth;
    this.y1 = cy - halfHeight;
    this.y2 = cy + halfHeight;
    this.cx = cx;
    this.cy = cy;
    this.width = width;
    this.height = height;
    this.rectName = "";
  }

  public double getArea() {
    return this.width * this.height;
  }

  public Object getPerimeter() {
    return this.width * 2 + this.height * 2;
  }

  public boolean contains(double x, double y) {
    return this.x1 <= x && x <= this.x2 && this.y1 <= y && y <= this.y2;
  }

  public boolean overlaps(Rect2D cord) {
    return this.contains(cord.x1, cord.y1) || this.contains(cord.x1, cord.y2) ||
        this.contains(cord.x2, cord.y1) || this.contains(cord.x2, cord.y2) ||
        cord.x1 <= this.x2 && cord.x2 >= this.x1 && cord.y2 >= this.y1 && cord.y1 <= this.y2;
  }

  public boolean contains(Rect2D cord) {
    return this.contains(cord.x1, cord.y1) && this.contains(cord.x1, cord.y2) &&
        this.contains(cord.x2, cord.y1) && this.contains(cord.x2, cord.y2);
  }

  public String toString() {
    return "Rect2D{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", cx=" + this.cx + ", cy=" + this.cy + ", height=" + this.height + ", width=" + this.width + '}';
  }

}
