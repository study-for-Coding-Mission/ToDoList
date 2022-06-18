package org.prgms.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringTodolistApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTodolistApplication.class, args);
    }

}
