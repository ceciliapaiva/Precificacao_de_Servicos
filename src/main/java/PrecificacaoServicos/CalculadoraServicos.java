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
        // Calculo do valor por hora 
        int sem = 0;
        int d = 0;
        float hrs = 0.0f;
        float valorHora = 0.0f;
        float custosVida = 0.0f;
        float diasAtivosPorMes = 0.0f;
        // Calcular valor sugerido
        float custosServico = 0.0f;
        float tempoGasto = 0.0f;
        String strLucroComPercentual = "";
        String strLucroSemPercentual = "";
        float margemLucro = 0.0f; 
        
        // Instanciando classes 
        CustoseTempo calculadora = new CustoseTempo(sem, d, hrs, custosVida, diasAtivosPorMes, custosServico, margemLucro, tempoGasto);
        Scanner leitor = new Scanner(System.in);
        
        // Calcular o VALOR POR HORA de trabalho mensal 
        System.out.println("VAMOS CALCULAR SEU PREÇO POR HORA");
        System.out.println("Qual o seu custo de vida por mês? ");
        custosVida = leitor.nextFloat();
        System.out.println("Quantas semanas você trabalha por mês? ");
        sem = leitor.nextInt();
        System.out.println("Quantos dias por semana? ");
        d = leitor.nextInt();
        System.out.println("Quantas horas por dia? ");
        hrs = leitor.nextFloat();
        valorHora = calculadora.valorPorHora(custosVida, diasAtivosPorMes);
        System.out.println("Seu valor por hora de trabalho é " + valorHora);
   
        // Calculando o valor sugerido 
        System.out.println("Qual é o custo do serviço/projeto? ");
        calculadora.setCustosDoServico(leitor.nextFloat());
        System.out.println("Qual a margem de lucro desejada em cima desse custo? ");
        // Criamos uma STR para pegar o numero com % e outra para retirar esse %
        // e com o Float.parseFloat() convertemos STR para float
        strLucroComPercentual = leitor.next();
        strLucroSemPercentual = strLucroComPercentual.replace("%", " ");
        margemLucro = Float.parseFloat(strLucroSemPercentual);
        //Para certificar se a margem de lucro será um valor positivo
        if(margemLucro > 0){
            calculadora.setMargemDeLucro(margemLucro);
        }else {
            while(margemLucro < 0){
                System.out.print("Ops, a margem de lucro inserida, não é um valor positivo. Tente novamente inserindo uma porcentagem positiva.");
                System.out.println("Qual a margem de lucro desejada em cima desse custo? ");
                strLucroComPercentual = leitor.next();
                strLucroSemPercentual = strLucroComPercentual.replace("%", " ");
                margemLucro = Float.parseFloat(strLucroSemPercentual);
            }
        }
        System.out.println("Quanto tempo você gastará para executar este serviço/projeto? ");
        calculadora.setTempoGastoServico(leitor.nextFloat());
        float valorServico = calculadora.valorSugerido();
        System.out.println("O valor sugerido é R$ " + valorServico);
  
        System.out.println("ATENÇÃO\nLeve em consideração o seu nível de experiência.");
    }
}
