public interface ReprodutorMusical {

    public void tocarMusica();

    public void pausarMusica();

    public default  void selecionarMusica(){
        String proxMusica = "Reproduzir Proxima Musica";
    }
       
    }


