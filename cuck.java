package henriqueemarcos;
import java.util.*;
public class decbin {

	
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
				if(tipcadastro==1) {}
				if(tipcadastro==2) {
				System.out.println("informe o nome do(a) cadastrado(a): ");
				  String nome = in.nextLine();
				  
				  System.out.println("informe o CPF/CNPJ do(a) cadastrado(a): ");
				  String cpfcnpj = in.nextLine();
				  
				  System.out.println("informe o endereço do(a) cadastrado(a): ");
				  String endereco = in.nextLine();
				  
				  System.out.println("informe o contato do(a) cadastrado(a): ");
				  String contato = in.nextLine();
					System.out.println(
							"1 - Funcionário\n"
							+ "2 - Cliente  \n"
							+ "3 - Transportador\n"
							
								);	
				int tcad = in.nextInt();
				in.nextLine();
				if (tcad == 1) {
					
					System.out.print("informe o salário do(a) cadastrado(a): ");
					  double salario = in.nextDouble();
					  in.nextLine();
					  System.out.print("informe a conta do(a) cadastrado(a): ");
					  String conta = in.nextLine();
					 
					
				}
				if (tcad == 2) {}	
				if (tcad == 3) {
					System.out.print("informe a taxa (por tonelada) do transportador: ");
					  double taxa = in.nextDouble();
					  in.nextLine();
					  System.out.print("informe o tipo do transporte: ");
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
		double valpagamento = in.nextDouble();
		
		
	}
			else {  // exception("comando inválido")  }
		
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
			}}}
	
	

