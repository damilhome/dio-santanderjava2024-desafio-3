public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public void tocar() {
        System.out.println("TOCANDO");
    }

    public void pausar() {
        System.out.println("PAUSANDO");
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA " + musica);
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url) {
        System.out.println("ABRINDO PÁGINA " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PÁGINA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
