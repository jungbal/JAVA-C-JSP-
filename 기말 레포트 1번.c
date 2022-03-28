#include <stdio.h>
int main(void)
{
	int a,b,c;
	for(a=1;a<=5;a++){
		for(b=1;b<=5-a;b++){
			printf(" ");
			}
			for(c=1;c<=a;c++){
				printf("*");
			}
			for(c=1;c<=a-1;c++){
				printf("*");
			}
		printf("\n");
	}
	return 0;
 } 
