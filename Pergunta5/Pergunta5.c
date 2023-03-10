#include <stdio.h>

int main(void) {

    int tamanhoPalavra;
    int i;

    //Solicitar o tamanho da palavra ao usuário para possibilitar a utilização de um vetor dinâmico
    printf ("Digite o tamanho da palavra: ");
    //Armazenar o tamanho da palavra em uma variável do tipo inteiro
    scanf ("%i", &tamanhoPalavra);

    /*Variável 'palavra' do tipo char que é um vetor com o tamanho da palavra informado;
    essa variável receberá a palavra do usuário*/
    char palavra[tamanhoPalavra];

    /*Variável 'palavraReversa' do tipo char que é um vetor com o tamanho da palavra informado;
    essa variável será responsável por armazenar os caracteres invertidos da variável 'palavra'*/
    char palavraReversa[tamanhoPalavra];

    //Solicitar a palavra ao usuário
    printf ("Digite uma palavra: ");
    //Armazenar a palavra na variável 'palavra' como String
    scanf ("%s", palavra);

    /*Percorrer o vetor palavraReversa a fim de receber os caracteres inversos: ao percorrer o vetor 
    'palavraReversa', o tamanho do vetor é decrescido do valor da variável 'i' e também de 1, visto que o
    último caractere de uma String é para a posição de memória e não deve ser considerado no recebimento 
    do caractere inverso do vetor 'palavra'*/
    for (i = 0; i < tamanhoPalavra; i++) {
        palavraReversa[tamanhoPalavra-i-1] = palavra[i];
    }

    /*Percorrer o vetor 'palavraReversa' para cada posição de 0 até tamanhoPalavra e exibir o caractere para o
    usuário*/
    for (i = 0; i <tamanhoPalavra; i++) {
        printf("%c", palavraReversa[i]);
    }

    return 0;
}