package pl.zzpj2019.solid.isp.contactbook.solution;

public class Emailer {
    public void sendEmail(Emailable emailable, String subject, String content) {
        String email = emailable.getEmailAddress();
        sendEmail(email, subject, content);
    }

    private void sendEmail(String email, String subject, String content) {
        String message = "Subject: " + subject;
        message += "\nTo: " + email;
        message += "\nContent:\n" + content;
        System.out.println("Sending message:\n" + message);
    }
}
