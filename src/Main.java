import domain.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario conta1 = new Usuario("lucas","lucas22inacio@hotmail.com","22/11/2003");

        System.out.println(conta1.exibirInfo());

        conta1.criarPostagem();
        System.out.println(conta1.getServiceUsuario().getPostagens().get(0));
        conta1.criarPostagem();
        System.out.println(conta1.getServiceUsuario().getPostagens().get(1));


    }
}