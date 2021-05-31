package br.com.tinnova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.tinnova.bean.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

	 @Query(value = "SELECT l FROM Veiculo l WHERE l.id = :veiculoId")
	 Veiculo findByIdVeiculo(@Param("veiculoId") Long veiculoId);
}
