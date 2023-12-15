package PrecificacaoServicos;
public class CustoseTempo {
    //Atributos de tempo
    private int semanas;
    private int dias;
    private float horas;
    // Para calcular valorPorHora
    private float custoDeVida;
    private float trabalhoPorMes;
    // Calcular valorSugerido
    private float custosDoServico;
    private float margemDeLucro;
    private float tempoGastoServico;
    
    // Construtor 
    public CustoseTempo(int semanas, int dias, float horas, float custoDeVida, float trabalhoPorMes, float custosDoServico, float margemDeLucro, float tempoGastoServico) {
        this.semanas = semanas;
        this.dias = dias;
        this.horas = horas;
        this.custoDeVida = custoDeVida;
        this.trabalhoPorMes = trabalhoPorMes;
        this.custosDoServico = custosDoServico;
        this.margemDeLucro = margemDeLucro;
        this.tempoGastoServico = tempoGastoServico;
    }

    //Metódo para calcular o valor por hora de trabalho = custoDeVida / trabalhoPorMes 
    public float valorPorHora(float custoDeVida, float trabalhoPorMes) {   
        trabalhoPorMes = (float)(this.semanas * this.dias * this.horas);  
        return custoDeVida / trabalhoPorMes;
    }
    
    // Metódo para calcular o valorSugerido = (custosDoServiços + (custosDoServiços * margemDeLucro);
    // valorSugerido = (tempoGastoServico *  precoPorHoras) + custosDoServico;
    public float valorSugerido() {
        float precoPorHora = valorPorHora(custoDeVida, trabalhoPorMes);
        custosDoServico += (custosDoServico * margemDeLucro);
        return (tempoGastoServico * precoPorHora) + custosDoServico;
    }
    
    // Setters
    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public void setCustoDeVida(float custoDeVida) {
        this.custoDeVida = custoDeVida;
    }

    public void setTrabalhoPorMes(float trabalhoPorMes) {
        this.trabalhoPorMes = trabalhoPorMes;
    }

    public void setCustosDoServico(float custosDoServico) {
        this.custosDoServico = custosDoServico;
    }

    public void setMargemDeLucro(float margemDeLucro) {
        this.margemDeLucro = margemDeLucro;
    }

    public void setTempoGastoServico(float tempoGastoServico) {
        this.tempoGastoServico = tempoGastoServico;
    }
    
    // Getters
    public int getSemanas() {
        return semanas;
    }

    public int getDias() {
        return dias;
    }

    public float getHoras() {
        return horas;
    }

    public float getCustoDeVida() {
        return custoDeVida;
    }

    public float getTrabalhoPorMes() {
        return trabalhoPorMes;
    }

    public float getCustosDoServico() {
        return custosDoServico;
    }

    public float getMargemDeLucro() {
        return margemDeLucro;
    }

    public float getTempoGastoServico() {
        return tempoGastoServico;
    }
}
