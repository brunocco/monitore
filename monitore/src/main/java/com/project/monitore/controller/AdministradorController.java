package com.project.monitore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.project.monitore.entity.Administrador;
import com.project.monitore.service.AdministradorService;

@Controller
public class AdministradorController {
	
	private AdministradorService administradorService;

	public AdministradorController(AdministradorService administradorService) {
		super();
		this.administradorService = administradorService;
	}
	
	/*
	@RequestMapping(method = RequestMethod.GET, value="/cadastrar")
	public String inicio() {
		return "/banco/cadastrar";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/salvarcadastro")
	public String salvar(Cadastro cadastro){
		cadastroRepository.save(cadastro);
		return "/banco/cadastrar";
	}*/
	
	
	@GetMapping("/administradores")
	public String listarAdministradores(Model model) {
		model.addAttribute("administradores", administradorService.getAllAdministradores());
		return "Administradores";
		
	}
	
	@GetMapping("/administradores/administrador")
	public String cadastrarViaForm(Model model) {
		Administrador administrador = new Administrador();
		model.addAttribute("administrador", administrador);
		return "/cadastrarAdm";
	}
	
	@PostMapping("/administradores")
	public String salvarAdministrador(@ModelAttribute("administrador") Administrador administrador) {
		administradorService.salvarAdministrador(administrador);
		return "redirect:/administradores";
		
	}
	
	@GetMapping("/administradores/editar/{id}")
	public String editarViaForm(@PathVariable Long id, Model model) {
		model.addAttribute("administrador", administradorService.getAdministradorById(id));
		return "/atualizar";
	}
	
	@PostMapping("administradores/{id}")
	public String atualizarAdministrador (@PathVariable Long id, @ModelAttribute("administrador") Administrador administrador, Model model ) {
		Administrador existenciaDeAdministrador = administradorService.getAdministradorById(id);
		existenciaDeAdministrador.setCodigo(administrador.getCodigo());
		existenciaDeAdministrador.setNome(administrador.getNome());

		
		administradorService.atualizarAdministrador(existenciaDeAdministrador);
		return "redirect:/administradores";
		
	}
	
	@GetMapping("/administradores/excluir/{id}")
	public String excluirAdministrador(@PathVariable Long id) {
		administradorService.excluirAdministradorById(id);
		return "redirect:/administradores";
	}
}
