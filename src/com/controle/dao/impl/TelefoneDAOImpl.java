package com.controle.dao.impl;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import com.controle.dao.TelefoneDAO;
import com.controle.model.TelefoneM;
import com.controle.persistencia.ConnectionFactory;

public class TelefoneDAOImpl extends GenericDAOImpl<TelefoneM, Long> implements TelefoneDAO{

	@Override
    public  TelefoneM  findByID(Long id) {

        EntityManager em = new ConnectionFactory().getConnection();
        TelefoneM telefone = null;

        try {
        	telefone = em.find(TelefoneM.class,id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return telefone;

    }

	  public void SalvarTel(TelefoneM telefone) {
	        EntityManager em = new ConnectionFactory().getConnection();

	        try {
	            em.getTransaction().begin();
	            em.persist(telefone);
	            em.getTransaction().commit();
	           
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Erro ao Salvar" + e);
	            em.getTransaction().rollback();
	        } finally {
	            em.close();
	        }

	        return;
	    }

	

}
