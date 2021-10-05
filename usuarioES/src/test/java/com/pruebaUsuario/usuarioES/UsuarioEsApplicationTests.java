package com.pruebaUsuario.usuarioES;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pruebaUsuario.usuarioES.model.Usuario;
import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;
import com.pruebaUsuario.usuarioES.service.UsuarioService;
import com.pruebaUsuario.usuarioES.util.MongoConfig;



public class UsuarioEsApplicationTests {

    //public static void main(String args[]) {
 
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        
 
        Usuario user = new Usuario() {
		}; 
        
    /*    user.setId("01");
        user.setNombreUsuario("");
        user.setApellidoUsuario(" ");
        
        UsuarioInterno interno = usuarioService.findInterno(user);
        System.out.println("\nFind One:- " + interno);
        System.out.println("\nFind User Internal All!!");
 
 
       user = new UsuarioExterno("02","Maria", "Silva");
       UsuarioExterno externo = usuarioService.findExterno(user);
        System.out.println("\nFind By User = " + externo);
       
        
        System.out.println("\nFind All!!");
 
 
        context.close();*/
   // }


}
