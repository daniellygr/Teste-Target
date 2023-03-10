package com.mycompany.pergunta3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.text.DecimalFormat; 

/**
 *
 * @author Danielly Rocha
 */
public class Pergunta3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        /*Instanciar o objeto 'df' por meio da classe DecimalFormat com a finalidade 
        de colocar a máscara de 4 casas decimais e o símbolo de Real (R$)*/
        DecimalFormat df = new DecimalFormat("R$ ##,000.0000");
        
        /*Instanciar o objeto 'gson' por meio da classe Gson*/
        Gson gson = new Gson();
       
        /*Instanciar o objeto 'reader' por meio da Classe Reader com a finalidade de
        ler o arquivo do tipo 'json'*/
        Reader reader = new FileReader("src\\main\\java\\resources\\dados.json");
        
        /*Instanciar o objeto 'listType' por meio da classe Type e criar o ArrayList
        com a classe Faturamento, atribuindo lendo os dados do arquivo Json*/
        Type listType = new TypeToken<ArrayList<Faturamento>>() {}.getType();
        ArrayList<Faturamento> faturamentos = new Gson().fromJson(reader, listType);
        
        /*Variáveis 'totalValor' do tipo double e 'diasUteis' do tipo inteiro
        iniciadas com o valor '0'*/
        double totalValor = 0;
        int diasUteis = 0;
        /*Variáveis 'maiorValor' do tipo double iniciada com o valor 0 e 'menorValor'
        do tipo double iniciada com o valor 100000*/
        double maiorValor = 0;
        double menorValor = 100000;
        
        /*Percorrer a ArrayList faturamentos de '0' até o tamanho dela*/
        for (int i = 0; i < faturamentos.size(); i++) {
            
            /*Instanciar o objeto faturamento por meio da classe Faturamento
            com o objetivo de atribuir os valores do objeto 'faturamentos' à posição
            'i' da ArrayList*/
            Faturamento faturamento = faturamentos.get(i);
            
            /*Validação: caso o 'valor' do objeto 'faturamento' na posição 'i' seja
            maior que o 'maiorValor' atribuído acima, então o 'maiorValor' passará
            a ter o valor do objeto 'faturamento' na posição 'i'. Validação na iteração
            realizada a fim de encontrar o maior faturamento do 'valor' do 'dados.json'*/
            if (faturamento.getValor() > maiorValor) {
                maiorValor = faturamento.getValor();
            }
            /*Validação: caso o 'valor' do objeto 'faturamento' na posição 'i' seja
            menor que o 'menorValor' atribuído acima e também diferente de zero (
            para que os finais de semana e feriados não sejam incluidos), 
            então o 'menorValor' passará a ter o valor do objeto 'faturamento' 
            na posição 'i'. Validação na iteração realizada a fim de encontrar o 
            menor faturamento do 'valor' do 'dados.json'*/
            else if (faturamento.getValor() < menorValor && faturamento.getValor() != 0) {
                menorValor = faturamento.getValor();
            }
            
            /*Validação: caso o 'valor' do objeto 'faturamento' na posição 'i' seja
            maior que zero, então o 'totalValor' atribuído acima somará esse 'valor' a ele 
            e a variável 'diasUteis' terá 1 unidade somada a ela*/
            if (faturamento.getValor() > 0) {
                totalValor += faturamento.getValor();
                diasUteis = diasUteis + 1;
            }
           
        }
        /*Imprimir o menor e o maior valor de faturamento ocorrido no mês aplicando
        a máscara do objeto 'df' da classe DecimalFormat*/
        System.out.println("Menor valor de faturamento ocorrido no mês: " + df.format(menorValor));
        System.out.println("Maior valor de faturamento ocorrido no mês: " + df.format(maiorValor));
        
        /*Variável 'media' do tipo double a fim de realizar o calculo da média abaixo*/
        double media;
        /*Variável 'diasSuperiores' do tipo inteiro iniciada em zero, cuja finalidade
        será calcular a quantidade de dias nos quais o faturamento foi superior à média*/
        int diasSuperiores = 0;
       
        /*Calcualr a média por meio das variáveis 'totalValor' e 'diasUteis' resultantes
        da iteração e atribuir o resultado à variável 'media'*/
        media = totalValor / diasUteis;
       
        /*Percorrer o ArrayList de '0' até o tamanho dela*/
        for (int i = 0; i < faturamentos.size(); i++) {
           
            /*Instanciar o objeto faturamento por meio da classe Faturamento
            com o objetivo de atribuir os valores do objeto 'faturamentos' à posição
            'i' da ArrayList*/
            Faturamento faturamento = faturamentos.get(i);
           
            /*Validação: caso o 'valor' do objeto 'faturamento' na posição 'i' seja
            maior que o valor da variável 'media', então 1 unidade será adicionada à
            variável 'diasSuperiores'. O objetivo é calcular a quantidade de dias
            cujo faturamento foi superior à média*/
            if (faturamento.getValor() > media){
               
               diasSuperiores = diasSuperiores + 1;
            }
        } 
        
        /*Imprimir para o usuário a quantidade de dias no mês nos quais o faturamento
        foi superior à média mensal utilizando a variável 'diasSuperiores'*/
        System.out.println("Quantidade de dias no mês nos quais o faturamento "
                + "diário foi superior à média mensal: " + diasSuperiores + " dias");
                     
        }
    
}