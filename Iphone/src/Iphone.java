public class Iphone {
    public static void main(String[] args) {
        Funcionalidades iphone = new Funcionalidades();
            ReprodutorMusical spotify = iphone;
            AparelhoTelefonico telefone = iphone;
            NavegadorInternet navegador = iphone;
        
            spotify.selecionarMusica(null);
            spotify.tocarMusica();
            spotify.pausarMusica();

            
            telefone.ligar("1111111");
            telefone.atender();
            telefone.ouvirCorreioDeVoz(); 
            
            navegador.exibirPagina("https://www.mermaidchart.com/raw/2814ba39-f61f-46f1-963d-59a4649ba8b3?theme=light&version=v0.1&format=svg");
            navegador.atualizarPagina();
            navegador.adicionarNovaAba();
            
            
    

}
}