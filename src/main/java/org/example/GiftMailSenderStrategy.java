package org.example;

class GiftMailSenderStrategy implements MailSenderStrategy {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending gift letter to " + mailInfo.getClient().getName() + ".");
    }
}

