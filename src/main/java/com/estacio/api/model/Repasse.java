package com.estacio.api.model;

public class Repasse {
	private String municipio;
	private String tipoRepasse;
	private Integer ano;
	private Integer mes;
	private Double valorRepasseNoMes;
	private Double valorRepasseAteMes;

	public Repasse() {
	}

	public Repasse(String municipio, String tipoRepasse, Integer ano, Integer mes, Double valorRepasseNoMes,
			Double valorRepasseAteMes) {
		super();
		this.municipio = municipio;
		this.tipoRepasse = tipoRepasse;
		this.ano = ano;
		this.mes = mes;
		this.valorRepasseNoMes = valorRepasseNoMes;
		this.valorRepasseAteMes = valorRepasseAteMes;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTipoRepasse() {
		return tipoRepasse;
	}

	public void setTipoRepasse(String tipoRepasse) {
		this.tipoRepasse = tipoRepasse;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Double getValorRepasseNoMes() {
		return valorRepasseNoMes;
	}

	public void setValorRepasseNoMes(Double valorRepasseNoMes) {
		this.valorRepasseNoMes = valorRepasseNoMes;
	}

	public Double getValorRepasseAteMes() {
		return valorRepasseAteMes;
	}

	public void setValorRepasseAteMes(Double valorRepasseAteMes) {
		this.valorRepasseAteMes = valorRepasseAteMes;
	}

}
