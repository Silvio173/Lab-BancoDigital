import java.io.Serializable;

public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String nome; 
	private Integer idade;
	
	public Cliente(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
 	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome + ", idade=" + idade;
	} 
	
}
