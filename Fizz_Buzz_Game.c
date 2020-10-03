/***************This same code can be compiled using C++ as well! *******/
#include <stdio.h> 
  
int main(void) 
{ 
    int i,n;
    printf("Till which number to count? :");
    scanf("%d",&n);
    for (i=1; i<=n; i++) 
    { 
        
        if (i%15 == 0)         
            printf ("FIZZ-BUZZ\t");     
        else if ((i%3) == 0)     
            printf("FIZZ\t");                  
        else if ((i%5) == 0)                        
            printf("BUZZ\t");                  
        else             
            printf("%d\t", i);                  
  
    } 
  
    return 0; 
} 