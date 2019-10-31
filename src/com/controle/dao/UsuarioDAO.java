package com.controle.dao;
import com.controle.model.UsuarioM;;
public interface UsuarioDAO extends GenericDAO<UsuarioM, Long>{

	UsuarioM findByID(Long id);

}
