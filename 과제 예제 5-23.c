#include<stdio.h>

int main(void)
{
	int i;
	
	for(i=10;i>0;i--)
	{
		if(i%3==0)
		goto quit;
		printf("%d ", i);
	}
	quit:
	printf("\n");
	
	printf("2020-09-14,17:20,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}
