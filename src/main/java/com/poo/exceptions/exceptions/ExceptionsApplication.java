package com.poo.exceptions.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class ExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		menu();
		try {
			opcao = sc.nextInt();

			
		} catch (InputMismatchException e) {
			System.out.println("você não digitou um numero inteiro");
		}
		switch (opcao) {
			case 1:
	
				ExException.divisao();
	
				break;
	
			case 2:
				ExException.verlista();

				break;
	
			case 3:
				System.out.println("metodo 3");
				break;
			default:
			System.out.println(" sua opçao não é valida");
				break;
	
		}
	}
	
	public static void menu() {
		System.out.println("======menu======\n1-descobrir resultado de divisao\n2-ver lista\n3-exemplo");

	}
}
