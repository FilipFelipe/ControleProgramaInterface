package com.controle.servico;
import com.controle.model.UsuarioM;

public interface UsuarioService {

	public void salvarCliente(UsuarioM usuario);
	public void excluirCliente(UsuarioM usuario,Long id);
	public void alterarCLiente(UsuarioM usuario);
	public UsuarioM consultarCliente(Long id);
}
