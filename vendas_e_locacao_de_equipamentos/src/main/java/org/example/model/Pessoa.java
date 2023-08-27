package org.example.model;

public abstract class Pessoa extends EntityId {
    //classe abstrata pois não será instanciada diretamente
    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    public String getNome() {
        return nome;
    }

    public abstract String getDocumentoPrincipal ();
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
