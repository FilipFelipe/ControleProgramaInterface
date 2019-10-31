package com.controle.servico.impl;
import com.controle.dao.UsuarioDAO;
import com.controle.dao.impl.UsuarioDAOImpl;
import com.controle.model.UsuarioM;
import com.controle.servico.UsuarioService;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService{

    UsuarioDAO dao =  new UsuarioDAOImpl();
    
	public void salvarCliente(UsuarioM usuario) {
		dao.save(usuario);
	}

	public UsuarioM consultarCliente(Long id) {  
		
		return dao.findByID(id);
	}

	public void excluirCliente(UsuarioM usuario,Long id) {
		 dao.remove(usuario,id);
	}

	public void alterarCLiente(UsuarioM usuario) {
		dao.update(usuario);
	}

	public List<UsuarioM> findAll() {
        
        return dao.FindAll();
    }

}

