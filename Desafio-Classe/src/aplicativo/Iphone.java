package aplicativo;
import interfaces.Internet;
import interfaces.Musica;
import interfaces.Telefone;
import java.util.Scanner;


public class Iphone implements Telefone, Musica, Internet {

    @Override
    public void ligar() { // ligando iPhone... telefone
        System.out.println("Ligando iPhone...");
    }
    @Override
    public void atender() { // atendendo chamada iPhone... telefone

        System.out.println("Atendendo chamada iPhone...");
    }
    @Override
    public void iniciar() { // iniciando aplicativos iPhone... telefone

        System.out.println("Iniciando aplicativos iPhone...");
    }

    @Override
    public void correioVoz() { // correio de voz iPhone... telefone
        System.out.println("Escutando mensagem de voz iPhone...");
    }

    // iniciando métodos da interface Musica

    @Override
    public void tocar() { // tocando música iPhone... musica
        System.out.println("Tocando a música favorita no iPhone...");
    }

    @Override
    public void pausa() { // pausando música iPhone... musica
        System.out.println("Pausando a música no iPhone...");
    }
    @Override
    public void selecionarMusica() { // selecionando música iPhone... musica
        System.out.println("Selecionando uma música favorita no iPhone...");
    }

    // iniciando métodos da interface Internet

    @Override
    public void exibirPagina() { // acessando página web iPhone... internet
        System.out.println("Acessando a página web favorita no iPhone...");
    }

    @Override
    public void adicionarNovaAba() { // adicionando nova aba iPhone... internet
        System.out.println("Adicionando uma nova aba no iPhone...");
    }
    @Override
    public void atualizarPagina() { // atualizando página web iPhone... internet
        System.out.println("Atualizando a página web favorita no iPhone...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcao;
        do { 
            System.out.println("Selecione uma opção a seguir: \n[1]- Ligar\n[2]- Atender chamada\n[3]- Iniciar aplicativos \n[4]- Escutar mensagem de voz\n[5]- Tocar música\n[6]- Pausar música\n[7]-Selecionar música\n[8]- Acessar página web\n[9]- Adicionar nova aba\n[10]- Atualizar página web\n[0]- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciar();
                    break;
                case 4:
                    iphone.correioVoz();
                    break;
                case 5:
                    iphone.tocar();
                    break;
                case 6:
                    iphone.pausa();
                    break;
                case 7:
                    iphone.selecionarMusica();
                    break;
                case 8:
                    iphone.exibirPagina();
                    break;
                case 9:
                    iphone.adicionarNovaAba();
                    break;
                case 10:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
    } while (opcao!= 0);

}


}

