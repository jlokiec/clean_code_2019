package pl.zzpj2019.solid.ocp.usa.solution;

public class AlabamaSpeedingPolicy implements SpeedingPolicy {
    private static final int SPEED_LIMIT = 75;

    @Override
    public double calculateFine(int speed) {
        if (speed > SPEED_LIMIT) {
            return (speed - SPEED_LIMIT) * 25.0;
        } else {
            return 0.0;
        }
    }
}
