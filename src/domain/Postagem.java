package domain;

public class Postagem {
    private String conteudo;
    private String datapost;
    private String usuarioDaPostagem;

    public Postagem(String conteudo,String datapost, String usuarioDaPostagem) {
        this.datapost = datapost;
        this.usuarioDaPostagem = usuarioDaPostagem;
    }

    public String getDatapost() {
        return datapost;
    }

    public void setDatapost(String datapost) {
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
}
