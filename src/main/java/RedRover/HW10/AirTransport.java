package RedRover.HW10;

public abstract class AirTransport extends Transport {
    public AirTransport(int velocity) {

        super.velocity = velocity;
    }
    @Override
    public void move() {
        System.out.println("Двигаюсь по воздуху со скоростью " + getVelocity());
    }
}
