public class Funcionalidades implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public static void main(String[] args) throws Exception {
        
        
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando: Turn So Cold by Drowning Pool");
    }
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }
    public void selecionarMusica(){
        String proxMusica = "Reproduzir Proxima Musica";
    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo celular");
    }

    @Override
    public void ouvirCorreioDeVoz() {
        System.out.println("Ouvindo Correio de Voz");
    }


}
