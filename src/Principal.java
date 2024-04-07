import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Buscador novaBusca = new Buscador();
        System.out.println("Digite um CEP para busca, somente os números.");
        Scanner scanner = new Scanner(System.in);
        try {
            Endereco novoEndereco = novaBusca.buscarEndereco(scanner.nextLine());
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}
