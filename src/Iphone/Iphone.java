package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + "'" + musica + "'" + " via iPhone!!!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via iPhone!!!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada via iPhone!!!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo ligação via iPhone para o número: " + numero + "!!!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação via iPhone!!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz vi iPhone!!!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web via iPhone através da seguinte URL: " + url + "!!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba da web via iPhone!!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web via iPhone!!!");
    }
}
