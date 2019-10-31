package com.controle.dao.impl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import com.controle.dao.GenericDAO;
import com.controle.persistencia.ConnectionFactory;

import java.io.Serializable;


public class GenericDAOImpl <T, ID extends Serializable> implements GenericDAO<T, ID> {
    
    public T save(T t) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return t;
    }
  


    @Override
    public T update(T t) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return t;
    }
        
    @SuppressWarnings("unchecked")
	@Override
    public List<T> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<T> t = null;
        try {
            t = em.createQuery("FROM UsuarioM o ").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return t;
    }

    @SuppressWarnings("unchecked")
	public T remove(T t,Long id) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
        	
            t = em.find((Class<T>) t.getClass(), id);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover" + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return t;
    }




	
}