package PrecificacaoServicos;

/**
 *
 * @author Cecilia Paiva
 */
public class CustoseTempo {
    //Atributos de tempo
    private int semanas;
    private int dias;
    private float horas;
    private int tempo;
    private int horasInt;
    //Metódo
    public int calcularTempo(int semanas, int dias, float horas){
        this.horasInt = (int)Math.ceil(horas);
        this.tempo = this.semanas * this.dias * this.horasInt;
        return this.tempo;
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

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setHorasInt(int horasInt) {
        this.horasInt = horasInt;
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

    public int getTempo() {
        return tempo;
    }

    public int getHorasInt() {
        return horasInt;
    }
    
    
}
