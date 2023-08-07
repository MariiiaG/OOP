package OOP.Lec1.Ex03;

/*
 * Это точка 2D   // type '/**' to set up this king of comment to describe the code here / = документация
*/

public class Point2D {
    private int x, y; // Это координата х и у // set to private, so it can only be read/changed within this class
   /**
     * Это конструктор ...
     * @param valueX это координата Х   // type '/**' to explain the variables we use here
     * @param valueY это координата Y
     */
  
    public Point2D(int valueX, int valueY) { // конструктор
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){ // use this to be able to read x and y from outside this class, without risking it being changed
        return x;
    }

    public int getY(){
        return y;
    }
    
    public void setX(int value){ // allows to change value from other classes
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}
