package org.example;

interface MailSender {
    void sendMail(MailInfo mailInfo);
}

// Concrete implementations of MailSender for different mail types
class BirthdayMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending birthday greetings to " + mailInfo.getClient().getName() + ".");
    }
}

class GiftMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending gift letter to " + mailInfo.getClient().getName() + ".");
    }
}
