package org.example;

import org.example.MailInfo;

import java.util.ArrayList;
import java.util.List;

class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    private MailSenderStrategy mailSenderStrategy;

    public MailBox(MailSenderStrategy mailSenderStrategy) {
        this.mailSenderStrategy = mailSenderStrategy;
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            mailInfo.getClient().setClientId(infos.indexOf(mailInfo));
            mailSenderStrategy.sendMail(mailInfo);
        }
    }
}
