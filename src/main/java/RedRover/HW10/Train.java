package RedRover.HW10;

public class Train extends LandTransport {
    public Train(int velocity) {
        super(velocity);
    }
    private int wagonCount;
    public int getWagonCount() {
        return wagonCount;
    }
    public void setWagonCount(int wagonCount) {
        this.wagonCount = wagonCount;
    }
}
