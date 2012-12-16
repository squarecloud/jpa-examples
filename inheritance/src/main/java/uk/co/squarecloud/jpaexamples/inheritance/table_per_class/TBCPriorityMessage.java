package uk.co.squarecloud.jpaexamples.inheritance.table_per_class;

import javax.persistence.Entity;

@Entity
public class TBCPriorityMessage extends TBCMessage {
    private int priority;

    TBCPriorityMessage() {}

    public TBCPriorityMessage(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
