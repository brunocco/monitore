package com.project.monitore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.monitore.entity.Cadastro;
import com.project.monitore.service.CadastroService;

@Controller
public class CadastroController {
	
	private CadastroService cadastroService;

	public CadastroController(CadastroService cadastroService) {
		super();
		this.cadastroService = cadastroService;
	}
	
	@GetMapping("/listaGeral")
	public String listarCasdastros(Model model) {
		model.addAttribute("listaGeral", cadastroService.getAllCadastros());
		return "listaGeral.html";
		
	}
	
	@GetMapping("/index/cadastro")
	public String cadastrarViaForm(Model model) {
		Cadastro cadastro = new Cadastro();
		model.addAttribute("cadastro", cadastro);
		return "/cadastro.html";
	}
	
	@PostMapping("/index")
	public String salvarCadastro(@ModelAttribute("cadastro") Cadastro cadastro) {
		cadastroService.salvarCadastro(cadastro);
		return "redirect:/index.html";
		
	}
	
	@GetMapping("/index/editar/{id}")
	public String editarViaForm(@PathVariable Long id, Model model) {
		model.addAttribute("cadastro", cadastroService.getCadastroByid(id));
		return "/cadastro.html";
	}
	
	@PostMapping
	public String atualizarCadastro (@PathVariable Long id, @ModelAttribute("cadastro") Cadastro cadastro, Model model ) {
		Cadastro existenciaDeCadastro = cadastroService.getCadastroByid(id);
		existenciaDeCadastro.setId(id);
		existenciaDeCadastro.setNome(cadastro.getNome());
		existenciaDeCadastro.setEndereco(cadastro.getEndereco());
		existenciaDeCadastro.setCep(cadastro.getCep());
		existenciaDeCadastro.setCpf(cadastro.getCpf());
		existenciaDeCadastro.setCelular1(cadastro.getCelular1());
		existenciaDeCadastro.setCelular2(cadastro.getCelular2());
		existenciaDeCadastro.setEmail(cadastro.getEmail());
		existenciaDeCadastro.setSenha(cadastro.getSenha());
		existenciaDeCadastro.setcSenha(cadastro.getcSenha());
		existenciaDeCadastro.setNecessidade(cadastro.getNecessidade());
		
		cadastroService.atualizarCadastro(existenciaDeCadastro);
		return "redirect:/index";
		
	}
	
	@GetMapping("/index/excluir/{id}")
	public String excluirCadastro(@PathVariable Long id) {
		cadastroService.excluirCadastroById(id);
		return "redirect:/cadastro.html";
	}
		
	

}