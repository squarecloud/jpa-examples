package uk.co.squarecloud.jpaexamples.inheritance.joined_classes;

import javax.persistence.Entity;

@Entity
public class JCDescriptiveMessage extends JCMessage {
    private String description;

    JCDescriptiveMessage() {}

    public JCDescriptiveMessage(String message, String description) {
        super(message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
