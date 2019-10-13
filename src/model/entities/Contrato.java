package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private String numeroContrato;
	private Date dataContrato;
	private Double valorTotalContrato;
	private Integer quantidadeParcelas;
	private List<ContratoParcela> contratoParcelas = new ArrayList<>();

	public Contrato() {
		super();
	}

	public Contrato(String numeroContrato, Date dataContrato, Double valorTotalContrato, Integer quantidadeParcelas) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public List<ContratoParcela> getContratoParcelas() {
		return contratoParcelas;
	}

	
	public void adicionarParcelasContrato(ContratoParcela cp) {
		contratoParcelas.add(cp);
	}

}