/*
Run ---> Generate JavaDoc
https://www.dummies.com/programming/java/how-to-use-javadoc-to-document-your-classes/
*/


/**
*Exemplo básico de um comentário. 
*@author jonatas alves da silva
*@author www.jonatasalves.com
*@version 1.0
*@since 02/11/2018 
* 
* Classe para objetos do tipo funcionário, para manipular
* informações sobre os funcionários.
*/

public class SampleJavaDoc {
      private String matricula;
      private Double salario;
/**
 * Método para retorno matricula do funcionário.
 * @return String numero da matricula.
 */      
      public String getMatricula() {
            return this.matricula;
      }
      
/**
 * Método para retorno do salário do funcionário
 * @return double salário.
 */      
      public double getSalario() {
            return this.salario;
      }
      
/**
 * Método para diaria com base no salário do funcionário dividido
 * pelo mês comercial de 30 dias para efeito * de cálculo de ajuda
 * de custo para viagem.
 * @param diasViagem int - Valor total das vendas do mês
 * @param valorDeslocamento Double - Valor pago em cada diária
 * despesas básicas de deslocamento.
 * @return Double - Valor da diaria.
 */    
      
      public Double calculaAjudaCusto(int diasViagem, Double valorDeslocamento)
              throws ArithmeticException {
            try {
                  return (this.salario / 30) *
                          diasViagem + valorDeslocamento;
            } catch (Exception e) {
                  return  0.0;
            }
      }
}
// Alterado da web by jonatadev@gmail.com
// Alterado do netbeans 9.0.