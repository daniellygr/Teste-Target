package com.mycompany.pergunta3;

/**
 *
 * @author Danielly Rocha
 */

/*Criando a classe 'Faturamento' para utilização no programa principal
A classe terá os mesmos objetos e tipos do arquivo 'dados.json'*/
class Faturamento {
    
    private int dia;
    private double valor;
    
    public Faturamento() {}
    
    public Faturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
