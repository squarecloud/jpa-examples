package uk.co.squarecloud.jpaexamples.inheritance.singletable;

import javax.persistence.Entity;

@Entity
public class STDescriptiveMessage extends STMessage {
    private String description;


    STDescriptiveMessage() {}

    public STDescriptiveMessage(String message, String description) {
        super(message);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
