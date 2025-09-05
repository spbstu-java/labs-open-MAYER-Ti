package lab_1;

public class Point {
    Point (double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    String string() {
        return  new String("{lat: " + this.lat + " lon: " + this.lon + "}");
    }
    public double lat;
    public double lon;
}
