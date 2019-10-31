package com.controle.dao.impl;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import com.controle.dao.UsuarioDAO;
import com.controle.model.UsuarioM;
import com.controle.persistencia.ConnectionFactory;


public  class UsuarioDAOImpl extends GenericDAOImpl<UsuarioM, Long> implements UsuarioDAO{

	@Override
    public  UsuarioM  findByID(Long id) {

        EntityManager em = new ConnectionFactory().getConnection();
        UsuarioM usuario = null;

        try {
        	usuario = em.find(UsuarioM.class,id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar" + e);
        } finally {
            em.close();
        }

        return usuario;

    }

	
	
	
	
	

	
}
