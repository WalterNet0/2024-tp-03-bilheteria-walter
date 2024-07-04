abstract class Evento {

    protected String nome;
    protected String data;
    protected String hora;
    protected String local;
    protected int quant_ingressos;
    protected float preco_ingresso;

    public Evento(String nome, String data, String hora, String local, float preco_ingresso){
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.preco_ingresso = preco_ingresso;
    }

}
