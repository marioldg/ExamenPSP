#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));
    int numAleatorio = rand()%11;
    printf("%d",numAleatorio);

    return 0;
}



