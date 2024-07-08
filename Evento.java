abstract class Evento {

    protected String nome;
    protected String data;
    protected String hora;
    protected String local;
    protected int quant_ingressos;
    protected double preco_ingresso;

    public Evento(String nome, String data, String hora, double preco_ingresso){
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco_ingresso = preco_ingresso;
    }

}
