public class Triangle extends Polygon{
    public Triangle(String theName, float theWidth, float theHeight){
        super(theName, theWidth, theHeight);
        polytype = KindofPolygon.POLY_TRIANG;


    }
    public float calArea() { return (float)0.5*width*height; }
}
