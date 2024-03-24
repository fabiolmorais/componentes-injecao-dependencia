package com.desafio.aula01;

import com.desafio.aula01.entities.Order;
import com.desafio.aula01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Aula01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Aula01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do pedido: ");
		int code = sc.nextInt();
		System.out.print("Digite o valor do produto: ");
		double basic = sc.nextDouble();
		System.out.print("Digite o percentual de disconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.printf("Pedido código %d%n", code);
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));


		sc.close();
	}
}
