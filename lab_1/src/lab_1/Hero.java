package lab_1;

public class Hero {

    public Hero(Movement movement, Point p){
        this.movement = movement;
        this.dislocation = p;
    }

    public void move(Point point) {
        movement.moveToPoint(point);
        this.dislocation = point;
    }

    public Movement getMovement() {
        return this.movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    private Movement movement;

    public Point getDislocation() {
        return dislocation;
    }

    Point dislocation;
}
