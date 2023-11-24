package PrecificacaoServicos;

/**
 *
 * @author Cecilia Paiva
 * Esta aplicação será capaz de precificar serviços de variados nichos. 
 * Levamos em consideração o custo operacional, tempo de execução, margem de lucro.
 * Desconsiderando a concorrência e os preços do mercado. 
 */
import java.util.Scanner;
public class CalculadoraServicos {
    
    public static void main(String[] args) {
        float custos = 0.0f;
        float preco = 0.0f;
        String lucro = "";
        float lucroF = 0.0f;
        
        CustoseTempo calculadora = new CustoseTempo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual o seus custos por mês? ");
        custos = leitor.nextFloat();
        
        System.out.print("Quantas semanas você vai trabalhar pos mês? ");
        calculadora.setSemanas(leitor.nextInt());
        System.out.print("Quantos dias por mês? ");
        calculadora.setDias(leitor.nextInt());
        System.out.print("Quantas horas por mês? ");
        calculadora.setHorasInt(leitor.nextInt());
        
        preco = custos / calculadora.getTempo();
        
        System.out.print("Qual sua margem de lucro para esse serviço? (Não coloque o %)");
        //lucro = leitor.nextLine().trim();
        //lucroF = Float.parseFloat(lucro);
        lucroF = leitor.nextFloat();
        
        //Para certificar se a margem de lucro será um valor positivo
        if(lucroF > 0){
            preco = preco * (lucroF / 100);
            System.out.print("O preço sugerido para este projeto é R$" + preco);
        }else {
            System.out.print("A margem de lucro inserida, não é um valor positivo.");
        }   
    }
}
