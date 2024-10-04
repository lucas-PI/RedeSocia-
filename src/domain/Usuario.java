package domain;

import service.ServiceUsuario;

public class Usuario {

    private String nome;
    private String email;
    private  String dataNascimento;
    private  final ServiceUsuario serviceUsuario;


    public Usuario(String nome, String email, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.serviceUsuario = new ServiceUsuario();
    }

    public ServiceUsuario getServiceUsuario() {
        return serviceUsuario;
    }

    public String getNome(){

        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Usuario: " +
                "nome: " + nome + '\'' +
                ", email: " + email + '\'' +
                ", dataNascimento: " + dataNascimento + '\'' +
                ", serviceUsuario=" + serviceUsuario;
    }

    public String exibirInfo(){
        return toString();
    }

}
