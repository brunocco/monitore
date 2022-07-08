package com.project.monitore.service;

import java.util.List;

import com.project.monitore.entity.Cadastro;

public interface CadastroService {
	
	List<Cadastro> getAllCadastros();

	Cadastro salvarCadastro(Cadastro cadastro);
	
	Cadastro getCadastroByid(Long id);
	
	Cadastro atualizarCadastro(Cadastro cadastro);

	void excluirCadastroById(Long id);
}
