package model; // Esta classe pertence ao pacote model

// Importação das classes e bibliotecas necessárias
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Marca esta classe como JPA

// Criação da classe Produto
public class Produto {
	@Id // Informa que o campo Id é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Informa que o Id é um campo Auto_Increment
	private Long id; // Cria o campo Id
	private String nome; // Cria o campo Nome
	private Double preco; // Cria o campo Preço
	
	// Getters e Setters
	
	// Getter para puxar o valor do Id
	public Long getId() {
		return id;
	}
	
	// Setter que define o valor do Id
	public void setId(Long id) {
		this.id = id;
	}
	
	// Getter para puxar o conteúdo do Nome
	public String getNome() {
		return nome;
	}
	
	// Setter que define o conteúdo do Nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter para puxar o valor do Preço
	public Double getPreco() {
		return preco;
	}
	
	// Setter que define o valor do Preço
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	}