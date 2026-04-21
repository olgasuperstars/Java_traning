package RedRover.HW10;

public class Ship extends WaterTransport{
    public Ship(int velocity) {
        super(velocity);
    }
    private int displacement;
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    @Override
    public void move() {
        System.out.println("Корабль с водоизмещением " + getDisplacement() + " тонн идет по воде со скоростью " + getVelocity());
    }
}
