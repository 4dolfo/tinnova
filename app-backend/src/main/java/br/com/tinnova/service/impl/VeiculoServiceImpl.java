package br.com.tinnova.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tinnova.bean.Veiculo;
import br.com.tinnova.repository.VeiculoRepository;
import br.com.tinnova.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService{
	
	
	@Autowired
	VeiculoRepository veiculoRepository;
	
	@Override
	public Veiculo salvar(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return veiculoRepository.save(veiculo);
	}

	@Override
	public List<Veiculo> getAll() {
		// TODO Auto-generated method stub
		return veiculoRepository.findAll();
	}

	@Override
	public Veiculo findByIdVeiculo(Long id) {
		// TODO Auto-generated method stub
		return veiculoRepository.findByIdVeiculo(id);
	}

	
}
