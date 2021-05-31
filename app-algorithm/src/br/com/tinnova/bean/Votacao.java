package br.com.tinnova.bean;

public class Votacao {
	private Long totalEleitores;
	private Long nuValidos;
	private Long nuBrancos;
	private Long nuNulos;
	
	
	public Votacao(Long totalEleitores, Long nuValidos, Long nuBrancos, Long nuNulos) {
		super();
		this.totalEleitores = totalEleitores;
		this.nuValidos = nuValidos;
		this.nuBrancos = nuBrancos;
		this.nuNulos = nuNulos;
	}
	
	public Double getPercentualValidos() {
		Double percentual = this.nuValidos/(double)this.totalEleitores;
		return percentual;
	}
	public Double getPercentualBrancos() {
		Double percentual = this.nuBrancos/(double)this.totalEleitores;
		return percentual;
	}
	
	public Double getPercentualNulos() {
		Double percentual = this.nuNulos/(double)this.totalEleitores;
		return percentual;
	}
	
	
	
	public Long getTotalEleitores() {
		return totalEleitores;
	}
	public void setTotalEleitores(Long totalEleitores) {
		this.totalEleitores = totalEleitores;
	}
	public Long getNuValidos() {
		return nuValidos;
	}
	public void setNuValidos(Long nuValidos) {
		this.nuValidos = nuValidos;
	}
	public Long getNuBrancos() {
		return nuBrancos;
	}
	public void setNuBrancos(Long nuBrancos) {
		this.nuBrancos = nuBrancos;
	}
	public Long getNuNulos() {
		return nuNulos;
	}
	public void setNuNulos(Long nuNulos) {
		this.nuNulos = nuNulos;
	}
	
}
