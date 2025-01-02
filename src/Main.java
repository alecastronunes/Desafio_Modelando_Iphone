import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone15Pro = new Iphone();
        Iphone iphoneSE = new Iphone();

        iphone15Pro.selecionarMusica("Fear of the Dark");
        iphone15Pro.tocar();
        iphone15Pro.pausar();
        iphone15Pro.ligar("958214569");
        iphone15Pro.atender();
        iphone15Pro.iniciarCorreioVoz();
        iphone15Pro.exibirPagina("https://www.dio.me/");
        iphone15Pro.adicionarNovaAba();
        iphone15Pro.atualizarPagina();

        iphoneSE.selecionarMusica("Toxicity");
        iphoneSE.tocar();
        iphoneSE.pausar();
        iphoneSE.ligar("982653132");
        iphoneSE.atender();
        iphoneSE.iniciarCorreioVoz();
        iphoneSE.exibirPagina("https://stackoverflow.com/");
        iphoneSE.adicionarNovaAba();
        iphoneSE.atualizarPagina();
    }
}