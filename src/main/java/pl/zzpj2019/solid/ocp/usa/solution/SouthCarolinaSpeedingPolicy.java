package pl.zzpj2019.solid.ocp.usa.solution;

public class SouthCarolinaSpeedingPolicy implements SpeedingPolicy {
    private static final int SPEED_LIMIT = 65;

    @Override
    public double calculateFine(int speed) {
        if (speed > SPEED_LIMIT) {
            return 200.0;
        } else {
            return 0.0;
        }
    }
}
