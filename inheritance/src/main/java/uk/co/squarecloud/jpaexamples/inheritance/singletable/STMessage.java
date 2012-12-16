package uk.co.squarecloud.jpaexamples.inheritance.singletable;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) // Optional - this is the default
public abstract class STMessage {
    private String messageText;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    STMessage() {
    }

    public STMessage(String messageText) {
        this.messageText = messageText;
    }

    public Integer getId() {
        return id;
    }

    public String getMessageText() {
        return messageText;
    }
}
