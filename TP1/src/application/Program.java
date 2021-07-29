package application;
import java.util.Scanner;

import entities.Util;
import entities.Clientes;
import entities.Estoque;

public class Program {
	
	public static void buscaVet(Clientes[] vet, String nome, int posicao, Util ferramenta) {
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNome().intern() == nome.intern()) {
				ferramenta.setAux(i);
				
				break;
			}
			
			if(i == posicao-1) {
				ferramenta.setAux(51);
				break;
			}
		}
	}
	public static void buscaVet1(Estoque[] vet, String nome, int posicao, Util ferramenta) {
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNome().intern() == nome.intern()) {
				ferramenta.setIndiceProduto(i);
				
				break;
			}
			
			if(i == posicao-1) {
				ferramenta.setIndiceProduto(51);
				break;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Util ferramenta = new Util(51, 51); 
		
		Clientes[] vetClientes = new Clientes[50];
		vetClientes[0] = new Clientes("Ana Clara", "Taguatinga Sul", "12345678");
		vetClientes[1] = new Clientes("Fernando Caldas", "Vicente Pires", "23215598");
		vetClientes[2] = new Clientes("Jeanne Cardoso", "Aguas Claras", "33239098");
		vetClientes[3] = new Clientes("Flavio Gomes", "Núcleo Bandeirante", "98765432");
		vetClientes[4] = new Clientes("Paula Ferreira", "Guara 2", "90908765");
		vetClientes[5] = new Clientes("Marcos Paulo", "Vila Planalto", "40028922");
		vetClientes[6] = new Clientes("Carla Maia", "Asa Norte", "98892334");
		vetClientes[7] = new Clientes("Daniel Luis", "Gama", "55554321");
		vetClientes[8] = new Clientes("Eduarda Silva", "Asa Sul", "67584920");
		vetClientes[9] = new Clientes("Felipe Santos", "Guara 1", "12344321");
		int posicao = 10;
		
		Estoque[] vetProdutos = new Estoque[50];
		vetProdutos[0] = new Estoque("açucar", "5kg - açucar", 19.39, 10.0, 20);
		vetProdutos[1] = new Estoque("arroz", "5kg - grão", 39.90, 11.0, 20);
		vetProdutos[2] = new Estoque("batata", "1kg - legume", 4.60, 8.0, 20);
		vetProdutos[3] = new Estoque("cafe", "0,5kg - grão", 8.75, 12.0, 20);
		vetProdutos[4] = new Estoque("feijao", "1kg - grão", 6.99, 20.0, 20);
		vetProdutos[5] = new Estoque("gelatina", "1u - doce", 3.49, 15.0, 20);
		vetProdutos[6] = new Estoque("leite", "1l - laticinios", 4.10, 10.0, 20);
		vetProdutos[7] = new Estoque("macarrao", "1u - massa", 4.99, 24.0, 20);
		vetProdutos[8] = new Estoque("sal", "0,5kg - tempero", 4.99, 17.0, 20);
		vetProdutos[9] = new Estoque("tomate", "1kg - fruta", 5.90, 19.0, 20);
		int posicao1 = 10;
		
		
		
		
		int opcao = 0;
		do {
			System.out.println("Digite uma opção para prosseguir");
			System.out.println("1 - Cadastrar novo cliente");
			System.out.println("2 - Buscar por cliente");
			System.out.println("3 - Cadastrar de novo produto");
			System.out.println("4 - Buscar por produto");
			System.out.println("5 - Cadastro de venda");
			System.out.println("6 - Mostrar produtos em estoque");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Informe o numero de clientes a serem cadastrados: ");
				int nClientes = sc.nextInt();
				sc.nextLine();
				for (int  i=0; i<nClientes; i++) {
					
					System.out.print("Nome do novo Cliente: ");
					String nome = sc.nextLine();
					System.out.print("Endereço do Cliente: ");
					String endereco = sc.nextLine();
					System.out.print("Telefone do Cliente: ");
					String telefone = sc.nextLine();
					
					vetClientes[posicao] = new Clientes(nome, endereco, telefone);
					posicao+=1;
					System.out.println();
					System.out.println("Cliente: "+nome+" cadastrado com sucesso! ");
					System.out.println();
				}
				
				break;
			case 2:
				sc.nextLine();

				System.out.print("Digite o nome completo do cliente: ");
				String busca = sc.nextLine();
				busca = busca.toUpperCase();
			
				int aux;

				buscaVet(vetClientes, busca, posicao, ferramenta);
				aux = ferramenta.getAux();

				System.out.println();
				
				
				if (aux <51) {
					System.out.println("Nome: "+vetClientes[aux].getNome());
					System.out.println("Endereço: "+vetClientes[aux].getEndereco());
					System.out.println("Telefone: "+vetClientes[aux].getTelefone());
					
					System.out.print("Alterar dados do cliente (s/n)? ");
					char alterar = sc.next().charAt(0);
					sc.nextLine();
					System.out.println();
					if(alterar == 's') {
						System.out.print("Novo nome: ");
						String novoNome = sc.nextLine();
						System.out.print("Novo endereço: ");
						String novoEndereco = sc.nextLine();
						System.out.print("Novo Telefone: ");
						String novoTelefone = sc.nextLine();
						vetClientes[aux].setNome(novoNome.toUpperCase());
						vetClientes[aux].setEndereco(novoEndereco.toUpperCase());
						vetClientes[aux].setTelefone(novoTelefone);
						System.out.println();
						System.out.println("Cliente atualizado! ");
						System.out.println();
					}
				} else {
					System.out.println("Cliente não encontrado!");
					System.out.println();
				}
				aux=51;
				break;
			case 3:
				System.out.print("Informe o numero de produtos a serem cadastrados: ");
				int nProdutos = sc.nextInt();
				sc.nextLine();

				for (int  i=0; i<nProdutos; i++) {
					
					System.out.print("Nome do Produto: ");
					String nome = sc.nextLine();
					System.out.print("Descrição do produto: ");
					String descricao = sc.nextLine();
					System.out.print("Valor de compra: ");
					double valor = sc.nextDouble();
					System.out.print("Porcentagem de lucro: ");
					double porcentagem = sc.nextDouble();
					System.out.print("Quantidade em estoque: ");
					int quantidade = sc.nextInt();
					
					vetProdutos[posicao1] = new Estoque(nome, descricao, valor, porcentagem, quantidade);
					posicao1+=1;
					
					System.out.println("Produto cadastrado com sucesso: "+nome);
					System.out.println();
					sc.nextLine();
					
				}
			
				
				break;
			case 4:
				sc.nextLine();

				System.out.print("Digite o nome produto: ");
				String produto = sc.nextLine();
				produto = produto.toUpperCase();
			
				int aux1;

				buscaVet1(vetProdutos, produto, posicao1, ferramenta);
				aux1 = ferramenta.getIndiceProduto();
				
				System.out.println();
				
				
				if (aux1 <51) {
					System.out.println("Nome: "+vetProdutos[aux1].getNome());
					System.out.println("Descrição: "+vetProdutos[aux1].getDescricao());
					System.out.println("Valor: "+vetProdutos[aux1].getValor());
					System.out.println("Porcentagem de lucro: "+vetProdutos[aux1].getPorcentagemLucro());
					System.out.println("Quantidade em estoque: "+vetProdutos[aux1].getQuantidadeEstoque());
					
					System.out.println("Alterar dados do produto (s/n)? ");
					char alterar = sc.next().charAt(0);
					sc.nextLine();
					System.out.println();
					if(alterar == 's') {
						System.out.print("Novo nome: ");
						String novoNome = sc.nextLine();
						System.out.print("Nova descrição: ");
						String novoDescricao = sc.nextLine();
						System.out.print("Novo Valor: ");
						int novoValor = sc.nextInt();
						System.out.print("Nova porcentagem de lucro: ");
						double novaPorcentagem = sc.nextDouble();
						System.out.print("Nova quantidade em estoque: ");
						int novaQuantidade = sc.nextInt(); 
						vetProdutos[aux1].setNome(novoNome.toUpperCase());
						vetProdutos[aux1].setDescricao(novoDescricao);
						vetProdutos[aux1].setValor(novoValor);
						vetProdutos[aux1].setPorcentagemLucro(novaPorcentagem);
						vetProdutos[aux1].setQuantidadeEstoque(novaQuantidade);
						
						System.out.println();
					}
				} else {
					System.out.println("Produto não encontrado!");
					System.out.println();
				}
				

				break;
			case 5:
				System.out.println("Escolha o numero do cliente: ");
				for (int i=0; i<vetClientes.length; i++) {
					if(i == posicao) {
						break;
					}
					System.out.println(i+" - "+vetClientes[i].getNome());
				}
				System.out.print("Número: ");
				int cliente = sc.nextInt();
				
				System.out.println();
				System.out.print("Escolha qual produto e a quantidade comprada: ");
				for (int i=0; i<vetProdutos.length; i++) {
					if(i == posicao1) {
						break;
					}
					System.out.println(i+" - "+vetProdutos[i].getNome() + " - Estoque: "+vetProdutos[i].getQuantidadeEstoque());
				}
				System.out.println();
				System.out.print("Número do produto: ");
				int prod = sc.nextInt();
				
				System.out.println("Quantidade: ");
				int quantidade = sc.nextInt();
				
				vetProdutos[prod].setQuantidadeEstoque(quantidade);
				System.out.println();
				System.out.println("Venda cadastrada! ");
				System.out.println();
				
				break;
			case 6:
				System.out.println();
				System.out.println("Estoque :");
				for (int i=0; i<vetProdutos.length; i++) {
					if(i == posicao1) {
						break;
					}
					System.out.println(" - "+vetProdutos[i].getNome() + " - " + vetProdutos[i].getQuantidadeEstoque()+" Unidades");
				}
				System.out.println();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			
			}

		}while(opcao !=0);
		
		System.out.println("Programa encerrado!");
		
		
		sc.close();
	}
}
