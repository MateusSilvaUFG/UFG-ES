#include <stdio.h>

int main()  {

    double fahrenheit,polegadas, celsius, mm;

    scanf("%lf",&fahrenheit);
    scanf("%lf",&polegadas);

    celsius = (5*(fahrenheit-32))/9;
    mm = polegadas*25.4;

    printf("O VALOR EM CELSIUS = %.2lf\n", celsius);
    printf("A QUANTIDADE DE CHUVA E = %.2lf\n", mm);

}