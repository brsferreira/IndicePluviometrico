package indicePluviometrico;

public class Aplicacao {

	public static void main(String[] args) {
		
		Pluviosidade p1 = new Pluviosidade(1000, 1);
		p1.Calculapluviosidade();
		
		
		//StringBuffer sb = new StringBuffer(); // thread-safe - use no contexto de concorr�ncia
				StringBuilder sb = new StringBuilder(); // n�o-thread-safe - mais r�pido
				
				sb.append("Bem vindo ao curso de Java. ");
				sb.append("Fique a vontade para tirar suas d�vidas. ");
				sb.append("Estamos aqui para te ajudar. ");
				
				System.out.println(sb.toString());
				
				sb.insert(26, " da AlgaWorks");
				
				System.out.println(sb);

	}//main -------------------------------------

}//class ----------------------------------------
