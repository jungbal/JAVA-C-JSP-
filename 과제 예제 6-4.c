#include<stdio.h>

int get_factorial(int num)
{
	int i;
	int result=1;
	
	for(i=1;i<=num;i++)
	result*=i;
	return result;
}

int main(void)
{
	int i;
	int fact;
	
	for(i=1;i<=5;i++)
	{
		fact=get_factorial(i);
		printf("%2d!=%3d\n", i, fact);
	}
	get_factorial(5);
	
	printf("2020-09-14,20:25,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}
