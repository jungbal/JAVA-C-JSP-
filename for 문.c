#include <stdio.h>
int main(void)
{
	int a;
	for(a=1;a<101;a++){
		if(a*=4==0)
		printf("4의배수합: %d", a);
	}
	return 0; 
}
