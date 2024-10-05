package service;

import domain.Postagem;
import domain.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUsuario {

    private ArrayList<Postagem> postagens = new ArrayList<>();


    public String exibirInfo(Usuario usuario){
        return usuario.toString();
    }
    public int Idade(String dataNascimento){
        DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasicmentoFormatada  = LocalDate.parse(dataNascimento,formatador);
        return calcularIdade(dataNasicmentoFormatada);
    }

    public int calcularIdade(LocalDate dataNacismento){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNacismento,dataAtual).getYears();
    }

    Scanner input = new Scanner(System.in);

    public Postagem criarPostagem(String nome){
        System.out.print("Conteudo: ");
        String conteudo = input.next();
        LocalDate datapost = LocalDate.now();
        return new Postagem(conteudo, datapost, nome);
    }
    public void savePostagem(Postagem postagem){
        postagens.add(postagem);
    }

    public  ArrayList<Postagem> getPostagens() {
        return postagens;
    }

    private void setPostagens(ArrayList<Postagem> postagens) {
        this.postagens = postagens;
    }
}
