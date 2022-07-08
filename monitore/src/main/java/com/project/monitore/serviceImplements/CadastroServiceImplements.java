package com.project.monitore.serviceImplements;

import java.util.List;
import org.springframework.stereotype.Service;
import com.project.monitore.entity.Cadastro;
import com.project.monitore.repository.CadastroRepository;
import com.project.monitore.service.CadastroService;

@Service
public class CadastroServiceImplements implements CadastroService {
	
	private CadastroRepository cadastroRepository;
	
	
	public CadastroServiceImplements(CadastroRepository cadastroRepository) {
		super();
		this.cadastroRepository = cadastroRepository;
	}


	@Override
	public List<Cadastro> getAllCadastros(){
		return cadastroRepository.findAll();
		
	}

}
