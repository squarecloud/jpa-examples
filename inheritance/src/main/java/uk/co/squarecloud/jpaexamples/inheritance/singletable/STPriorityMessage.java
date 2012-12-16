package uk.co.squarecloud.jpaexamples.inheritance.singletable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class STPriorityMessage extends STMessage {
    private int priority;

    STPriorityMessage() {}

    public STPriorityMessage(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
