#include<stdio.h>

void test(void);
double x=0.01;

int main(void)
{
	double x=0.5;
	
	while(1) {
		double x=1.23;
		printf("in while block: x=%f\n", x);
		if(x>1)
		break;
	}
	printf("in main block: x=%f\n", x);
	test();
	
	printf("2020-09-14,21:04,20204133,ÀÌÁ¤¿ø");
	
	return 0;
}

void test(void)
{
	x*=10;
	printf("in test block: x=%f\n", x);
}
