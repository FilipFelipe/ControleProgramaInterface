package com.controle.servico;
import com.controle.model.TelefoneM;
public interface TelefoneService {

	public void salvarTelefone(TelefoneM telefone);
	public void alterarTelefone(TelefoneM telefone);
	public TelefoneM consultarTelefone(Long id);
	void excluirTelefone(TelefoneM telefone, Long id);

}
