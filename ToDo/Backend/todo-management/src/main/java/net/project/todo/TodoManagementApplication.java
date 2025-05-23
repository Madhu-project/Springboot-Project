package net.project.todo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoManagementApplication {

	@Bean
	public ModelMapper modalMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(TodoManagementApplication.class, args);
	}

}
