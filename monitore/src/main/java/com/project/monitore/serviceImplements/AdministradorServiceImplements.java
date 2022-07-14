package com.project.monitore.serviceImplements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.monitore.entity.Administrador;
import com.project.monitore.repository.AdministradorRepository;
import com.project.monitore.service.AdministradorService;

@Service
public class AdministradorServiceImplements implements AdministradorService {
	
	private AdministradorRepository administradorRepository;
	
	
	public AdministradorServiceImplements(AdministradorRepository administradorRepository) {
		super();
		this.administradorRepository = administradorRepository;
	}

	
	@Override
	public List<Administrador> getAllAdministradores() {
		return administradorRepository.findAll();
		
	}
	


	@Override
	public Administrador getAdministradorById(Long id) {
		
		return administradorRepository.findById(id).get();
	}


	@Override
	public Administrador atualizarAdministrador(Administrador administrador) {
		
		return administradorRepository.save(administrador);
	}


	@Override
	public Administrador salvarAdministrador(Administrador administrador) {
	
		return administradorRepository.save(administrador);
	}


	@Override
	public void excluirAdministradorById(Long id) {
		administradorRepository.deleteById(id);
		
	}




}
