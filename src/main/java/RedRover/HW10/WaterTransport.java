package RedRover.HW10;

public abstract class WaterTransport extends Transport {
    public WaterTransport(int velocity) {
        super.velocity = velocity;
    }
    @Override
    public void move() {
        System.out.println("Двигаюсь по воде со скоростью " + getVelocity());
    }
}
