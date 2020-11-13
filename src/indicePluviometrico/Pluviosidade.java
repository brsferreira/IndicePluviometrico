package indicePluviometrico;

import java.util.Locale;

/*O que � (significado)
Pluviosidade � o volume (quantidade) de chuvas, que ocorre numa determinada �rea (cidade, bairro ou regi�o, por exemplo) num determinado per�odo de tempo (dia, m�s ou ano).
A pluviosidade � um componente muito importante na composi��o do clima de uma regi�o. Ela tem grande influ�ncia nas temperaturas e �ndices de umidade do ar das regi�es.
Medi��o (�ndice pluviom�trico)
O �ndice Pluviom�trico � uma medi��o da quantidade de chuvas numa regi�o num determinado per�odo de tempo. Esse �ndice � determinado pelo Sistema Internacional de Unidade. 
Neste sistema, 1 mil�metro equivale a um litro de �gua de chuva por metro quadrado.
Esse �ndice � calculado em mil�metros (mm). Por exemplo: o �ndice pluviom�trico anual da cidade de S�o Paulo � de 1.440 mm.
O �ndice pluviom�trico (pluviosidade de uma �rea) � calculado com um instrumento de medi��o meteorol�gica chamado de pluvi�metro.

FATOR DE CONVERSAO: 1m� = 1000L, 1dm� = 1L, 1cm� (l�-se um cent�metro c�bico) = 1 mililitro (ml) 

1mm = 1L por m�

*/

public class Pluviosidade {

	private double indice; // altura em milimetros no medidor.
	private double areaTotal;
	private double volume;
	private int periodo; // horas

	// Construtor -------------------------------

	public Pluviosidade(double indice, double areaTotal, int periodo) {
		super();
		this.indice = indice;
		this.areaTotal = areaTotal;
		this.periodo = periodo;
	}

	// Acessores --------------------------------
	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public void Calculapluviosidade() {

		Locale.setDefault(Locale.US);

		double indiceEmMetros = (indice) / 1000; // converte o indice para metros.
		double volumeMetroCubico = (indiceEmMetros) * (areaTotal); // calcula o volume em M�
		System.out.printf("%n%s%.2f%s%.3f%s%n", "IndicePluviometrico(mm): ", indice, " mm = ", indiceEmMetros,
				" m");

		double volumeLitros = (volumeMetroCubico) * 1000;
		System.out.printf("%n%s%.2f%s%n", "Volume em litros: ", volumeLitros, " litros por m�");

		// Total de litros recebidos na �rea
		double volumeTotal = volumeLitros * areaTotal * periodo;
		System.out.printf("%n%s%.2f%s%d%s%n", "Volume Total na area = ", volumeTotal, " litros durante o periodo de ",
				periodo, " h");
	}

}// class ----------------------------------------
