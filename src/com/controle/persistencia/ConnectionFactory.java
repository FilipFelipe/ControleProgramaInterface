package com.controle.persistencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
	
public class ConnectionFactory {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle");
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
