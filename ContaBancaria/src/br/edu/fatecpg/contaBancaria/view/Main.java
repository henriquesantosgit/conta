package br.edu.fatecpg.contaBancaria.view;

import java.util.Scanner;

import br.edu.fatecpg.contaBancaria.model.Conta;

public class Main {

	public static void main(String[] args) {
		String tit;
		int opt;
		 double sal = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("DIgite o titular da conta");
		tit = scan.nextLine();
		
		Conta contaPessoa = new Conta(tit,sal);
		System.out.println("1-Depositar 2-Sacar  3-Ver saldo");
		opt = scan.nextInt();
		switch(opt) {
		case 1:
			
		}
	}

}
