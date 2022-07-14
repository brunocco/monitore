package com.project.monitore.service;

import java.util.List;

import com.project.monitore.entity.Administrador;

public interface AdministradorService {
	
	List<Administrador> getAllAdministradores();

	Administrador salvarAdministrador(Administrador administrador);
	
	Administrador getAdministradorById(Long id);
	
	Administrador atualizarAdministrador(Administrador administrador);

	void excluirAdministradorById(Long id);





}
