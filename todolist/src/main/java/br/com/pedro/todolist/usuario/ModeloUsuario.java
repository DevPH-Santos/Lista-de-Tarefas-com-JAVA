package br.com.pedro.todolist.usuario;

public class ModeloUsuario {
    
    private String username;
    private String nome;
    private String senha;

    //setters
    //username
    public void setUsername(String username) {
        this.username = username;
    }

    //nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //senha
    public void setSenha(String senha) {
        this.senha = senha;
    }


    //getters
    //username
    public String getUsername() {
        return username;
    }

    //nome
    public String getNome() {
        return nome;
    }

    //senha
    public String getSenha() {
        return senha;
    }

}
