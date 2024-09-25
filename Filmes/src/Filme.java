
/*Uma classe Filme com seus atributos privados, para serem tratados apenas dentro da classe.*/
public class Filme {
	private String titulo;
	private int duracao;
	private String genero;
	
	
	//Construtor vazio para iniciar sem argumentos que serão atribuídos por setters.
	public Filme() {
	}
	
	//Construtor que recebe os valores dos setters.
	public Filme(String titulo, int duracao, String genero) {
		setTitulo(titulo);
		setDuracao(duracao);  
		setGenero(genero);
	}
	
	/*Setter que recebe o título e verifica se a String não está vazia, caso esteja retorna a mensagem de erro.*/
	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("O título não pode estar vazio.");
		}
		//Caso esteja tudo certo atribui o valor a String titulo dessa classe.
		this.titulo = titulo;
	}
	
	
	/*Setter de recebe o valor da duração e verifica se não é menor ou igual a 0.
	 * Caso seja retorna a mensagem de erro.*/
	public void setDuracao(int duracao) {
		if (duracao <= 0) {
			throw new IllegalArgumentException("A duração deve ser maior que zero");
		}
		//Caso esteja tudo certo atribui o valor ao int duracao dessa classe.
		this.duracao = duracao;
	}
	
	/*Setter que recebe o valor do atributo gênero e verifica na condição if se o gênero informado
	 * é diferente, ignorando letras maiúsculas, dos aceitos pela classe.*/
	public void setGenero(String genero) {
		if (!genero.equalsIgnoreCase("Romance") &&
            !genero.equalsIgnoreCase("Terror") &&
            !genero.equalsIgnoreCase("Comédia")) {
			//Caso seja inválido retornar a mensagem de erro.
			throw new IllegalArgumentException("O gênero deve ser Romance, Terror ou Comédia.");
		}
		//Caso seja válido atribui o valor a String genero dessa classe.
		this.genero = genero;
	}
	
	
	/*Getters para pegar os valores dos atributos após passarem pelos métodos de verificação*/
	public String getTitulo() {
		return
				titulo;
	}
	
	public int getDuracao() {
		return
				duracao;
	}
	
	public String getGenero() {
		return
				genero;
	}
	
	/*Método com a String que tem a formatação da descrição do filme para ser exposta no terminal. */
	public String descricaoFilme() {
		return
				"Filme: \n" +
				"  Titulo: " + this.titulo + "\n" +
				"  Duração: " + this.duracao + "\n" +
				"  Gênero: " + this.genero + "\n";
	}	
	
}
