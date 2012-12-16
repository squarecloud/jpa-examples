package uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass;

import javax.persistence.*;

@MappedSuperclass
public abstract class MSMessage {
    private String messageText;

    MSMessage() {
    }

    public MSMessage(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }
}
