package com.devsuperior.aula01;

import com.devsuperior.aula01.entities.Order;
import com.devsuperior.aula01.services.OrderService;
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

		System.out.println("Qual codigo do seu pedido? ");
		int code = sc.nextInt();
		System.out.println("Qual valor basico do seu pedido? ");
		double basic = sc.nextDouble();
		System.out.println("Qual porcentagem de desconto do seu pedido? ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido código %d\n", order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));





	}
}
