package database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final String PERSISTENCE_NAME = "PERSISTENCIA";
    private static EntityManagerFactory factory;

    private JPAUtil(){

    }

    public static EntityManagerFactory getEntityManager(){
        if(factory == null){
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        }
        return factory;
    }

    public static void shutDown(){
        if (factory != null){
            factory.close();
        }
    }

}
