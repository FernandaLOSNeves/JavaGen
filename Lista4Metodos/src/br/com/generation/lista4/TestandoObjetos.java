package br.com.generation.lista4;

public class TestandoObjetos {
	
public static void main(String[] args) {
		
			Cliente cliente1 = new Cliente();
			
			cliente1.nome = "André";
			cliente1.idade = 25;
			cliente1.estado = "MG";
			cliente1.cidade = "Varginha";
			
			System.out.println("Nome do cliente: " + cliente1.nome);
			System.out.println("Idade: " + cliente1.idade);
			System.out.println("Estado (UF): " + cliente1.estado);
			System.out.println("Cidade: " + cliente1.cidade);
			
			
		}
}
	