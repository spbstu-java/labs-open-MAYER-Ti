package lab_1;

public class Point {

    public double lat;
    public double lon;

    Point (double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    String string() {
        return  new String("{lat: " + this.lat + " lon: " + this.lon + "}");
    }

}
