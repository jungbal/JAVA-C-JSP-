#include<stdio.h>

double get_area(double radius)
{
	const double PI=3.14159265359;
	return PI*radius*radius;
}

int main(void)
{
	int i;
	for(i=1;i<=5;i++)
	{
		printf("반지름이 %d일 때 원의 면적: %.2f\n", i, get_area(i));
	}
	printf("2020-09-14,20:28,20204133,이정원");
	
	return 0;
}
