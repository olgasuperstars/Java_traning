package RedRover.HW10;

public class Ships extends WaterTransport{
    public Ships(int velocity) {
        super(velocity);
    }
    private int displacement;
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
