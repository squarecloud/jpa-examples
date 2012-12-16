package uk.co.squarecloud.jpaexamples.inheritance.table_per_class;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="TBCMessageType", discriminatorType = DiscriminatorType.INTEGER)
public abstract class TBCMessage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String messageText;

    TBCMessage() {
    }


    public TBCMessage(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }
}
