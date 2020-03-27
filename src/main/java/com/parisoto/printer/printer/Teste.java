package com.parisoto.printer.printer;

import org.springframework.boot.SpringApplication;

public class Teste {

	public static void main(String[] args) {
		System.out.println("teste");
		Impressora impressora = new Impressora();
		impressora.imprime("texto");
	}
}
