package com.controle.servico.impl;
import com.controle.dao.TelefoneDAO;
import com.controle.dao.impl.TelefoneDAOImpl;
import com.controle.model.TelefoneM;
import com.controle.servico.TelefoneService;
import java.util.List;

public class TelefoneServiceImpl implements TelefoneService{

    TelefoneDAO dao =  new TelefoneDAOImpl();
    
	public List<TelefoneM> findAll() {
        
        return dao.FindAll();
    }

	@Override
	public void salvarTelefone(TelefoneM telefone) {
		dao.SalvarTel(telefone);
	}

	@Override
	public void alterarTelefone(TelefoneM telefone) {
		dao.update(telefone);
		
	}

	@Override
	public void excluirTelefone(TelefoneM telefone,Long id) {
		dao.remove(telefone,id);
	
		
	}

	@Override
	public TelefoneM consultarTelefone(Long id) {
		
		 return dao.findByID(id);
	}

	

}

