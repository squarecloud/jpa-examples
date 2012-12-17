package uk.co.squarecloud.jpaexamples.inheritance.joined_classes;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class JCMessage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String messageText;

    JCMessage() {
    }


    public JCMessage(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }
}
