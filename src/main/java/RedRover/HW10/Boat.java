package RedRover.HW10;

public class Boat extends WaterTransport{
    public Boat(int velocity) {
        super(velocity);
    }
    private double maxDraftMeters;
    public double getMaxDraftMeters() {
        return maxDraftMeters;
    }
    public void setMaxDraftMeters(double maxDraftMeters) {
        this.maxDraftMeters = maxDraftMeters;
    }
}
