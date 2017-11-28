package main;

import java.util.*;
import exceptions.*;
import cadastramento.*;
import classes.Pessoas;
import interfaces.*;
import negocio.*;
import repositorio.*;
import repositorio.*;
public class main{

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		boolean a;int ID, n = 0;
		//Nessa parte do codigo, descobrimos exatamente o que o consumidor quer:
		while (0<1) {
			System.out.println("1 - Funcionario\n2 - Cliente\n3 - Transporte\n4 - Receita\n5 - Despesa\n6 - Roupa\n7 - Calcado");
			ID = in.nextInt();
			in.nextLine();
			if (ID >= 1 && ID <= 7) {
				System.out.println("1 - Inserir\n2 - Procurar\n3 - Atualizar\n4 - Remover");
				n = in.nextInt();
				in.nextLine();
				if (n < 1 || n > 4) {
					throw new ComandoInvalidoException();
				}	
			}	
			switch (ID) {
				case 1:
					if (n == 1) {
						System.out.println("Informe o nome do(a) funcionario(a):");
						String nome = in.nextLine();
						System.out.println("Informe o CPF do(a) funcionario(a):");
						String cpfcnpj = in.nextLine();
						//validarCPF
						 a = repositorioPessoasArray.procurarPessoa(cpfcnpj);
						 if(a==true) {
							 throw new CPFJaCadastradoException();
						 }
						System.out.println("Informe o endereco do(a) funcionario(a):");
						String endereco = in.nextLine();
						System.out.println("Informe o salario do(a) funcionario(a):");
						String salario = in.nextLine();
						System.out.println("Informe o contato do(a) funcionario(a):");
						String contato = in.nextLine();
						System.out.println("Informe a conta do(a) funcionario(a):");
						String conta = in.nextLine();
						//inserirPessoas
						CadastroPessoas.novoFuncionario(nome, cpfcnpj, endereco, contato, salario, conta, "", "", "");
					} 
					 else if  (n == 2) {
						System.out.println("Informe o CPF do(a) funcionario(a):");
						String cpfcnpj = in.nextLine();
						System.out.println("Informe a conta do(a) funcionario(a):");
						String conta = in.nextLine();
						//atualizarPessoas
					} else if (n == 4) {
						System.out.println("Informe o CPF do(a) funcionario(a):");
						String cpfcnpj = in.nextLine();
						//removerPessoas
					}	
					break;
				case 2:	
					
					if (n == 1) {
						System.out.println("Informe o nome do(a) cliente:");
						String nome = in.nextLine();
						System.out.println("Informe o CPF do(a) cliente");
						String cpfcnpj = in.nextLine();
						 a = repositorioPessoasArray.procurarPessoa(cpfcnpj);
						 if(a=false) {throw new CPFJaCadastradoException();}
						System.out.println("Informe o endereco do(a) cliente:");
						String endereco = in.nextLine();
						System.out.println("Informe o contato do(a) cliente:");
						String contato = in.nextLine();
						System.out.println("Informe o cartao do(a) cliente:");
						String cartaocredito = in.nextLine();
						//inserirPessoas
						CadastroPessoas.novoCliente(nome, cpfcnpj, endereco, contato, "", "", cartaocredito, "", "");
					} else if (n == 2) {
						System.out.println("Informe o CPF do(a) cliente:");
						String cpfcnpj = in.nextLine();
						 if(a=true) {System.out.println("Situação Regular");}
						 else {System.out.println("CPF não cadastrado");}
						//procurarPessoas(retorna nome e conta);
					} else if (n == 3) {
						System.out.println("Informe o CPF do(a) cliente:");
						String cpfcnpj = in.nextLine();
						System.out.println("Informe o cartao do(a) cliente:");
						String cartaocredito = in.nextLine();
						repositorioPessoasArray.atualizarPessoa(cpfcnpj,cartaocredito);
						//atualizarPessoas
					} else if (n == 4) {
						System.out.println("Informe o CPF do(a) cliente:");
						String cpfcnpj = in.nextLine();
						repositorioPessoasArray.removerPessoa(cpfcnpj);
						//removerPessoas
					}	
					break;
				case 3:
					if (n == 1) {
						System.out.println("Informe o nome do transporte:");
						String nome = in.nextLine();
						System.out.println("Informe o CNPJ do transporte:");
						String cpfcnpj = in.nextLine();
						 a = repositorioPessoasArray.procurarPessoa(cpfcnpj);
						 if(a=true) {throw new CPFJaCadastradoException();}
						//validarCNPJ
						System.out.println("Informe o endereco do transporte:");
						String endereco = in.nextLine();
						System.out.println("Informe o contato do transporte:");
						String contato = in.nextLine();
						System.out.println("Informe a taxa do transporte:");
						String conta = in.nextLine();
						System.out.println("Informe a tipo do transporte:");
						String tipo = in.nextLine();
						//inserirPessoas
						CadastroPessoas.Transportador(nome, cpfcnpj, endereco, contato, "", "", "", tipo);
					} else if (n == 2) {
						System.out.println("Informe o CNPJ do transporte:");
						String cpfcnpj = in.nextLine();
						//procurarPessoas(retorna tipo e taxa);
					} else if  (n == 3) {
						System.out.println("Informe o CNPJ do transporte:");
						String cpfcnpj = in.nextLine();
						System.out.println("Informe a taxa do transporte:");
						String taxa = in.nextLine();
						repositorioPessoasArray.atualizarPessoa(cpfcnpj, taxa);
						//atualizarPessoas
					} else if (n == 4) {
						System.out.println("Informe o CNPJ do transporte");
						String cpfcnpj = in.nextLine();
						//removerPessoas
						repositorioPessoasArray.removerPessoa(cpfcnpj);
					}
					break;
				case 4:
					if (n == 1) {
						System.out.println("Informe o tipo de pagamento:");
						String tipof = in.nextLine();
						System.out.println("Informe o valor do pagamento:");
						String valor = in.nextLine();
						//inserirFinancas
						CadastroFinancas.novoLucro(tipof, valor, 666-6, "");
					} else if (n == 2) {
						System.out.println("Informe o tipo de pagamento:");
						String tipof = in.nextLine();
						//procurarFinancas(
						CadastroFinancas.procurarLucro(tipof);
						//(retorna a soma de todas as receitas daquele tipo);
					} else if (n == 3) {
						throw new ComandoInvalidoException();
					} else if (n == 4) {
						throw new ComandoInvalidoException();
					}
					break;
				case 5:
					if (n == 1) {
						System.out.println("Informe o tipo de pagamento:");
						String tipof = in.nextLine();
						System.out.println("Informe o valor do pagamento:");
						String valor = in.nextLine();
						System.out.println("Informe a conta do destinatario:");
						String contadestinatario = in.nextLine();
						//inserirFinancas
						CadastroFinancas.novoPagamento(tipof, valor, "", contadestinatario);
					} else if (n == 2) {
						System.out.println("Informe a conta do destinatario:");
						String contadestinatario = in.nextLine();
						//procurarFinancas
						CadastroFinancas.procurarPagamento(contadestinatario);
						//(retorna a soma de todas as despesas pagas para aquela conta);
					} else if (n == 3) {
						throw new ComandoInvalidoException();
					} else if (n == 4) {
						throw new ComandoInvalidoException();
					}
					break;
				case 6:
					if (n == 1) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe o preco do produto:");
						String preco = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe o time do produto:");
						String time = in.nextLine();
						//inserirProdutos
						CadastroProdutos.novoRoupa(nomep, preco, marca, tamanho, "", time);
					} else if (n == 2) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
							System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe o time do produto:");
						String time = in.nextLine();
						//procurarProdutos
						CadastroProdutos.procurarRoupa(nomep, marca, tamanho, "", time);
					} else if (n == 3) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe o time do produto:");
						String time = in.nextLine();
						System.out.println("Informe o novo preco do produto:");
						String preco = in.nextLine();
						//atualizarProdutos
						CadastroProdutos.atualizarRoupa(nomep, marca, tamanho, "", time, preco);
					} else if (n == 4) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe o preco do produto:");
						String preco = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe o time do produto:");
						String time = in.nextLine();
						//removerProdutos(VENDA);
						CadastroProdutos.removerRoupa(nomep, preco, marca, tamanho, "", time);
					}
					break;
				case 7:
					if (n == 1) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe o preco do produto:");
						String preco = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe a cor do produto:");
						String cor = in.nextLine();
						//inserirProdutos
						CadastroProdutos.novoCalcado(nomep, preco, marca, tamanho, cor, "");
					} else if (n == 2) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe a cor do produto:");
						String cor = in.nextLine();
						//procurarProdutos
						CadastroProdutos.procurarCalcado(nomep, marca, tamanho, cor, "");
					} else if (n == 3) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe a cor do produto:");
						String cor = in.nextLine();
						System.out.println("Informe o novo preco do produto:");
						String preco = in.nextLine();
						//atualizarProdutos
						CadastroProdutos.atualizarCalcado(nomep, marca, tamanho, cor, "", preco);
					} else if (n == 4) {
						System.out.println("Informe o nome do produto:");
						String nomep = in.nextLine();
						System.out.println("Informe o preco do produto:");
						String preco = in.nextLine();
						System.out.println("Informe a marca do produto:");
						String marca = in.nextLine();
						System.out.println("Informe o tamanho do produto:");
						String tamanho = in.nextLine();
						System.out.println("Informe a cor do produto:");
						String cor = in.nextLine();
						//removerProdutos(VENDA);
						CadastroProdutos.removerCalcado(nomep, preco, marca, tamanho, cor, "");
					}
					break;
				default:
					throw new ComandoInvalidoException();
					//break;
			}
		}
		//System.out.println("Para sua seguranca, nosso sistema salva as informacoes em arrays e listas ordenadas, um sera backup do outro.");
	}
}	