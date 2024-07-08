public class Concerto extends Evento{

    public Concerto(String nome, String data, String hora, String local, int quant_ingressos, double preco_ingresso) {
        super(nome, data, hora, preco_ingresso);
        this.local = local;
        this.quant_ingressos = quant_ingressos;
    }

}
