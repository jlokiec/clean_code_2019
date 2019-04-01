package pl.zzpj2019.solid.ocp.usa.solution;

public class GeorgiaSpeedingPolicy implements SpeedingPolicy {
    private static final int SPEED_LIMIT = 70;

    @Override
    public double calculateFine(int speed) {
        if (speed > SPEED_LIMIT) {
            return 100.0;
        } else {
            return 0.0;
        }
    }
}
