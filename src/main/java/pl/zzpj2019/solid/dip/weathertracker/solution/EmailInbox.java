package pl.zzpj2019.solid.dip.weathertracker.solution;

public class EmailInbox implements WeatherAlertGenerator {
    @Override
    public void generateWeatherAlert(String weatherConditions) {
        String email = "It is " + weatherConditions;
        System.out.println("New mail\n" + email);
    }
}
