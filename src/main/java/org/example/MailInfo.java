package org.example;

import lombok.Getter;

enum MailCode {
    BIRTHDAY_GREETING, GIFT_CARD, CHRISTMAS_GREETING, EASTER_GREATING
}

@Getter
public class MailInfo {
    Client client;
    MailCode mailCode;
}
