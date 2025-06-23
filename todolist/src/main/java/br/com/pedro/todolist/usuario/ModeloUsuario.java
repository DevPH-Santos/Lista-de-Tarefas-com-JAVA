package br.com.pedro.todolist.usuario;

import lombok.Data;

@Data//quando se usa essa biblioteca não precisa colocar mais os getters e setters
public class ModeloUsuario {
    
    private String username;
    private String nome;
    private String senha;

}
