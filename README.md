```mermaid
classDiagram
    Iphone <-- NavegadorDeInternet
    Iphone <-- AparelhoTelefonico
    Iphone <-- ReprodutorMusical  
    
    Iphone:NavegaorDeInternet
    Iphone:AparelhoTelefonico
    Iphone:ReprodutorMusical
    class NavegadorDeInternet{
       ExibirPagina = String url 
       adicionarNovaAba() 
       atualizarPagina()
    }
    class AparelhoTelefonico{
      +String ligar()
      +atender()
      +iniciarCorreioDeVoz()
    }
    class ReprodutorMusical{
    +SelecionarMusica = String musica
    +tocar()
    +pausar()
    }
