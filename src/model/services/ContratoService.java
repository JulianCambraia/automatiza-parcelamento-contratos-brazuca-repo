package model.services;

import java.util.Calendar;

import model.entities.Contrato;
import model.entities.ContratoParcela;

public class ContratoService {

	private ContratoParcela contratoParcela;
	private PagamentoService pagamentoService;

	public ContratoService(ContratoParcela contratoParcela, PagamentoService pagamentoService) {
		super();
		this.contratoParcela = contratoParcela;
		this.pagamentoService = pagamentoService;
	}

	public void gerarDataParcela(Contrato contrato, Integer mes) {
		Calendar cal = Calendar.getInstance();
		int qtde = contrato.getQuantidadeParcelas();
		Double valorPorParcela = contrato.getValorTotalContrato() / qtde;
		for (int i = 1; i <= qtde; i++) {
			Double valorParcela = pagamentoService.parcelamento(valorPorParcela, i);
			cal.setTime(contrato.getDataContrato());
			cal.add(Calendar.MONTH, 1);
			contrato.setDataContrato(cal.getTime());
			// LocalDate newDataContrato = LocalDate.now().plusMonths(i);

			contratoParcela = new ContratoParcela(valorParcela, contrato.getDataContrato());
			contrato.adicionarParcelasContrato(contratoParcela);

		}
	}
}
