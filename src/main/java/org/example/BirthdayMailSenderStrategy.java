package org.example;

class BirthdayMailSenderStrategy implements MailSenderStrategy {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending birthday greetings to " + mailInfo.getClient().getName() + ".");
    }
}

