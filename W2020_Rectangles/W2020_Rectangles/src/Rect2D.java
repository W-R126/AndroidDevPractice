public class Rect2D {
  double x1;
  double y1;
  double x2;
  double y2;
  double cx;
  double cy;
  double height;
  double width;
  String rectName;

  public Rect2D() {
    this.rectName = "";
    new Rect2D(0.0D, 0.0D, 1.0D, 1.0D);
  }

  public Rect2D(double cx, double cy, double height, double width, String rectName) {
    this(cx, cy, height, width);
    this.rectName = rectName;
  }

  public Rect2D(double cx, double cy, double height, double width) {
    this.rectName = "";
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
  }

  public double getArea() {
    return this.width * this.height;
  }

  public double getHeight() {
    return this.width * 2.0D + this.height * 2.0D;
  }

  public boolean contains(double x, double y) {
    return this.x1 <= x && x <= this.x2 && this.y1 <= y && y <= this.y2;
  }

  public boolean overlaps(Rect2D r) {
    return this.contains(r.x1, r.y1) || this.contains(r.x1, r.y2) || this.contains(r.x2, r.y1) || this.contains(r.x2, r.y2) || r.x1 <= this.x2 && r.x2 >= this.x1 && r.y2 >= this.y1 && r.y1 <= this.y2;
  }

  public boolean contains(Rect2D r) {
    return this.contains(r.x1, r.y1) && this.contains(r.x1, r.y2) && this.contains(r.x2, r.y1) && this.contains(r.x2, r.y2);
  }

  public String toString() {
    return "Rect2D{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", cx=" + this.cx + ", cy=" + this.cy + ", height=" + this.height + ", width=" + this.width + '}';
  }

  public Object getPerimeter() {

    return null;
  }
}
