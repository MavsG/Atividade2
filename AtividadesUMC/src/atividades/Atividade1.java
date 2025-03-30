package atividades;

import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        atividades.estoque estoque = new atividades.estoque();

		        while (true) {
		            System.out.println("\nEscolha uma opção:");
		            System.out.println("1. Registrar nova roupa");
		            System.out.println("2. Adicionar peças ao estoque");
		            System.out.println("3. Remover peças do estoque");
		            System.out.println("4. Exibir informações da roupa");
		            System.out.println("5. Sair");
		            int opcao = scanner.nextInt();
		            scanner.nextLine();

		            switch (opcao) {
		                case 1:
		                    System.out.print("Marca: ");
		                    String marca = scanner.nextLine();

		                    System.out.print("Tipo: ");
		                    String tipo = scanner.nextLine();

		                    System.out.print("Tamanho: ");
		                    String tamanho = scanner.nextLine();

		                    System.out.print("Quantidade inicial: ");
		                    int quantidade = scanner.nextInt();

		                    System.out.print("Valor unitário: ");
		                    double valor = scanner.nextDouble();
		                    scanner.nextLine(); 

		                    atividades.estoque novaRoupa = new atividades.estoque(marca, tipo, tamanho, quantidade, valor);
		                    estoque = novaRoupa;

		                    System.out.println("Roupa registrada com sucesso!");
		                    break;

		                case 2:
		                    System.out.print("Quantidade a adicionar: ");
		                    int adicionar = scanner.nextInt();
		                    estoque.qntEstoque(adicionar);
		                    System.out.println("Estoque atualizado com sucesso!");
		                    break;

		                case 3:
		                    System.out.print("Quantidade a remover: ");
		                    int remover = scanner.nextInt();
		                    estoque.decrementarEstoque(remover);
		                    System.out.println("Estoque atualizado com sucesso!");
		                    break;

		                case 4:
		                    estoque.exibirInformacoes();
		                    break;

		                case 5:
		                    System.out.println("Saindo...");
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		            }
		        }
		    }
		}

	
