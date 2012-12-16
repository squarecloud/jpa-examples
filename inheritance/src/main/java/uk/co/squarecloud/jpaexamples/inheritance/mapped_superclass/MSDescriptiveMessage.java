package uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MSDescriptiveMessage extends MSMessage {
    private String description;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    MSDescriptiveMessage() {}

    public MSDescriptiveMessage(String message, String description) {
        super(message);
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
