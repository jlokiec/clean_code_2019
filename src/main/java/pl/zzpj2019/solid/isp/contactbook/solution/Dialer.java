package pl.zzpj2019.solid.isp.contactbook.solution;

public class Dialer {
    public void dial(Dialable dialable) {
        String telephone = dialable.getTelephone();
        call(telephone);
    }

    private void call(String telephone) {
        System.out.println("Calling telephone number: " + telephone);
    }
}
