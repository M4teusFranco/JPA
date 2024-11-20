package dao; // Esta classe pertence ao pacote dao

// Importação das bibliotecas e classes necessárias
import model.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

// Criação da classe ProdutoDAO
public class ProdutoDAO {
	// Cria uma instância de EntityManager e armazena as configurações do banco de dados
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtoPU");
	
	// Método para Criar um registro
	public void criar(Produto produto) {
		EntityManager em = emf.createEntityManager(); // Cria uma instância de EntityManager
		em.getTransaction().begin(); // Inicia a manipulação dos registros
		em.persist(produto); // Mantém o objeto Produto no banco de dados
		em.getTransaction().commit(); // Salva o registro no banco de dados
		em.close(); // Fecha o EntityManager
	}
	
	// Método para Ler um registro
	public Produto ler(Long id) {
		EntityManager em = emf.createEntityManager(); // Cria uma instância de EntityManager
		Produto produto = em.find(Produto.class, id); // Procura o Produto no banco de dados
		em.close(); // Fecha o EntityManager
		return produto; // Retorna o Produto encontrado
	}
	
	// Método para Ler Todos os registros
	public List<Produto> listarTodos() {
		EntityManager em = emf.createEntityManager(); // Cria uma instância de EntityManager
		List<Produto> produtos = em.createQuery("FROM Produto", Produto.class).getResultList(); // Faz uma consulta para listar todos os Produtos 
		em.close(); // Fecha o EntityManager
		return produtos; // Retorna todos os registros de Produtos
	}
	
	// Método para Atualizar um registro
	public void atualizar(Produto produto) {
		EntityManager em = emf.createEntityManager(); // Cria uma instância de EntityManager
		em.getTransaction().begin(); // Inicia a manipulação dos registros
		em.merge(produto); // Atualiza o Produto no banco de dados
		em.getTransaction().commit(); // Confirma a atualização
		em.close(); // Fecha o EntityManager
	}
	
	// Método para Remover um registro
	public void excluir(Long id) {
		EntityManager em = emf.createEntityManager(); // Cria uma instância de EntityManager
		Produto produto = em.find(Produto.class, id);
		if (produto != null) { // Se o Produto não for nulo
			em.getTransaction().begin(); // Inicia a manipulação dos registros
			em.remove(produto); // Remove o Produto do banco de dados
			em.getTransaction().commit(); // Confirma a remoção
		}
		em.close(); // Fecha o EntityManager
	}
}
