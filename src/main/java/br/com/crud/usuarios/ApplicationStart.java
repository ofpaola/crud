package br.com.crud.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.crud.usuarios")
public class ApplicationStart {
    public static void main(final String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
