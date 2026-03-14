package RedRover.HW10;

public abstract class Transport {
    protected int velocity;
public int getVelocity() {
    return velocity;
}
public void setVelocity(int velocity) {
    this.velocity = velocity;
}
    public abstract void move();
}
