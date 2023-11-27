package PrecificacaoServicos;

/** 
 * @author ceciliapaiva.pro@gmail.com
 * Esta aplicação será capaz de precificar serviços de variados nichos. 
 * Levamos em consideração o custo operacional, tempo de execução, margem de lucro.
 * Desconsiderando a concorrência e os preços do mercado. 
 */
import java.util.Scanner;
public class CalculadoraServicos {
    
    public static void main(String[] args) {
        float custos = 0.0f;
        float precoPorHoras = 0.0f;
        String strLucroComPercentual = "";
        String strLucroSemPercentual = "";
        float lucro = 0.0f;
        int sem = 0;
        int d = 0;
        float hrs = 0.0f;
        float tempo = 0.0f;
        
        CustoseTempo calculadora = new CustoseTempo(sem, d, hrs);
        Scanner leitor = new Scanner(System.in);
        
        // Calculando o preço por horas 
        System.out.print("Qual os seus gastos por mês? ");
        custos = leitor.nextFloat();
        
        System.out.print("Quantas semanas você vai trabalhar neste projeto/serviço? ");
        calculadora.setSemanas(leitor.nextInt());
        System.out.print("Quantos dias por semana você vai trabalhar neste projeto/serviço?? ");
        calculadora.setDias(leitor.nextInt());
        System.out.print("Quantas horas por dia você vai trabalhar neste projeto/serviço? ");
        calculadora.setHoras(leitor.nextFloat());
        tempo = calculadora.calcularTempo();
        // Criamos uma STR para pegar o numero com % e outra para retirar esse %
        // e com o Float.parseFloat() convertemos STR para float
        System.out.print("Qual sua margem de lucro para esse serviço?");
        strLucroComPercentual = leitor.next();
        strLucroSemPercentual = strLucroComPercentual.replace("%", " ");
        lucro = Float.parseFloat(strLucroSemPercentual);
   
        //Para certificar se a margem de lucro será um valor positivo
        if(lucro > 0){
            lucro = lucro / 100;
            precoPorHoras = (custos / tempo) * lucro;
            precoPorHoras += custos / tempo;
            System.out.print("O valor sugerido é R$" + (precoPorHoras * tempo) + " com base no seu preço por horas e tempo de trabalho no projeto.");
        }else {
            System.out.print("A margem de lucro inserida, não é um valor positivo.");
        }
        System.out.print("ATENÇÃO\nLeve em consideração o seu nível de experiência.");
    }
}
