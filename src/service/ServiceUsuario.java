package service;

import domain.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ServiceUsuario {
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
}
