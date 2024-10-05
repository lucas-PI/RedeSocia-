package domain;

import service.ServiceUsuario;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;
    private  String dataNascimento;
    private int idade;

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

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        setIdade(idadeUsuario(dataNascimento));
        return "nome: " + nome + '\n' +
                "email: " + email + '\n' +
                "idade: : " + idade;
    }

    public String exibirInfo(){
        return toString();
    }

    public void criarPostagem(){
         serviceUsuario.savePostagem(serviceUsuario.criarPostagem(getNome()));
    }

    private int idadeUsuario(String dataNasci){
        return serviceUsuario.Idade(dataNasci);
    }



}
