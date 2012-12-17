package uk.co.squarecloud.jpaexamples.inheritance;

import uk.co.squarecloud.jpaexamples.inheritance.joined_classes.JCDescriptiveMessage;
import uk.co.squarecloud.jpaexamples.inheritance.joined_classes.JCMessage;
import uk.co.squarecloud.jpaexamples.inheritance.joined_classes.JCPriorityMessage;
import uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass.MSDescriptiveMessage;
import uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass.MSMessage;
import uk.co.squarecloud.jpaexamples.inheritance.mapped_superclass.MSPriorityMessage;
import uk.co.squarecloud.jpaexamples.inheritance.singletable.STDescriptiveMessage;
import uk.co.squarecloud.jpaexamples.inheritance.singletable.STMessage;
import uk.co.squarecloud.jpaexamples.inheritance.singletable.STPriorityMessage;
import uk.co.squarecloud.jpaexamples.inheritance.table_per_class.TBCDescriptiveMessage;
import uk.co.squarecloud.jpaexamples.inheritance.table_per_class.TBCMessage;
import uk.co.squarecloud.jpaexamples.inheritance.table_per_class.TBCPriorityMessage;

import javax.persistence.*;
import java.util.List;

public class Main {

    private static EntityManager em;

    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("inheritance");
        em = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        MSMessage priorityMSMessage = new MSPriorityMessage("Hello world", 6);
        MSMessage descriptiveMSMessage = new MSDescriptiveMessage("Hello world", "a long description");

        em.persist(priorityMSMessage);
        em.persist(descriptiveMSMessage);

        STMessage stpriorityMessage = new STPriorityMessage("Hello world", 6);
        STMessage stdescriptiveMessage = new STDescriptiveMessage("Hello world", "a long description");

        em.persist(stpriorityMessage);
        em.persist(stdescriptiveMessage);

        JCMessage jcpriorityMessage = new JCPriorityMessage("Hello world", 6);
        JCMessage jcdescriptiveMessage = new JCDescriptiveMessage("Hello world", "a long description");

        em.persist(jcpriorityMessage);
        em.persist(jcdescriptiveMessage);

        TBCMessage tbcpriorityMessage = new TBCPriorityMessage("Hello world", 6);
        TBCMessage tbcdescriptiveMessage = new TBCDescriptiveMessage("Hello world", "a long description");

        em.persist(tbcpriorityMessage);
        em.persist(tbcdescriptiveMessage);

        transaction.commit();

        for (STMessage message : getSTMessages()) {
            System.out.println("Got message " + message.getMessageText());
        }
    }

    @SuppressWarnings("unchecked")
    private static List<STMessage> getSTMessages() {
        Query query = em.createQuery("select m from STMessage m");
        return query.getResultList();
    }
}
