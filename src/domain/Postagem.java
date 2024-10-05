package domain;

import service.ServicePostagem;

import java.time.LocalDate;

public class Postagem {
    private String conteudo;
    private LocalDate datapost;
    private String usuarioDaPostagem;
    private ServicePostagem servicePostagem;


    public Postagem(String conteudo,LocalDate datapost, String usuarioDaPostagem) {
        this.conteudo = conteudo;
        this.datapost = datapost;
        this.usuarioDaPostagem = usuarioDaPostagem;
        this.servicePostagem = new ServicePostagem();
    }

    public ServicePostagem getServicePostagem() {
        return servicePostagem;
    }

    public void setServicePostagem(ServicePostagem servicePostagem) {
        this.servicePostagem = servicePostagem;
    }

    public LocalDate getDatapost() {
        return datapost;
    }

    private void setDatapost(LocalDate datapost) {
        this.datapost = datapost;
    }

    public String getUsuarioDaPostagem() {
        return usuarioDaPostagem;
    }

    public void setUsuarioDaPostagem(String usuarioDaPostagem) {
        this.usuarioDaPostagem = usuarioDaPostagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "conteudo='" + conteudo + '\'' +
                ", datapost=" + datapost +
                ", usuarioDaPostagem='" + usuarioDaPostagem + '\'' +
                '}';
    }
}
