public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Musica X");

        aparelhoTelefonico.ligar("(00)00000-0000");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("www.site.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
