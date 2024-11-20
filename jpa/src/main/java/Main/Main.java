package Main; // Esta classe pertence ao pacote Man

// Importação das classes e bibliotecas necessárias
import dao.ProdutoDAO;
import model.Produto;
import java.util.Scanner;

// Criação da classe Main
public class Main {
	public static void main(String[] args) {
		ProdutoDAO produtoDAO = new ProdutoDAO(); // Criação de um novo produto
		Scanner scanner = new Scanner(System.in); // Armazena os dados do novo produto
		
		String continuar = "Sim"; // Controla se o loop de criação de produto continuará ou não
		
		while(true) {
			try {
				// Exibição das opções do Usuário
				System.out.println("\n===== Menu Principal ======\n"); 
				System.out.println("1. Inserir Tênis");
				System.out.println("2. Atualizar Tênis");
				System.out.println("3. Deletar Tênis");
				System.out.println("4. Ler Registros de Tênis");
				System.out.println("0. Sair");
				System.out.println("------------------------------------------------");
				System.out.println("\nEscolha uma opção: ");
				
				int opcao = scanner.nextInt(); // Váriavel que armazenará o número digitado pelo Usuário
				scanner.nextLine(); // Limpa buffer
				
				// Inicialização do Switch de escolhas do Usuário
				switch(opcao) {
				case 1: // Caso o Usuário escolha a Opção 1 (Inserir Aluno)
				
				
		while (continuar.equalsIgnoreCase("Sim")) { // Enquanto a resposta para adição de outro produto for "Sim"
			//Solicitar dados do usuário
			Produto produto = new Produto(); // Cria um novo Tênis, preenchido com os dados que serão solicitados
			System.out.println("Digite o Nome do Tênis: "); // Solicita o nome do Tênis
			produto.setNome(scanner.nextLine()); // Armazena o nome do produto
			
			System.out.println("\nDigite o Preço do Tênis: "); // Solicita o nome do Tênis
			produto.setPreco(scanner.nextDouble()); // Armazena o preço do Tênis
			scanner.nextLine(); // Limpa buffer
			
			// Cria o Tênis
			produtoDAO.criar(produto); // Realiza a inserção do novo produto no banco de dados
			
			System.out.println("\nDeseja adicionar outro Tênis? (Sim/Não): "); // Pergunta ao usuário se ele deseja adicionar outro Tênis
			continuar = scanner.nextLine(); // Recebe a resposta do usuário. 
			
			// Se o usuário disser "sim", o processo de criação será feito novamente para a inserção do novo produto
			// Se o usuário disser "não", as operações pararão
		} break; // Para a operação
		
				case 2: // Atualizar Produto
				    System.out.println("Informe o ID do Tênis que deseja atualizar: "); // Solicita o ID do Tênis
					long IdAtualizacao = scanner.nextLong(); // Armazena o ID
					scanner.nextLine(); // Limpa o buffer
					
					// Método para ler os dados do Tênis selecionado
					Produto produtoAtualizar = produtoDAO.ler(IdAtualizacao);
					if (produtoAtualizar != null) {
						System.out.println("Produto encontrado: "+produtoAtualizar.getNome() + " - " + produtoAtualizar.getPreco()); // Puxa os dados do Tênis selecionado
						
					System.out.println("Informe o novo Nome do Tênis: "); // Solicita o novo Nome do Tênis
						String novoNome = scanner.nextLine(); // Armazena o novo Nome
						if (!novoNome.isEmpty()) {
							produtoAtualizar.setNome(novoNome); // Atualiza o Nome 
						}
						
					System.out.println("Informe o novo Preço do Tênis: "); // Solicita o novo Preço do Tênis
						String novoPrecoStr = scanner.nextLine(); // Armazena o novo Preço (Str pelo fato do preço ser recebido como uma String)
						if (!novoPrecoStr.isEmpty()) {
							Double novoPreco = Double.parseDouble(novoPrecoStr); // Converte o Preço de String para Double
							produtoAtualizar.setPreco(novoPreco); // Atualiza o Preço
						}
						
						// Atualiza o Tênis
						produtoDAO.atualizar(produtoAtualizar); // Realiza as atualizações no banco de dados
						System.out.println("\nProduto atualizado com sucesso!"); // Informa que a atualização foi um sucesso
						
						}
					break; // Para a operação
					
				case 3: // Remover Produto
					System.out.println("Informe o ID do Tênis que deseja remover: "); // Solicita o ID do Tênis
					Long IdRemover = scanner.nextLong(); // Armazena o Id
					scanner.nextLine(); // Limpa o buffer
					
					// Método para ler os dados do Tênis selecionado
					Produto produtoRemover = produtoDAO.ler(IdRemover); 
					if (produtoRemover != null) {
						System.out.println("Produto encontrado: "+produtoRemover.getNome() + " - " + produtoRemover.getPreco()); // Puxa os dados do Tênis selecionado	
						
						// Remove o Tênis
						produtoDAO.excluir(IdRemover); // Realiza a remoção no banco de dados
						System.out.println("\nProduto removido com sucesso!"); // Informa que a remoção foi um sucesso
					}
					break; // Para a operação
					
				case 4:
					// Lista todos os Tênis
					System.out.println("Lista de produtos no Banco de Dados:\n"); 
					produtoDAO.listarTodos().forEach(p -> System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getPreco())); // Trará uma lista de todos os Tênis, com nome e preço 
					break;
					
				case 0: // Sair do sistema
					System.out.println("Saindo..."); // Mensagem que informa a saída
					scanner.close();
					return; // Encerra o programa
					
				default:
                   System.out.println("Opção inválida. Tente novamente."); // Informa que a opção digitada não existe e solicita uma nova
				}
				
			} catch (Exception e) {
	                System.out.println("Erro: " + e.getMessage());
	                scanner.nextLine(); // Limpa o buffer em caso de erro
			
			}
		}
	}
}
