package uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MSPriorityMessage extends MSMessage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private int priority;

    MSPriorityMessage() {}

    public MSPriorityMessage(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}
