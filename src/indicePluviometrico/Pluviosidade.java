package indicePluviometrico;

/*O que é (significado)
Pluviosidade é o volume (quantidade) de chuvas, que ocorre numa determinada área (cidade, bairro ou região, por exemplo) num determinado período de tempo (dia, mês ou ano).
A pluviosidade é um componente muito importante na composição do clima de uma região. Ela tem grande influência nas temperaturas e índices de umidade do ar das regiões.
Medição (índice pluviométrico)
O Índice Pluviométrico é uma medição da quantidade de chuvas numa região num determinado período de tempo. Esse índice é determinado pelo Sistema Internacional de Unidade. 
Neste sistema, 1 milímetro equivale a um litro de água de chuva por metro quadrado.
Esse índice é calculado em milímetros (mm). Por exemplo: o índice pluviométrico anual da cidade de São Paulo é de 1.440 mm.
O índice pluviométrico (pluviosidade de uma área) é calculado com um instrumento de medição meteorológica chamado de pluviômetro.

FATOR DE CONVERSAO: 1m³ = 1000L, 1dm³ = 1L, 1cm³ (lê-se um centímetro cúbico) = 1 mililitro (ml) 

1mmm = 1L por m²

*/

public class Pluviosidade {
	
	private double indice; //altura em milimetros no medidor.
	private double areaTotal;
	private double volume;
	private int periodo;
	
	// Construtor -------------------------------
	
	public Pluviosidade(double indice, double areaTotal) {
		super();
		this.indice = indice;
		this.areaTotal = areaTotal;
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
		
		double indiceEmMetros = (this.indice)/1000; //converte o indice para metros.
		double volumeMetroCubico = (indiceEmMetros)*(this.areaTotal); //calcula o volume em M³
		System.out.printf("%n%s%.3f%s%n", "Volume em metros cúbicos: ", volumeMetroCubico, " m³");
		
		double volumeLitros = (volumeMetroCubico)*1000;
		System.out.printf("%n%s%.2f%s%n", "Volume em litros: ", volumeLitros, " litros por m²");
	}
	
	

}//class ----------------------------------------










