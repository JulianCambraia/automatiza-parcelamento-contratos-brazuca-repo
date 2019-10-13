package model.services;

public interface PagamentoService {
	public Double parcelamento(Double valorParcela, Integer mes);
	public Double taxa(double valorParcela);
}
