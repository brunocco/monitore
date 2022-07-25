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

	/*
	 * @RequestMapping(method = RequestMethod.GET, value="/cadastrar") public String
	 * inicio() { return "/banco/cadastrar"; }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, value="/salvarcadastro") public
	 * String salvar(Cadastro cadastro){ cadastroRepository.save(cadastro); return
	 * "/banco/cadastrar"; }
	 */

	@GetMapping("/cadastros")
	public String listarCasdastros(Model model) {
		model.addAttribute("cadastros", cadastroService.getAllCadastros());
		return "cadastros";

	}

	@GetMapping("/cadastros/cadastro")
	public String cadastrarViaForm(Model model) {
		Cadastro cadastro = new Cadastro();
		model.addAttribute("cadastro", cadastro);
		return "cadastrar";
	}

	@PostMapping("/cadastros")
	public String salvarCadastro(@ModelAttribute("cadastro") Cadastro cadastro) {
		cadastroService.salvarCadastro(cadastro);
		return "redirect:/cadastros";

	}

	/*
	 * @PostMapping("/cadastros")
	 * public String salvar(@Valid @ModelAttribute("cadastro")Cadastro cadastro,
	 * BindingResult result, RedirectAttributes attr) {
	 * 
	 * if (result.hasErrors()) {
	 * return "cadastrar";
	 * }
	 * 
	 * cadastroService.salvarCadastro(cadastro);
	 * attr.addFlashAttribute("success", "Cadastro inserido com sucesso.");
	 * return "redirect:/cadastrar";
	 * 
	 * }
	 */

	@GetMapping("/cadastros/editar/{id}")
	public String editarViaForm(@PathVariable Long id, Model model) {
		model.addAttribute("cadastro", cadastroService.getCadastroById(id));
		return "atualizar";
	}

	/*
	 * @PostMapping("/editar/{id}")
	 * public String editarViaForm2(@Valid Cadastro cadastro, BindingResult result,
	 * RedirectAttributes attr) {
	 * 
	 * if (result.hasErrors()) {
	 * return "atualizar";
	 * }
	 * 
	 * cadastroService.atualizarCadastro(cadastro);
	 * attr.addFlashAttribute("success", "Cadastro atualizado com sucesso.");
	 * return "redirect:/cadastros";
	 * }
	 */

	@PostMapping("cadastros/{id}")
	public String atualizarCadastro(@PathVariable Long id, @ModelAttribute("cadastro") Cadastro cadastro, Model model) {
		Cadastro existenciaDeCadastro = cadastroService.getCadastroById(id);
		existenciaDeCadastro.setId(id);
		existenciaDeCadastro.setNome(cadastro.getNome());
		existenciaDeCadastro.setEndereco(cadastro.getEndereco());
		existenciaDeCadastro.setCep(cadastro.getCep());
		existenciaDeCadastro.setCpf(cadastro.getCpf());
		existenciaDeCadastro.setCelular1(cadastro.getCelular1());
		existenciaDeCadastro.setEmail(cadastro.getEmail());
		existenciaDeCadastro.setSenha(cadastro.getSenha());
		existenciaDeCadastro.setNecessidade(cadastro.getNecessidade());

		cadastroService.atualizarCadastro(existenciaDeCadastro);
		return "redirect:/cadastros";

	}

	@GetMapping("/cadastros/excluir/{id}")
	public String excluirCadastro(@PathVariable Long id) {
		cadastroService.excluirCadastroById(id);
		return "redirect:/cadastros";
	}

}
