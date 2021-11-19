package br.com.generation.ExercicioCollection;

import java.util.ArrayList;

import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		String nome = null;
		String lote = null;
		int quantidade = 0;
		
Scanner read = new Scanner(System.in);
		
		ArrayList<Produto> produto = new ArrayList();
		
		System.out.println("Quantos produtos você quer inserir?");
		int quantProduto = read.nextInt();
		read.nextLine();
		
		for(int i = 0; i < quantProduto; i++) {
			System.out.println("Digite o nome do produto: ");
			nome = read.next();
			read.nextLine();
			System.out.println("Digite o lote do produto:");
			lote = read.next();
			read.nextLine();
			System.out.println("Digite a quantidade do produto:");
			quantidade = read.nextInt();
			
			produto.add(new Produto(nome, lote, quantidade));
		}
		
		for(Produto al : produto) {
		System.out.println(al);
		}
		
		System.out.println();
		
		produto.remove(0);
		
		System.out.println("Atualizando...");
		System.out.println();
		
		produto.add(new Produto("Xcaixa", "585", 3));
		
		for(Produto al : produto) {
			System.out.println(al);
		}
		
		read.close();
	}
}