#include <stdio.h>

int main(){
    int x,y;
    int aux=0;


    scanf("%d %d", &x, &y );
    if(x%2==0){
        while(aux<y){
                printf("%d ", x);
                x=x+2;
            aux++;
             }
             printf("\n");
                    }
    else printf("O PRIMEIRO NUMERO NAO E PAR\n");
            }