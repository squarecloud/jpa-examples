package uk.co.squarecloud.jpaexamples.inheritance.table_per_class;

import javax.persistence.Entity;

@Entity
public class TBCDescriptiveMessage extends TBCMessage {
    private String description;

    TBCDescriptiveMessage() {}

    public TBCDescriptiveMessage(String message, String description) {
        super(message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
