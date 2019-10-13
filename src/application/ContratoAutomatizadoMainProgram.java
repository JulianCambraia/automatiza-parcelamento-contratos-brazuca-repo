package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.ContratoParcela;
import model.services.ContratoService;
import model.services.PayPalService;

public class ContratoAutomatizadoMainProgram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do Contrato: ");
		System.out.print("Número:");
		String pNumeroContrato = sc.next();
		System.out.print("Data (dd/MM/yyyy):");
		Date pDataContrato = sdf.parse(sc.next());
		System.out.print("Valor:");
		Double pValorContrato = sc.nextDouble();
		System.out.print("Entre com o número de parcelas:");
		Integer pNumeroParcelas = sc.nextInt();
		System.out.println();
		Contrato contrato = new Contrato(pNumeroContrato, pDataContrato, pValorContrato, pNumeroParcelas);

		ContratoService service = new ContratoService(new ContratoParcela(pValorContrato, pDataContrato),
				new PayPalService());
		
		service.gerarDataParcela(contrato, pNumeroParcelas);

		System.out.println("Parcelamento do Contrato: (já inclusa as taxas PayPal Online (1% a.m e 2% por parcela paga)) ");
		contrato.getContratoParcelas().forEach(p -> {
			System.out.println(sdf.format(p.getDataParcela()) + " - " + String.format("%.2f",p.getValorParcela()));
		});

		sc.close();

	}

}
