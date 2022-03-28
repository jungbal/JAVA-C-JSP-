#include<stdio.h>

int main(void)
{
	int a, b, c;
	double average;
	
	printf("정수 3개? ");
	scanf("%d %d %d", &a, &b, &c);
	
	average=(double)(a+b+c)/3;
	printf("평균: %f\n", average);
	
	printf("2020-09-13,00:07,20204133,이정원");
	
	return 0; 
 } 
