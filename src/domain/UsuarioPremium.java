package domain;

public class UsuarioPremium extends Usuario{

    private boolean isDestaque;
    public UsuarioPremium(String nome, String email, String dataNascimento, boolean isDestaque) {
        super(nome, email, dataNascimento);
        this.isDestaque = isDestaque;
    }


}
