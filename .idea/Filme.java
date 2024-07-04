public class Filme extends Evento{

    public Filme(String nome, String data, String hora, String local, float preco_ingresso){
        super(nome, data, hora, local, preco_ingresso);
        this.quant_ingressos = 200;
    }

}
