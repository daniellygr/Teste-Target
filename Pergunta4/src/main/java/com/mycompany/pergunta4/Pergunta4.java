package com.mycompany.pergunta4;

import java.text.DecimalFormat;

/**
 *
 * @author Danielly Rocha
 */
public class Pergunta4 {

    public static void main(String[] args) {
        
        /*Instanciar o objeto 'df' por meio da classe DecimalFormat com a finalidade 
        de colocar a máscara de 2 digitos e porcentagem na saída dos valores*/
        
        DecimalFormat df = new DecimalFormat("00,00%");
        
        //Atribuir os valores fornecidos às variáveis do tipo double de cada estado
        double estadoSp = (double) 67836.43;
        double estadoRj = (double) 36678.66;
        double estadoMg = (double) 29229.88;
        double estadoEs = (double) 27165.48;
        double outrosEstados = (double) 19849.53;
        
        /*Realizar a adição dos valores de todos os estados e atribui-la
        à variável 'soma' do tipo double*/
        double soma = estadoSp + estadoRj + estadoMg + estadoEs + outrosEstados;
        
        /*Realizar o cálculo da contrbuição de cada estado em % e atribuir à
        respectiva variável*/
        double contribuicaoSP = (estadoSp / soma) * 100;
        double contribuicaoRJ = (estadoRj / soma) * 100;
        double contribuicaoMG = (estadoMg / soma) * 100;
        double contribuicaoES = (estadoEs / soma) * 100;
        double contribuicaoOutros = (outrosEstados / soma) * 100;
        
        //Imprimir a saída calculada e aplicar a máscara do objeto 'df'
        System.out.println("Contribuicao SP: " + df.format(contribuicaoSP));
        System.out.println("Contribuicao RJ: " + df.format(contribuicaoRJ));
        System.out.println("Contribuicao MG: " + df.format(contribuicaoMG));
        System.out.println("Contribuicao ES: " + df.format(contribuicaoES));
        System.out.println("Contribuicao outros: " + df.format(contribuicaoOutros));
    }
}
