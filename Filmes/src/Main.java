
public class Main {

	public static void main(String[] args) {
		try {
			/*Utilizando o try catch verifica se os valores dos atributos são válidos para 
			 * serem utilizados na classe Filme e já retorna a mensagem de cada filme, podendo ser a descrição
			 * ou a mensagem de erro no catch.*/
			Filme filme1 = new Filme("O Silêncio dos Inocentes", 118, "Terror");
			System.out.println(filme1.descricaoFilme());
			
			Filme filme2 = new Filme("Grande Amor", 125, "Romance");
			System.out.println(filme2.descricaoFilme());
			
			Filme filme3 = new Filme("Star Wars: A Vingança dos Sith", 140, "Aventura");
			System.out.println(filme3.descricaoFilme());

		} catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
		 } 
		
	}

}
