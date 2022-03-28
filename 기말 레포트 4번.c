#include <stdio.h>
int main(void)
{
	int a,b,c;
	for(a=1;a<=3;a++){
		for(b=1;b<=3-a;b++){
			printf(" ");
		}
		for(c=1;c<=a;c++){
			printf("*");
		}
		for(c=1;c<=a-1;c++){
			printf("*");
		}
		for(c=1;c<=a;c++){
			printf("*");
		}
		for(c=1;c<7-a;c++){
			printf("*");
		}
		printf("\n");
	}
	for(a=1;a<=5;a++){
		for(b=1;b<=a;b++){
			printf(" ");
		}
		for(c=1;c<=6-a;c++){
			printf("*");
		}
		for(c=1;c<=5-a;c++){
			printf("*");
		}
		printf("\n");
	}
	return 0;
 } 
