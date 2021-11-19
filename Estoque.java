package br.com.generation.ExercicioCollection;

import java.util.ArrayList;

import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		
Scanner read = new Scanner(System.in);
		
		ArrayList<Produto> produto = new ArrayList();
		
		System.out.println("Quantos produtos você quer inserir?");
		int quantProduto = read.nextInt();
		read.nextLine();
		
		for(int i = 0; i < quantProduto; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = read.next();
			read.nextLine();
			System.out.println("Digite o lote do produto:");
			String lote = read.next();
			read.nextLine();
			System.out.println("Digite a quantidade do produto:");
			int quantidade = read.nextInt();
			
			produto.add(new Produto(nome, lote, quantidade));
		}
		
		for(Produto al : produto) {
		System.out.println(al);
		}
		
		read.close();
	}
}