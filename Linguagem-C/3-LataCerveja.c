#include <stdio.h>

int main (){
    double raio, altura, at, custo;

    scanf("%lf", &raio);
    scanf("%lf", &altura);

    at = (2*( 3.14159*(raio*raio)))+(2* 3.14159*raio*altura);

    custo = (at*100);
    
    printf("O VALOR DO CUSTO E = %.2lf\n",custo);
    }