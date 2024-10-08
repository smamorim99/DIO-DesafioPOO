public class Funcionalidades implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public String selecionarMusica(String musica){
        if (musica == null || musica.isEmpty()) {
            musica = "Tocando agora";
        }
        return "tocando musica" + musica;
    }
    public void tocarMusica() {
        System.out.println("tocando musica");
    }
    public void pausarMusica() {
            System.out.println("PAUSANDO Musica");
    }


    @Override
    public String exibirPagina(String url) {
        if (url == null || url.isEmpty()) {
            url = "url";
        }
        return "Acessando: " + url;
    }
    
    public void adicionarNovaAba() {
       System.out.println("abrindo nova guia");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }


    @Override
    public String ligar(String numero) {
        if (numero == null || numero.isEmpty()) {
            numero = "111111";
        }
        return "Chamando: " + numero;
    }
    
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    public void ouvirCorreioDeVoz() {
       System.out.println("Reproduzindo Correio de Voz...");
    }
}
