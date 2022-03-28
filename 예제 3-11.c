#include <stdio.h>
#define PI 3.14
int main(void)
{
	double radius = 0;
	double area = 0;
	
	printf("반지름? ");
	scanf("%lf", &radius);
	
	area = PI * radius * radius;
	printf("원의 면적: %.2f\n", area);
	printf("PI = %.2f\n", PI);
	
	printf("2020-09-11,19:51,20204133,이정원");
	
	return 0; 
}
