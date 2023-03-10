#include <stdio.h>

//Funções que serão chamadas e atribuídas ao longo do código
void imprimeNaoContido(int);
void imprimeContido(int);

int main (void) {

	int valorRecebido;
	int anterior = 0;
	int atual = 1;
	int proximoValor;	

	//Solicitar um valor ao usuário
	printf ("Digite um valor: ");
	//Armazenar o valor informado na variável do tipo inteiro 'valorRecebido'
	scanf ("%i", &valorRecebido);

	/*Validar o valor recebido: caso seja menor que zero, retornar para o usuário a função 'imprimeNaoContido'
	cujo intuito é imprimir o texto de que o valor informado não está contido na Sequência de Fibonacci*/
    if (valorRecebido < 0) {
        imprimeNaoContido(valorRecebido);
        return (0);
    }
	/*Validar o valor recebido: caso seja igual a zero, retornar para o usuário a Sequência de Fibonacci, cujo
	valor será somente o valor zero e também retornar a função 'imprimeContido', cujo intuito é imprimir o 
	texto de que o valor informado está contido na Sequência de Fibonacci*/
    if (valorRecebido == 0) {
        printf ("Sequencia de Fibonacci: ");
        printf ("%i", valorRecebido);
        imprimeContido(valorRecebido);
        return (0);
    }

	/*Caso o valor informado seja maior que zero, retornar para o usuário a Sequência de Fibonacci com os 
	valores 'anterior' e 'atual' que são variáveis do tipo inteiro e receberam os valores '0' e '1', 
	respectivamente*/
	printf ("Sequencia de Fibonacci: ");
	printf ("%i, %i", anterior, atual);

	/*Realizar o cálculo do próximo valor, por meio da variável 'proximoValor' da Sequência a partir das 
	variáveis 'anterior' e 'atual' e seus respectivos valores 0 e 1*/
	proximoValor = anterior + atual;

	/*Exibir para o usuário o valor da variável 'proximoValor' que foi previamente calculado, realizar a 
	atribuição dos 	novos valores para as variáveis 'anterior' e 'atual' e calcular o novo valor da variável
	'proximoValor': enquanto a variável 'proximoValor' da sequência for menor ou igual ao 'valorRecebido' 
	informado pelo usuário, a variável 'anterior' irá receber o valor da variável 'atual' e a variável 'atual' 
	irá receber o valor da variável 'proximoValor'*/
	while (proximoValor <= valorRecebido) {
		printf (", %i", proximoValor);
		anterior = atual;
		atual = proximoValor;
		proximoValor = anterior + atual;
	}
    
	/*Após o término do ciclo anterior, o valor da variável 'anterior' deverá ser subtraída da variável 
	'proximoValor', a fim de armazenar esse último dado e realizar a validação seguinte*/
    proximoValor = proximoValor - anterior;

	/*Validar se o valor da variável 'proximoValor' tem o mesmo valor da variável 'valorRecebido' pelo usuário;
	em caso afirmativo, retornar para o usuário a função 'imprimeContido'. Em caso negativo, retornar a 
	função 'mprimeNaoContido' para o usuário*/
	if (proximoValor == valorRecebido) {
		imprimeContido(valorRecebido);
	}
	else {
		imprimeNaoContido(valorRecebido);
	}

    return (0);

}

/*Atribuição da função 'imprimeNaoContido' com base no valor da variável 'valorRecebido' que foi informado
pelo usuário. Essa função tem a finalidade de imprimir o texto de que o valor informado não está contido
na Sequência de Fibonacci calculada*/
void imprimeNaoContido(int valorRecebido) {
    printf ("\nO valor %i nao esta contido na sequencia de Fibonacci", valorRecebido);
}

/*Atribuição da função 'imprimeContido' com base no valor da variável 'valorRecebido' que foi informado
pelo usuário. Essa função tem a finalidade de imprimir o texto de que o valor informado está contido
na Sequência de Fibonacci calculada*/
void imprimeContido(int valorRecebido) {
    printf ("\nO valor %i esta contido na sequencia de Fibonacci", valorRecebido);
}
