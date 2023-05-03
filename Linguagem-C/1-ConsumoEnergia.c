#include <stdio.h>

 int main(){
    double Salario, qkw,resultado;

    scanf("%lf", &Salario);
    scanf("%lf", &qkw);

    resultado = ((qkw*(Salario*0.7))/100);
    
    printf("Custo por kW: R$ %.2lf\n",(resultado/qkw));
    printf("Custo do consumo: R$ %.2lf\n",resultado);
    printf("Custo com desconto: R$ %.2lf\n",(resultado*0.9));
    }