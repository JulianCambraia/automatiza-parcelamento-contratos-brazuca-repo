package model.services;

public class PayPalService implements PagamentoService {

	@Override
	public Double parcelamento(Double valorParcela, Integer mes) {
		// TODO Auto-generated method stub
		valorParcela += valorParcela * 0.01 * mes;
		return taxa(valorParcela);
	}

	@Override
	public Double taxa(double quota) {
		// TODO Auto-generated method stub
		return quota+= quota * 0.02;
	}

}
