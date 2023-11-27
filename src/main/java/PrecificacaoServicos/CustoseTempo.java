package PrecificacaoServicos;
public class CustoseTempo {
    //Atributos de tempo
    private int semanas;
    private int dias;
    private float horas;
    
    // Construtor 
    public CustoseTempo(int semanas, int dias, float horas){    
        setSemanas(semanas);
        setDias(dias);
        setHoras(horas);
    }

    //Metódo para calcular o tempo 
    public float calcularTempo() {
        return (float)(this.semanas * this.dias) * (this.horas);        
    }
    
    // Setters de tempo 
    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }
    
    // Getters de tempo 
    public int getSemanas() {
        return semanas;
    }

    public int getDias() {
        return dias;
    }

    public float getHoras() {
        return horas;
    }
}
