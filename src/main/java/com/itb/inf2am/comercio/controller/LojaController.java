package com.itb.inf2am.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

import com.itb.inf2am.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(10l);
		p1.setNome("Máquina de Lavar Brastemp 15l");
		p1.setDescricao("Maquina de Lavar Brastemp 15l com painel digital");
		p1.setCodigoBarras("FHDIUVNPOVMHFDGHL54643214");
		p1.setPreco(64255.158);
		p1.setCodStatus(false);
		
		Produto p2 = new Produto();
		
		p2.setId(10l);
		p2.setNome("Micro-ondas Eletrolux");
		p2.setDescricao("Micro-ondas Eletrolux 30l auto-limpante");
		p2.setCodigoBarras("FHTTJ65RHSJDYT544WTY54W");
		p2.setPreco(5620.20);
		p2.setCodStatus(true);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
	}
	
	@GetMapping("/novo-produto")
	public String novoProduto() {
		return "novo-prod";
	}

}
