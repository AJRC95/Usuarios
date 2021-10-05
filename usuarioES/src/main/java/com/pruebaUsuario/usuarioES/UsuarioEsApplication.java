package com.pruebaUsuario.usuarioES;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pruebaUsuario.usuarioES.model.Usuario;
import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;
import com.pruebaUsuario.usuarioES.service.UsuarioService;
import com.pruebaUsuario.usuarioES.util.MongoConfig;


@SpringBootApplication
@ComponentScan(basePackages = { "com.pruebaUsuario.usuarioES",
		"com.pruebaUsuario.usuarioES.controller",
		"com.pruebaUsuario.usuarioES.service",
		"com.pruebaUsuario.usuarioES.util" })
public class UsuarioEsApplication implements CommandLineRunner{

   // public static void main(String[] args) {
 
    	//public static void main(String[] args) {
    		//SpringApplication.run(UsuarioEsApplication.class, args);

    	
    	

        @Override
        public void run(String... arg0) throws Exception {
            if (arg0.length > 0 && arg0[0].equals("exitcode")) {
                throw new ExitException();
            }
        }

        public static void main(String[] args) throws Exception {
            new SpringApplication(UsuarioEsApplication.class).run(args);
        }

        static class ExitException extends RuntimeException implements ExitCodeGenerator {
            private static final long serialVersionUID = 1L;

            @Override
            public int getExitCode() {
                return 10;
            }

        }

       /* @Bean
        public WebMvcConfigurer webConfigurer() {
            return new WebMvcConfigurer() {
            };
        }*/

    	
    	
        /*AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
 
        Usuario user = new Usuario("01","", ""); 
        UsuarioInterno interno = usuarioService.findInterno(user);
        System.out.println("\nFind One:- " + interno);
        System.out.println("\nFind User Internal All!!");
 
 
       user = new Usuario("02","Maria", "Silva");
       UsuarioExterno externo = usuarioService.findExterno(user);
        System.out.println("\nFind By User = " + externo);
       
        
        System.out.println("\nFind All!!");
 
 
        context.close();
        
    }*/

}
