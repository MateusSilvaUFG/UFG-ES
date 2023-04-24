#include <stdio.h>

int main (){
    int x,y,z,pa=0,cont;
    scanf("%d %d %d",&x,&y,&z);
    
    for(cont = 0; cont<z; cont++){
        pa += x + cont*y;
    }
     printf("%d \n",pa);
}