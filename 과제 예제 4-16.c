#include<stdio.h>

int main(void)
{
	int a=10, b=20, c=30;
	int result;
	
	result=a+b*c;
	printf("result=%d\n", result);
	
	result=(a+b)*c;
	printf("result=%d\n", result);
	
	result=a<b&&c<0;
	printf("result=%d\n", result);
	
	printf("2020-09-13,00:13,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}
