package br.com.pedro.todolist.usuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @PostMapping("/")
    public void create(@RequestBody ModeloUsuario modeloUsuario){//vai ta pegando as informações do corpo da requisição, tipo o POST do PHP
        System.out.println(modeloUsuario.username);
    }

}
