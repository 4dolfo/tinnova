package br.com.tinnova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.bean.Veiculo;
import br.com.tinnova.service.VeiculoService;

@RestController
public class VeiculoController {
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping("/test")
	public String test() {
		return "Oi";
	}
	
	@PostMapping("/veiculos")
	public Veiculo salvar( @RequestBody Veiculo veiculo) {
		Veiculo response = this.veiculoService.salvar(veiculo);
		return response;
	}
	@GetMapping("/veiculos")
	public List<Veiculo> getAll() {
		List<Veiculo> response = this.veiculoService.getAll();
		return response;
	}
	@GetMapping("/veiculos/{id}")
	public Veiculo getById(@PathVariable(value = "id") Long veiculoId) {
		Veiculo response = this.veiculoService.findByIdVeiculo(veiculoId);
		return response;
	}
	
}
