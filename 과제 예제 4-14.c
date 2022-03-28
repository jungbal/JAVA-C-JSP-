#include<stdio.h>

int main(void)
{
	short a, b, c;
	
	printf("정수 2개? ");
	scanf("%hd %hd", &a, &b);
	
	printf("%d*%d=%d\n", a, b, a*b);
	printf("sizeof(a*b)=%d\n", sizeof(a*b));
	
	c=a*b;
	printf("c=%d\n", c);
	printf("sizeof(c)=%d\n", sizeof(c));
	
	printf("2020-09-13,00:02,20204133,이정원");
	
	return 0; 
 } 
