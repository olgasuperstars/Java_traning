package RedRover.HW10;

public abstract class LandTransport extends Transport {
    public LandTransport(int velocity) {
        super.velocity = velocity;
    }
    @Override
    public void move() {
        System.out.println("Двигаюсь по земле со скоростью " + getVelocity());
    }
}
