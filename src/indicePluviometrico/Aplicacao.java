package indicePluviometrico;

public class Aplicacao {

	public static void main(String[] args) {
		
		Pluviosidade p1 = new Pluviosidade(1000, 1);
		p1.Calculapluviosidade();
		
		
		//StringBuffer sb = new StringBuffer(); // thread-safe - use no contexto de concorrência
				StringBuilder sb = new StringBuilder(); // não-thread-safe - mais rápido
				
				sb.append("Bem vindo ao curso de Java. ");
				sb.append("Fique a vontade para tirar suas dúvidas. ");
				sb.append("Estamos aqui para te ajudar. ");
				
				System.out.println(sb.toString());
				
				sb.insert(26, " da AlgaWorks");
				
				System.out.println(sb);

	}//main -------------------------------------

}//class ----------------------------------------
