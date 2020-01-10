package me.littlebit.chucknorrisfeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"me.littlebit.chucknorrisfeed.clients", "me.littlebit.chucknorrisfeed.controllers", "me.littlebit.chucknorrisfeed.repositories"})
public class ChucknorrisfeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisfeedApplication.class, args);
	}

}
