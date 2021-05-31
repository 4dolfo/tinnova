package br.com.tinnova.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tinnova.bean.Veiculo;

public interface VeiculoService {
	public Veiculo salvar(Veiculo veiculo);
	public List<Veiculo> getAll();
	public Veiculo findByIdVeiculo(Long id);
}
