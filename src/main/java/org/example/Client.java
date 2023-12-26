package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Client extends User{
    @Builder.Default
    private int ClientId = increaseId();
    private static int ClientIdCounter = 0;

    private static int increaseId (){
        return ClientIdCounter++;
    }
}
