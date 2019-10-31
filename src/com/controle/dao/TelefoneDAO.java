package com.controle.dao;
import com.controle.model.TelefoneM;
public interface TelefoneDAO extends GenericDAO<TelefoneM, Long>{
	
	public TelefoneM findByID(Long id);
	public void SalvarTel(TelefoneM telefone);
}
