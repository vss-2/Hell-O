package main;
import java.util.*;
import fachada.Fachada;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println(
				"1 - Cadastro\n"
						+ "2 - Venda  \n"
						+ "3 - Pagamento \n"

				);	
		while(in.hasNext()){
			int z = in.nextInt();
			in.nextLine();

			if(z==1) {
				System.out.println(
						"1 - Produto	\n"
								+ "2 - Pessoa"		
						);

				int tipcadastro = in.nextInt();
				in.nextLine();
				if(tipcadastro==1) {

					System.out.println("Informe o nome: ");
					String nome = in.nextLine();
					System.out.println("Informe o preco: ");
					String preco = in.nextLine();
					System.out.println("Informe a marca: ");
					in.nextLine();
					String marca = in.nextLine();
					System.out.println("Informe a qualidade: ");
					String qualidade = in.nextLine();

					//fachada(nome, preco, marca, qualidade);


					System.out.printf("%n1 - Calcado%n2 - Roupa%n");
					String opcao = in.next();
					if (opcao.equals("1")) {
						System.out.println("Informe a cor");
						// Como cores nao podem ser descritas usando numeros, excluimos esses casos.
						String cor = in.next();
						if (cor.charAt(1) == 1 ||
								cor.charAt(1) == 2 ||	
								cor.charAt(1) == 3 ||
								cor.charAt(1) == 4 ||
								cor.charAt(1) == 5 ||
								cor.charAt(1) == 6 ||
								cor.charAt(1) == 7 ||
								cor.charAt(1) == 8 ||
								cor.charAt(1) == 9) {
							System.out.println("Cor invalida.");
						} else {
							System.out.printf("Procurando "+ nome + " da cor " + cor);
						}
						System.out.println("Informe o tamanho");
						String tamanhoC = in.next();
						//Como tamanhos de sapato nao podem ser diferente de numeros, nem colocamos 0 no comeco, excluimos esses casos.
						if (tamanhoC.charAt(1) != 1 ||
								tamanhoC.charAt(1) != 2 ||	
								tamanhoC.charAt(1) != 3 ||
								tamanhoC.charAt(1) != 4 ||
								tamanhoC.charAt(1) != 5 ||
								tamanhoC.charAt(1) != 6 ||
								tamanhoC.charAt(1) != 7 ||
								tamanhoC.charAt(1) != 8 ||
								tamanhoC.charAt(1) != 9){
							System.out.println("Procurando " + nome + "do tamanho " + tamanhoC);
							System.out.println("2 produtos encontrados: ");
							System.out.printf("%n" + nome + " chuteira " + tamanhoC);
							System.out.printf("%n" + nome + " chinelo " + tamanhoC);
							System.out.println("Deseja comprar algum? S/N");
							String compra = in.next();
							if (compra.equals("S")) {
								System.out.println("Voce sera redirecionado para o carrinho de compras");
								// chama o metodo compra
							} else if (compra.equals("N")){
								System.out.println("Deseja fazer outra busca por um novo programa? S/N");
								String novabusca = in.next();
								if (novabusca.equals("S")) {
									// chama o metodo de novo
								} else if (novabusca.equals("N")) {
									// nao faz nada
								} else {
									System.out.println("Resposta invalida");
									// throws respostainvalida;
								}
							} else {
								System.out.println("Resposta invalida");
								// throws respostainvalida;
							}

						} else {
							System.out.print("Tamanho invalido.");
						}
					} else if (opcao.equals("2")) {
						System.out.println("Informe o time: ");
						String time = in.nextLine();
						System.out.println("Informe a versao: ");
						String versao = in.nextLine();
						System.out.println("Informe o tamanho");
						String tamanhoR = in.next();
						System.out.printf("Procurando pelo roupa do" + time + "na versao" + versao + "do tamanho" + tamanhoR);
					} else {
						System.out.print("Opcao invalida.");
					}		
				}
				if(tipcadastro==2) {
					System.out.println("informe o nome do(a) cadastrado(a): ");
					String nome = in.nextLine();

					System.out.println("informe o CPF/CNPJ do(a) cadastrado(a): ");
					String cpfcnpj = in.nextLine();

					System.out.println("informe o endere�o do(a) cadastrado(a): ");
					String endereco = in.nextLine();

					System.out.println("informe o contato do(a) cadastrado(a): ");
					String contato = in.nextLine();
					System.out.println(
							"1 - Funcion�rio\n"
									+ "2 - Cliente  \n"
									+ "3 - Transportador\n"
							);	
					int tcad = in.nextInt();
					in.nextLine();

					//fachada(nome, cpfcnpj, endereco, contato);



					if (tcad == 1) {

						System.out.println("informe o sal�rio do(a) cadastrado(a): ");
						double salario = in.nextDouble();
						in.nextLine();
						System.out.println("informe a conta do(a) cadastrado(a): ");
						String conta = in.nextLine();


					}
					if (tcad == 2) {}	
					if (tcad == 3) {
						System.out.println("informe a taxa (por tonelada) do transportador: ");
						double taxa = in.nextDouble();
						in.nextLine();
						System.out.println("informe o tipo do transporte: ");
						String tipotra = in.nextLine();

					}
				}
			}
			else if(z==2) {
				//imprimir() // list print method (product list)
			}	

			else if(z==3) {

				System.out.println("Informe o tipo de pagamento: " );
				String tipopag = in.nextLine();
				System.out.println("Informe o valor do pagamento: " );
				String valpagamento = in.nextLine();

			}
			else {  // exception("comando inv�lido")  }

			}
		}		
	}

	public void inserirPessoa(String nome, String cpfcnpj, String endereco, String contato, String salario, String conta, String totalcompras, String taxa, String tipo){
	}
	public void inserirProduto(String preco, String qualidade, String marca, String cor, String tamanhoC, String time, String versao, String tamanhoR){
	}
	public void inserirFinancas(String tipopag, String valpagamento) {
	}
}

