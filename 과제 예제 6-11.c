#include<stdio.h>

void test_local(void);

int main(void)
{
	int num=0;
	
	printf("main: num=%d\n", num);
	test_local();
	
	printf("2020-09-14,20:56,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}

void test_local(void)
{
	int num=100;
	
	num++;
	printf("test_local: num=%d\n", num);
 } 
