package indicePluviometrico;

public class Aplicacao {

	public static void main(String[] args) {
		
		double indicePluviometrico = 1.00; //mm
		double areaTotal = 10.00; //m²
		int periodo = 2; //horas
		
		Pluviosidade p1 = new Pluviosidade(indicePluviometrico, areaTotal, periodo);
		p1.Calculapluviosidade();
		
		

	}//main

}//class
