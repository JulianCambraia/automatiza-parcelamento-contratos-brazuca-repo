package model.entities;

import java.util.Date;

public class ContratoParcela {
	Double valorParcela;
	Date dataParcela;

	public ContratoParcela() {
		super();
	}

	public ContratoParcela(Double valorParcela, Date dataParcela) {
		super();
		this.valorParcela = valorParcela;
		this.dataParcela = dataParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

}
