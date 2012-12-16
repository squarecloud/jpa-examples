package uk.co.squarecloud.jpaexamples.inheritance.joined_classes;

import javax.persistence.Entity;

@Entity
public class JCPriorityMessage extends JCMessage {
    private int priority;

    JCPriorityMessage() {}

    public JCPriorityMessage(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
